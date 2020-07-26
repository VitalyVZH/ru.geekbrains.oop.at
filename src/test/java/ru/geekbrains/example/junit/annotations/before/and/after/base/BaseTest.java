package ru.geekbrains.example.junit.annotations.before.and.after.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("BaseTest beforeAll");
    }

    @BeforeEach
    void setUp1() {
        System.out.println("BaseTest setUp1");

    }

    @BeforeEach
    void setUp2() {
        System.out.println("BaseTest setUp2");

    }

    @AfterEach
    void tearDown() {
        System.out.println("BaseTest tearDown");

    }

    @AfterAll
    static void afterAll() {
        System.out.println("BaseTest afterAll");

    }
}
