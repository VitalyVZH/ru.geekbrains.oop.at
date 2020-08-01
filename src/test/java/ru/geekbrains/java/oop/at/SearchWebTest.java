package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.ContentPage;
import ru.geekbrains.java.oop.at.page.SearchPage;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Поиск")
public class SearchWebTest extends BaseWebTest {

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


    @DisplayName("Проверка количества контента")
    @Test
    void searchTest() {

        SearchPage searchPage = new SearchPage(driver);

        new SearchPage(driver)
                .openUrl();

        //      Авторизация на сайте

        //driver.get("https://geekbrains.ru/");

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new SearchPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");

        // Перейти на сайт https://geekbrains.ru/courses

        wait15second = new WebDriverWait(driver, 15);
        searchPage.getButtonCourses().click();

        new ContentPage(driver)
                .checkNamePage("Курсы");

//        searchPage.getButtonClosePopUp1().click();
//        searchPage.getButtonClosePopUp2().click();

//      В поле Поиск ввести текст: java

        searchPage.getSearchBar().click();
        searchPage.getSearchQuery().sendKeys("java");

        wait15second = new WebDriverWait(driver, 25);

//        Профессий не менее чем 2

       assertThat(Integer.parseInt(searchPage.getCountProfessions().getText()), greaterThanOrEqualTo(2));

//        Курсов более 15

        assertThat(Integer.parseInt(searchPage.getCountCourses().getText()), greaterThan(15));

//      Вебинаров больше чем 180, но меньше 300

        assertThat(Integer.parseInt(searchPage.getCountWebinars().getText()), allOf(
                greaterThan(180),
                lessThan(300)
        ));

//        Блогов более 300

        assertThat(Integer.parseInt(searchPage.getCountBlogs().getText()), greaterThan(300));

//        Форумов не 350

        assertThat(Integer.parseInt(searchPage.getCountForums().getText()), not(equalTo(350)));

//        Тестов не 0

        assertThat(Integer.parseInt(searchPage.getCountTests().getText()), not(equalTo(0)));

    }
}