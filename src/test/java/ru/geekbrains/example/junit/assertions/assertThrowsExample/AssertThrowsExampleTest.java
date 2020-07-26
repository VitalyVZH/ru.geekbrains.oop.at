package ru.geekbrains.example.junit.assertions.assertThrowsExample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssertThrowsExampleTest {

    @Test
    void name1() {
        File file = new File("src/test/resources/text.txt2");

        //Scanner scanner = new Scanner(file);

        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }

    @Test
    void name2() {
        File file = new File("src/test/resources/text.txt");

        //Scanner scanner = new Scanner(file);

        Assertions.assertThrows(FileNotFoundException.class,
                () ->new Scanner(file));
    }
}
