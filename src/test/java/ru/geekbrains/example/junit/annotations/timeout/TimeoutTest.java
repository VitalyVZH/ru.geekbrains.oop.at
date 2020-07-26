package ru.geekbrains.example.junit.annotations.timeout;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;

public class TimeoutTest {

    @Timeout(value = 2)
    @Test
    void name1() {
        System.out.println("123");
    }

    @Timeout(value = 2)
    @Test
    void name2() throws InterruptedException {
        System.out.println("456");
        sleep(3000);
    }
}
