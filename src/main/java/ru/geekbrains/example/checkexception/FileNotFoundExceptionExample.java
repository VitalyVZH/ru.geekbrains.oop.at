package ru.geekbrains.example.checkexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) {

        try {
            System.out.println("До запроса файла");
            checkFile();
            System.out.println("После запроса файла");
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения");
            e.printStackTrace();
        } finally {
            System.out.println("Печатается в любом случае");

        }

        System.out.println("Программа выполнилась до конца");

        // бросить исключение
        throw new NullPointerException("!!!");
    }

    public static void checkFile() throws FileNotFoundException {
        File file = new File("src/test/resources/text.txt");
        Scanner scanner = new Scanner(file);
    }
}
