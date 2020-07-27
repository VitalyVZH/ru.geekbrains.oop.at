package ru.geekbrains.example.hamcrest.greater.than;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class IntegerTest {

    @DisplayName("Сравнение двух чисел")
    @Test
    void greaterThanTest() {

        int numberActual = 100;
        int numberExpected = 99;

        MatcherAssert.assertThat(numberActual,
                greaterThan(numberExpected)
        );
    }

    @DisplayName("Больше или равно с проверкой их равенства")
    @Test
    void greaterThanOrEqualToTest() {

        double numberActual = 100.00;
        double numberExpected = 100.00;

        MatcherAssert.assertThat(numberActual,
                greaterThanOrEqualTo(numberExpected)
        );
    }

    @DisplayName("Меньше или равно с проверкой их равенства")
    @Test
    void lessThanOrEqualToTest() {

        double numberActual = 100.00;
        double numberExpected = 101.00;

        MatcherAssert.assertThat(numberActual,
                lessThanOrEqualTo(numberExpected)
        );
    }

    @DisplayName("Равно с погрешностью")
    @Test
    void closeToTest() {

        double numberActual = 100.00;
        double numberExpected = 100.10;

        MatcherAssert.assertThat(numberActual,
                closeTo(numberExpected, 1)
        );
    }

    @DisplayName("Все проверки сразу")
    @Test
    void allTests() {

        double numberActual = 100.00;
        double numberExpected = 99.00;

        MatcherAssert.assertThat(numberActual,allOf(
                greaterThan(numberExpected),
                lessThanOrEqualTo(101.00),
                closeTo(numberActual, 1)
        ));

    }
}
