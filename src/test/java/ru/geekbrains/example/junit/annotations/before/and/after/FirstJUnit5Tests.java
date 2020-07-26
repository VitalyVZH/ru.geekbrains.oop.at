package ru.geekbrains.example.junit.annotations.before.and.after;

import org.junit.jupiter.api.Test;
import ru.geekbrains.example.junit.annotations.before.and.after.base.BaseTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstJUnit5Tests extends BaseTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
        System.out.println("myFirstTest");

    }

    @Test
    void test2() {
        assertEquals(3, 1 + 1);
        System.out.println("test2");
    }
}
