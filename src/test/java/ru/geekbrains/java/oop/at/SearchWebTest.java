package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.SearchPage;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Поисковый тест")
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

    @BeforeEach
    void beforeEach() {

        SearchPage searchPage = new SearchPage(driver);

        //      Перейти на сайт https://geekbrains.ru/courses

        driver.get("https://geekbrains.ru/courses");

//        searchPage.getButtonClosePopUp1().click();
        searchPage.getButtonClosePopUp2().click();

//      В поле Поиск ввести текст: java

        searchPage.getSearchBar().click();
        searchPage.getSearchQuery().sendKeys("java");

        wait15second = new WebDriverWait(driver, 15);

    }

    @DisplayName("Проверка количества профессий")
    @Test
    void professions() {

//      Проверить что на странице: Профессий не менее чем 2

        assertThat(Integer.parseInt(driver.findElement
                (By.xpath("//a[@class='search-page-tabs__item' " +
                        "and @data-tab='professions']/span"))
                        .getText())
                , greaterThanOrEqualTo(2));

    }

    @DisplayName("Проверка количества курсов")
    @Test
    public void courses() {

//      Курсов более 15

        assertThat(Integer.parseInt(driver.findElement
               (By.xpath("//a[@class='search-page-tabs__item' " +
                       "and @data-tab='courses']/span"))
               .getText()), greaterThan(15));

    }

    @DisplayName("Проверка количества вебинаров")
    @Test
    public void webinars() {

//      Вебинаров больше чем 180, но меньше 300

        assertThat(Integer.parseInt(driver.findElement
                (By.xpath("//a[@class='search-page-tabs__item' " +
                        "and @data-tab='webinars']/span")).getText()), allOf(
                greaterThan(180),
                lessThan(300))
        );
    }

    @DisplayName("Проверка наличия и порядкового номера раздела")
    @Test
    public void juniors() {

//  В вебинарах отображается первым “Java Junior. Что нужно знать для успешного собеседования?”

        WebElement junior = driver
                .findElement(By.xpath("(//a[@href='/events/6'])[2]"));

        wait15second.until(ExpectedConditions.visibilityOf(junior));

        assertThat(junior.getText()
                 , equalTo("Java Junior. Что нужно знать для успешного собеседования?"));

    }

    @DisplayName("Проверка количества блогов")
    @Test
    public void blogs() {

//        Блогов более 300

        assertThat(Integer.parseInt(driver
                .findElement(By.xpath("//a[@class='search-page-tabs__item' " +
                        "and @data-tab='blogs']/span")).getText())
                , greaterThan(300));
    }

    @DisplayName("Проверка количества форумов")
    @Test
    public void forums() {

//        Форумов не 350

        assertThat(Integer.parseInt(driver
                .findElement(By.xpath("//a[@class='search-page-tabs__item' " +
                        "and @data-tab='forums']/span")).getText())
                , not(equalTo(350)));
    }
    @DisplayName("Проверка количества тестов")
    @Test
    public void tests() {

//        Тестов не 0

        assertThat(Integer.parseInt(driver
                        .findElement(By.xpath("//a[@class='search-page-tabs__item' " +
                                "and @data-tab='tests']/span")).getText())
                , not(equalTo(0)));
    }

    @DisplayName("Проверка раздела Проекты и компании")
    @Test
    public void geekbrains() {

//        В Проектах и компаниях отображается GeekBrains

        WebElement gb = driver
                .findElement(By.xpath("//a[contains(text(), 'GeekBrains')]"));

        wait15second.until(ExpectedConditions.visibilityOf(gb));

        assertThat(gb.getText()
                , containsString ("GeekBrains"));
    }
}