package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseTestSearch;


public class SearchTest extends BaseTestSearch {

    /*
    Перейти на сайт https://geekbrains.ru/courses
    Нажать на кнопку Поиск
    В поле Поиск ввести текст: java
    Проверить что на странице:
    Профессий не менее чем 2
    Курсов более 15
    Вебинаров больше чем 180, но меньше 300
    В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”
    Блогов более 300
    Форумов не 350
    Тестов не 0
    В Проектах и компаниях отображается GeekBrains
    */

    @Test
    public void professions() {

//      Проверить что на странице: Профессий не менее чем 2

        Assertions.assertTrue((Integer.parseInt(chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='professions']/span")
                .getText())) >= 2, "Условию задачи соотвествует. Найдено не менее двух профессий");
    }

    @Test
    public void courses() {

//      Курсов более 15

        Assertions.assertTrue((Integer.parseInt(chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='courses']/span")
                .getText())) > 15, "Условию задачи соотвествует. Найдено более 15 курсов");

    }

    @Test
    public void webinars() {

//      Вебинаров больше чем 180, но меньше 300

        WebElement webinars = chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='webinars']/span");

        Assertions.assertTrue((Integer.parseInt(webinars.getText()) > 180)
                        & (Integer.parseInt(webinars.getText()) < 300),
                "Условию задачи соотвествует. Вебинаров более 180, но менее 300");
    }

    @Test
    public void juniors() {

        WebElement junior = chromeDriver
                .findElementByXPath("(//a[@href='/events/6'])[2]");

        wait15second.until(ExpectedConditions.visibilityOf(junior));

        Assertions.assertEquals("Java Junior. Что нужно знать для успешного собеседования?", junior.getText());

    }

    @Test
    public void blogs() {

//        Блогов более 300

        Assertions.assertTrue((Integer.parseInt(chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='blogs']/span")
                .getText())) > 300, "Условию задачи соотвествует. Найдено более 300 блогов");

    }

    @Test
    public void forums() {

//        Форумов не 350

        Assertions.assertTrue((Integer.parseInt(chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='forums']/span")
                .getText())) != 300, "Условию задачи соотвествует. Форумов не 350");

    }

    @Test
    public void tests() {

//        Тестов не 0

        Assertions.assertTrue((Integer.parseInt(chromeDriver
                .findElementByXPath("//a[@class='search-page-tabs__item' and @data-tab='tests']/span")
                .getText())) != 0, "Условию задачи соотвествует. Количество тестов не равно 0");

    }

    @Test
    public void geekbrains() {

//        В Проектах и компаниях отображается GeekBrains

        Assertions.assertNotNull(chromeDriver
                .findElementByXPath("//a[contains(text(), 'GeekBrains')]"), "GeekBrains");

    }

}
