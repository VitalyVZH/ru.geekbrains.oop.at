package ru.geekbrains.example.junit.annotations.repeated;

public class RepeatedTest {

    @org.junit.jupiter.api.RepeatedTest(value = 3)
    void name() {
        System.out.print("123");
    }
}
