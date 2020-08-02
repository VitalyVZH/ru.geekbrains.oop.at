package ru.geekbrains.example.incheckexception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object integer = 1;
        // неправильный перевод значения
        String string = (String) integer;
        // правильный перевод значения
        // String string = String.valueOf(integer);

    }
}
