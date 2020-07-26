package ru.geekbrains.example.junit.assertions.assertAll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertAllExampleTest {

    @Test
    void name() {
        assertAll("Пользователь",
                () -> assertEquals("Сергей", "Сергей"),
                () -> assertEquals("Иван", "Степан"),
                () -> assertEquals("Петр", "Петр")
        );
    }

}
