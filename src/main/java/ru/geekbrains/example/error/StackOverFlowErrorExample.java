package ru.geekbrains.example.error;

public class StackOverFlowErrorExample {
    public static void main(String[] args) {
        example();
    }

    public static int number = 0;
    public static int example() {
        System.out.println(number++);
        return example();
    }
}
