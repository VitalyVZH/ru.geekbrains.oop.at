package ru.geekbrains.java.oop.at.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends PageFactory {

    // поисковый запрос
    @FindBy(css = "[class=\"svg-icon icon-search \"]")
    private WebElement searchBar;

    @FindBy(css = "[class=\"search-panel__search-field\"]")
    private WebElement searchQuery;

    // поиск элементов на странице

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='professions']/span")
    private WebElement buttonProfession;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='professions']/span")
    private WebElement countProfessions;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='courses']/span")
    private WebElement countCourses;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='webinars']/span")
    private WebElement countWebinars;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='blogs']/span")
    private WebElement countBlogs;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='forums']/span")
    private WebElement countForums;

    @FindBy(xpath = "//a[@class='search-page-tabs__item' and @data-tab='tests']/span")
    private WebElement countTests;

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement inputLogin;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(id = "registration-form-button")
    private WebElement buttonSighIn;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;


    // отключение popUp
    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    public SearchPage authorization(String login, String password) {

        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSighIn.click();

        return new SearchPage(driver);
    }

    private WebDriver driver;

    public SearchPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

    public void openUrl() {
        driver.get("https://geekbrains.ru/");
    }


    public WebElement getSearchBar() { return searchBar; }

    public WebElement getSearchQuery() { return searchQuery; }

    public WebElement getButtonClosePopUp1() { return buttonClosePopUp1; }

    public WebElement getButtonClosePopUp2() { return buttonClosePopUp2; }

    public WebElement getButtonCourses() { return buttonCourses; }

    public WebElement getCountProfessions() { return countProfessions; }

    public WebElement getCountCourses() { return countCourses; }

    public WebElement getCountWebinars() { return countWebinars; }

    public WebElement getCountBlogs() { return countBlogs; }

    public WebElement getCountForums() { return countForums; }

    public WebElement getCountTests() { return countTests; }

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
