package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

public class UserInteractionService {

    private final Scanner scanner = new Scanner(System.in);

    public void processFilesCatalog(Map<String,String> filesCatalog) {
        while (true) {
            System.out.print("Введите имя файла для работы или quit для завершения работы: ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                System.out.println("File Library Processor stopped.");
                return;
            }
            if (!filesCatalog.containsKey(input)) {
                System.out.println("Имя файла " + input + " не существет.");
                continue;
            }
            String filePath = filesCatalog.get(input);
            String fileName = filePath + input;
            printFile(fileName);
            editFile(fileName);
            printFile(fileName);
        }
    }

    private void editFile(String fileName) {
        while (true) {
            System.out.print("Введите строку, которую вы хотите добавить в файл или quit для завершения редактирования: ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                System.out.println("Редактирование файла " + fileName + " завершено.");
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), StandardCharsets.UTF_8))) {
                writer.newLine();
                writer.write(input);
                writer.flush();
            } catch (IOException e) {
                System.err.println("Ошибка при записи в файл: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public void printFile(String fileName) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
