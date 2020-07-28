package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.junit.jupiter.params.ParameterizedTest;
import ru.geekbrains.java.oop.at.base.BaseTestNavigation;


public class NavigationTest extends BaseTestNavigation {

    /*
    1. Перейти на сайт geekbrains.ru/courses
    2. Нажать на кнопку Курсы
    3. Проверить что страница Курсы открылась
    4. Повторить для:
        - Курс
        - Вебинары
        - Форум
        - Блог
        - Тесты
        - Карьера
    */

    @CsvSource({
            "'Вебинары', 'events'",
            "'Курсы', 'courses'",
            "'Форум', 'topics'",
            "'Блог', 'posts'",
            "'Тесты', 'tests'",
            "'Карьера', 'career'"
    })


    @DisplayName("Проверка загрузки страниц")
    @ParameterizedTest
    public void allTests(String name, String url) {

        driver.findElement(By.cssSelector("[class=\"gb-left-menu__nav\"] [href='/" + url + "']"))
                .click();
        Assertions.assertEquals(
                name,
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }
}
