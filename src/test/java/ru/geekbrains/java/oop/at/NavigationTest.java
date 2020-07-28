package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
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

    @DisplayName("Проверка загрузки страницы Вебинары")
    @Test
    public void events() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-webinar\"]"))
                .click();
        Assertions.assertEquals(
                "Вебинары",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @DisplayName("Проверка загрузки страницы Курсы")
    @Test
    public void courses() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-courses\"]"))
                .click();
        Assertions.assertEquals(
                "Курсы",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        //chromeDriver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click();
        driver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]"))
                .click();

    }

    @DisplayName("Проверка загрузки страницы Форум")
    @Test
    public void forum() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-forum\"]"))
                .click();
        Assertions.assertEquals(
                "Форум",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @DisplayName("Проверка загрузки страницы Блоги")
    @Test
    public void blogs() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-blog\"]"))
                .click();
        Assertions.assertEquals(
                "Блог",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        driver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]"))
                .click();
        driver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

    }

    @DisplayName("Проверка загрузки страницы Тесты")
    @Test
    public void tests() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-tests\"]"))
                .click();

        Assertions.assertEquals(
                "Тесты",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

    @DisplayName("Проверка загрузки страницы Карьера")
    @Test
    public void career() {

        driver.findElement(By.cssSelector("[class=\"svg-icon icon-career\"]"))
                .click();
        Assertions.assertEquals(
                "Карьера",
                driver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

}
