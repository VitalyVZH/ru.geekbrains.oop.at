package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    public void headerFooter() {
        WebElement header = chromeDriver
                .findElementById ("top-menu");
        WebElement footer = chromeDriver
                .findElementByCssSelector("footer[class=\"site-footer\"]");

        wait15second.until(ExpectedConditions.visibilityOf(header));
        wait15second.until(ExpectedConditions.visibilityOf(footer));
    }

    @Test
    public void events() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-webinar\"]").click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        headerFooter();

    }

    @Test
    public void courses() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-courses\"]").click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        //chromeDriver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click();
        chromeDriver.findElementByCssSelector("button [class=\"svg-icon icon-popup-close-button \"]").click();

        headerFooter();
    }

    @Test
    public void forum() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-forum\"]").click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        headerFooter();
    }

    @Test
    public void blogs() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-blog\"]").click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        chromeDriver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click();
        chromeDriver.findElementByCssSelector("button [class=\"svg-icon icon-popup-close-button \"]").click();

        headerFooter();
    }

    @Test
    public void tests() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-tests\"]").click();

        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        headerFooter();
    }

    @Test
    public void career() {

        chromeDriver.findElementByCssSelector("[class=\"svg-icon icon-career\"]").click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElementByCssSelector("[id=\"top-menu\"] h2").getText()
        );

        headerFooter();
    }


    @AfterEach
    public void afterAll(){
        chromeDriver.quit();
    }
}
