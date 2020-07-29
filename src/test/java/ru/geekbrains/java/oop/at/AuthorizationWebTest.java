package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.AuthorizationPage;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {

        driver.get("https://geekbrains.ru/");

        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");

//        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
//
//        authorizationPage.getInputLogin().sendKeys("hks47018@eoopy.com");
//        authorizationPage.getInputPassword().sendKeys("hks47018");
//        authorizationPage.getButtonSighIn().click();
////        driver.findElement(By.id("user_email")).sendKeys("hks47018@eoopy.com");
////        driver.findElement(By.id("user_password")).sendKeys("hks47018");
////        driver.findElement(By.cssSelector("[class=\"form-group\"] [type=\"submit\"]")).click();

//        BasePage basePage = new BasePage(driver);
//        basePage.checkNamePage("Главная");
    }
}
