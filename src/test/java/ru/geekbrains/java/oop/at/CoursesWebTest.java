package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;
import ru.geekbrains.java.oop.at.page.CoursesPage;
import ru.geekbrains.java.oop.at.page.ContentPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

       /*
        1. Перейти на страницу авторизация https://geekbrains.ru/login
        2. Ввести логин : hks47018@eoopy.com
        3. Пароль: hks47018
        4. Нажать кнопку войти
        5. Проверить что отобразилась страница "Главная"
        6. Нажать в навигации "Курсы"
        7. Нажать в шапке сайта "Курсы"
        8. Выбрать в фильтрах чекбокс "Бесплатные"
        9. Выбрать в фильтрах чекбокс "Тестирование"
        10. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
        11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"
        */

@DisplayName("Домашнее задание 5")
public class CoursesWebTest extends BaseWebTest {


    @DisplayName("Авторизация и другие проверки")
    @Test
    public void MainTest() {

        CoursesPage coursesPage = new CoursesPage(driver);

        driver.get("https://geekbrains.ru/");

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");


        coursesPage.getButtonCourses().click();

        new ContentPage(driver)
                .checkNamePage("Курсы");

        coursesPage.getLinkCourses().click();

        coursesPage.getBoxFree().click();
        coursesPage.getBoxTester().click();

        coursesPage.getTestingCourse1().getText().equals("Тестирование ПО. Уровень 1");
        coursesPage.getTestingCourse2().getText().equals("Тестирование ПО. Уровень 2");

    }
}
