package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.block.SearchTabsBlock;
import ru.geekbrains.java.oop.at.page.content.TestPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

    /*
    Перейти на сайт https://geekbrains.ru/courses
    Нажать на кнопку Поиск
    В поле Поиск ввести текст: java
    Проверить что на странице:
    Профессий не менее чем 2
    Курсов более 15
    Вебинаров больше чем 180, но меньше 300
    Блогов более 300
    Форумов не 350
    Тестов не 0
    */

@Feature("Поиск")
@Story("Проверка количества контента")
@DisplayName("Поиск")
public class SearchWebTest extends BeforeAndAfterStep {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    void searchTest() {

        new TestPage(driver)
                .openUrl()
                .getHeader()
                .searchText("java")
                .getSearchTabsBlock()
                .checkCount(SearchTabsBlock.Tab.PROFESSIONS, greaterThanOrEqualTo(2))
                .checkCount(SearchTabsBlock.Tab.COURSES, greaterThan(15))
                .checkCount(SearchTabsBlock.Tab.WEBINARS, allOf(greaterThan(180), lessThan(300)))
                .checkCount(SearchTabsBlock.Tab.BLOGS, greaterThan(300))
                .checkCount(SearchTabsBlock.Tab.FORUMS, not(350))
                .checkCount(SearchTabsBlock.Tab.TESTS, not(0));
    }
}