package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.ContentPage;

@Feature("Навигация")
@Story("Проверка навигации по странице курсы")
@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebTest {

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

    @BeforeEach
    public void beforeEach() {

        driver.get("https://geekbrains.ru/events");
        wait15second = new WebDriverWait(driver, 15);
    }

    @CsvSource({
            "'Вебинары'",
            "'Курсы'",
            "'Форум'",
            "'Блог'",
            "'Тесты'",
            "'Карьера'"
    })


    @DisplayName("Проверка загрузки страниц")
    @ParameterizedTest
    public void allTests(String namePage) {

        ContentPage contentPage = new ContentPage(driver);

        contentPage.getNavigation().getButton(namePage).click();
        // отключение popUp
        //contentPage.getButtonClosePopUp1().click();
        //contentPage.getButtonClosePopUp2().click();
        contentPage.checkNamePage(namePage);

        wait15second.until(ExpectedConditions.visibilityOf(contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(contentPage.getFooter()));
    }
}
