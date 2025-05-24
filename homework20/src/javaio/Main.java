package javaio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName;
        String subStr;
        StringBuilder str = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        fileName = scanner.nextLine();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            System.out.print("Введите подстроку для подсчета вхождений в файле: ");
            subStr = scanner.nextLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.append(line);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
            return;
        }

        int count = countSubstring(str.toString(), subStr);
        System.out.printf("Подстрока %s встречается в файле %s %d раз(а).%n", subStr, fileName, count);
    }

    public static int countSubstring(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }
}
