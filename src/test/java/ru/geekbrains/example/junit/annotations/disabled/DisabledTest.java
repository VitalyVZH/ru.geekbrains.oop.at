package ru.geekbrains.example.junit.annotations.disabled;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Disabled
    @Test
    void name() {
        Assertions.fail();
    }
}
