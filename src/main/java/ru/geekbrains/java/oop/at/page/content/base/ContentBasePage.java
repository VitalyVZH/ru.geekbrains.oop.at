package ru.geekbrains.java.oop.at.page.content.base;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.page.BasePageObject;
import ru.geekbrains.java.oop.at.page.OpenUrl;
import ru.geekbrains.java.oop.at.block.HeaderBlock;
import ru.geekbrains.java.oop.at.block.LeftNavigation;

public abstract class ContentBasePage extends BasePageObject implements OpenUrl {

    @Getter
    protected LeftNavigation leftNavigation;
    @Getter
    protected HeaderBlock headerBlock;

    @FindBy(css = "div button svg[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonPopUpClosed;

    public ContentBasePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.leftNavigation = new LeftNavigation(driver);
    }

    public ContentBasePage closedPopUp() {
        wait15second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if(buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

    public ContentBasePage checkNamePage(String exampleNamePage) {
        headerBlock.checkNamePage(exampleNamePage);
        return this;
    }

    @Step("Переход на страницу {url}")
    public BasePageObject openUrl(String url) {
        driver.get(url);
        return this;
    }
}
