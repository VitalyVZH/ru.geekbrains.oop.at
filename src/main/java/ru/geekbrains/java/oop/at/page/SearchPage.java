package ru.geekbrains.java.oop.at.page;

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

    /*@FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;

    @FindBy(css = "[placeholder=\"Пароль\"]")
    private WebElement inputPassword;*/


    // отключение popUp
    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

    private WebDriver driver;

    public SearchPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement getSearchBar() { return searchBar; }

    public WebElement getSearchQuery() { return searchQuery; }

    public WebElement getButtonClosePopUp1() { return buttonClosePopUp1; }

    public WebElement getButtonClosePopUp2() { return buttonClosePopUp2; }

    public WebElement getButtonProfession() { return buttonProfession; }
}
