package ru.geekbrains.java.oop.at.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.java.oop.at.block.Navigation;

public class ContentPage extends PageFactory {

    public WebDriverWait wait15second;



    @FindBy(id = "top-menu")
    private WebElement header;

    @FindBy(css = "footer[class=\"site-footer\"]")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    // отключение popUp
    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;

   private Navigation navigation;

    // для реализации наследования от PageFactory
    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }

    public WebElement getNamePage() {
        return namePage;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public WebElement getButtonClosePopUp1() { return buttonClosePopUp1; }

    public WebElement getButtonClosePopUp2() { return buttonClosePopUp2; }
}
