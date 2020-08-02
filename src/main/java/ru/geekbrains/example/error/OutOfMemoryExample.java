package ru.geekbrains.example.error;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {

    static final List<Object[]> arrays = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            arrays.add(new Object[100000000]);
        }
    }
}
