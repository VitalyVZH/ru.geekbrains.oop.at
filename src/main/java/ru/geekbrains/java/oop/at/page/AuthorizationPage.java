package ru.geekbrains.java.oop.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(id = "registration-form-button")
    private WebElement buttonSighIn;

    private WebDriver driver;

    public AuthorizationPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContentPage authorization(String login, String password) {

        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSighIn.click();

        return new ContentPage(driver);
    }

    public WebElement getInputLogin() {
        return inputLogin;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getButtonSighIn() {
        return buttonSighIn;
    }
}
