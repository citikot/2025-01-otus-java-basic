package simple_calculator.client;

import simple_calculator.exceptions.CalculatorProcessingException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {

    public static void main(String[] args) {

        System.out.println("Приложение калькулятор стартовало!");

        String response;
        Scanner scanner = new Scanner(System.in);

        try (Socket socket = new Socket("localhost", 8981)) {
            try (
                    DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream())
            ) {
                response = inputStream.readUTF();
                System.out.println(response);
                while (true) {
                    System.out.print("Введите через пробел данные в формате <операнд1> <операнд2> <операция> (exit для завершения работы): ");
                    String userMessage = scanner.nextLine();
                    System.out.println();

                    if (userMessage.equalsIgnoreCase("exit")) {
                        outputStream.writeUTF(userMessage);
                        outputStream.flush();
                        break;
                    }

                    if (!validateUserMessage(userMessage)) {
                        System.out.println("Неверный формат ввода. Повторите.");
                        continue;
                    }

                    outputStream.writeUTF(userMessage);
                    outputStream.flush();

                    response = inputStream.readUTF();
                    System.out.println("Результат: " + response);
                }

            } catch (IOException e) {
                throw new CalculatorProcessingException("Ошибка выполнения в калькуляторе: " + e.getMessage());
            }
        } catch (
                IOException e) {
            throw new CalculatorProcessingException("Ошибка выполнения в калькуляторе: " + e.getMessage());
        }

        System.out.println("Приложение калькулятор завершило работу!");
    }

    private static boolean validateUserMessage(String userMessage) {
        System.out.println("[" + userMessage + "]");
        return userMessage.matches("^\\d+\\s+\\d+\\s+[+*/\\-]$");
    }

}