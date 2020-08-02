package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;

@Feature("Авторизация")
@Story("Проверка авторизации на главной странице")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация с корректными данными")
    @Test
    public void auth() {

        driver.get("https://geekbrains.ru/");

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");
    }
}
