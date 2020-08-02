package ru.geekbrains.example.incheckexception;

public class StringIndexOutOfBoundsExample {

    public static void main(String[] args) {

        // обращение к 7 символу, когда всего 6 (от 0 до 6)
        String name = "человек";
        System.out.println(name.charAt(7));
    }
}
