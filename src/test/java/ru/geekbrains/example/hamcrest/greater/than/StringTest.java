package ru.geekbrains.example.hamcrest.greater.than;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class StringTest {

    @DisplayName("Проверка совпадения")
    @Test
    void equalToIgnoringCaseTest() {

        String name1 = "Лорд";
        String name2 = "лоРД";

        MatcherAssert.assertThat("ЛоРд", equalToIgnoringCase(name1));
    }

    @DisplayName("Содержит строку")
    @Test
    void containsStringTest() {

        String name = "Лорд собака кошка имя";

        MatcherAssert.assertThat(name, containsString("кошка"));
    }

    @DisplayName("Оканчивается на строку")
    @Test
    void endsWithTest() {

        String name = "Лорд собака кошка имя";

        MatcherAssert.assertThat(name, endsWith("имя"));
    }

    @DisplayName("Игнорирование пробелов")
    @Test
    void equalToCompressingWhiteSpaceTest() {

        String name = "Лорд собака        кошка имя";

        MatcherAssert.assertThat(name
                , equalToCompressingWhiteSpace("Лорд собака кошка имя"));
    }


}
