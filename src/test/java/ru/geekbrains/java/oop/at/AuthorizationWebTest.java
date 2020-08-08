package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.page.sign.AuthorizationPage;

@Execution(ExecutionMode.CONCURRENT)
@Feature("Авторизация")
@Story("Проверка авторизации на главной странице")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BeforeAndAfterStep {

    @DisplayName("Успешная авторизация с корректными данными")
    @Test
    void events() {

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .openUrl()
                .authorization(login, password)
                .checkNamePage("Главная");
    }
}
