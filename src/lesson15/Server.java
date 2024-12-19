package lesson15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private static final String HEADER_TEXT = "Mikhalishin Maksim 23I0066";

    public static void main(String[] args) throws Exception {
        int port = 1313;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен на порту " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                } catch (Exception e) {
                    System.err.println("Ошибка обработки клиента: " + e.getMessage());
                }
            }
        }
    }

    private static void handleClient(Socket clientSocket) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        OutputStream out = clientSocket.getOutputStream();

        // Читаем HTTP-запрос
        String line = in.readLine();
        if (line == null || !line.startsWith("GET")) {
            sendResponse(out, 405, "USE GET!!!");
            return;
        }

        // Извлекаем путь и параметры
        String[] requestParts = line.split(" ");
        if (requestParts.length < 2) {
            sendResponse(out, 400, "Uncorrected response.");
            return;
        }

        String path = requestParts[1];
        if (!path.startsWith("/calculate")) {
            sendResponse(out, 404, "Resource not found.");
            return;
        }

        String query = path.contains("?") ? path.substring(path.indexOf("?") + 1) : "";
        Map<String, String> queryParams = parseQueryParams(query);

        try {
            double a = Double.parseDouble(queryParams.getOrDefault("a", "0"));
            double b = Double.parseDouble(queryParams.getOrDefault("b", "0"));
            String op = queryParams.get("op");

            double result = calculate(a, b, op);
            String body = HEADER_TEXT + "\n\nResult: " + result;
            sendResponse(out, 200, body);
        } catch (IllegalArgumentException | NullPointerException e) {
            String body = HEADER_TEXT + "\n\nError: " + e.getMessage();
            sendResponse(out, 400, body);
        }
    }

    private static double calculate(double a, double b, String op) {
        if (op == null) {
            throw new IllegalArgumentException("Operation parameter is null.");
        }
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupportable operation: " + op);
        }
    }

    private static Map<String, String> parseQueryParams(String query) {
        Map<String, String> params = new HashMap<>();
        if (query == null || query.isEmpty()) {
            return params;
        }
        String[] pairs = query.split("&");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                params.put(keyValue[0], keyValue[1]);
            }
        }
        return params;
    }

    private static void sendResponse(OutputStream out, int statusCode, String message) throws Exception {
        String statusLine = "HTTP/1.1 " + statusCode + " " + getReasonPhrase(statusCode) + "\r\n";
        String headers = "Content-Type: text/plain\r\nContent-Length: " + message.getBytes().length + "\r\n\r\n";

        out.write((statusLine + headers + message).getBytes());
        out.flush();
    }

    private static String getReasonPhrase(int statusCode) {
        switch (statusCode) {
            case 200:
                return "OK";
            case 400:
                return "Bad Request";
            case 404:
                return "Not Found";
            case 405:
                return "Method Not Allowed";
            default:
                return "Internal Server Error";
        }
    }
}
