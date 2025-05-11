package simple_calculator.server;

import simple_calculator.exceptions.CalculatorProcessingException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatingServer {

    public static void main(String[] args) {
        System.out.println("Сервер калькулятора стартовал!");

        try (ServerSocket serverSocket = new ServerSocket(8981)) {
            while (true) {
                try {
                    Socket client = serverSocket.accept();
                    System.out.println("Клиент с портом " + client.getPort() + " подключился к серверу-калькулятору");
                    try (
                            DataInputStream inputStream = new DataInputStream(client.getInputStream());
                            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream())
                    ) {
                        outputStream.writeUTF("Список разрешенных операций: +, -, *, /");
                        outputStream.flush();

                        boolean clientActive = true;
                        while (clientActive) {
                            try {
                                String userInput = inputStream.readUTF();
                                if ("exit".equalsIgnoreCase(userInput)) {
                                    clientActive = false;
                                    System.out.println("Работа с клиентом завершена!");
                                } else {
                                    Double result = processUserInput(userInput);
                                    outputStream.writeUTF(result.toString());
                                    outputStream.flush();
                                }
                            } catch (IOException e) {
                                throw new CalculatorProcessingException("Ошибка выполнения на сервере: " + e.getMessage());
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new CalculatorProcessingException("Ошибка выполнения на сервере: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            throw new CalculatorProcessingException("Ошибка выполнения на сервере: " + e.getMessage());
        }

    }

    private static Double processUserInput(String userInput) {
        String[] userInputParts = userInput.split(" ");
        return switch (userInputParts[2]) {
            case "+" -> Double.parseDouble(userInputParts[0]) + Double.parseDouble(userInputParts[1]);
            case "-" -> Double.parseDouble(userInputParts[0]) - Double.parseDouble(userInputParts[1]);
            case "*" -> Double.parseDouble(userInputParts[0]) * Double.parseDouble(userInputParts[1]);
            case "/" -> Double.parseDouble(userInputParts[0]) / Double.parseDouble(userInputParts[1]);
            default -> throw new IllegalStateException("Unexpected value: " + userInputParts[2]);
        };
    }
}