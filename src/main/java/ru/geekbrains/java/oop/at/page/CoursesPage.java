package ru.geekbrains.java.oop.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CoursesPage extends PageFactory{

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(id = "registration-form-button")
    private WebElement buttonSighIn;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    @FindBy (id = "cour-link")
    private WebElement linkCourses;

    @FindBy (id = "filter-0")
    private WebElement boxFree;

    @FindBy (id = "filter-9")
    private WebElement boxTester;

    @FindBy (xpath = "//a[@href='/courses/84']//span")
    private WebElement testingCourse1;

    @FindBy (xpath = "//a[@href='/courses/84']//span")
    private WebElement testingCourse2;

    private WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Авторизация пользователем {login} с паролем {password}")
    public ContentPage authorization(String login, String password) {

        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSighIn.click();

        return new ContentPage(driver);
    }

    public WebElement getInputLogin() { return inputLogin; }

    public WebElement getInputPassword() { return inputPassword; }

    public WebElement getButtonSighIn() { return buttonSighIn; }

    public WebElement getButtonCourses() { return buttonCourses; }

    public WebElement getButtonClosePopUp2() { return buttonClosePopUp2; }

    public WebElement getLinkCourses() { return linkCourses; }

    public WebElement getBoxFree() { return boxFree; }

    public WebElement getBoxTester() { return boxTester; }

    public WebElement getTestingCourse1() { return testingCourse1; }

    public WebElement getTestingCourse2() { return testingCourse2; }
}
