package ru.geekbrains.java.oop.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.BasePageObject;
import ru.geekbrains.java.oop.at.page.content.SearchPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToCompressingWhiteSpace;

public class HeaderBlock extends BasePageObject {

    //описание общих полей
    @FindBy(css = "[class=\"gb-header__title\"]")
    protected WebElement headerTitlePage;

    @FindBy(css = "[id=\"top-menu\"] [class=\"show-search-form\"] svg")
    protected WebElement buttonSearch;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    protected WebElement inputSearch;

    //описание для неавторизированного пользователя
    @FindBy(css = "[href='/login']")
    private WebElement signIn;

    @FindBy(css = "[href='/register']")
    private WebElement registration;

    //описание для авторизированного пользователя
    @FindBy(css = "header [class=\"scheldule-opener js-schedule-opener\"]")
    private WebElement buttonCalendar;

    @FindBy(css = "[class=\"js-notices-link\"]")
    private WebElement buttonNotify;

    @FindBy(css = "header [href='/thanks']")
    private WebElement buttonLike;

    @FindBy(id = "menu-messages")
    private WebElement buttonMessages;

    @FindBy(css = "[class=\"gb-top-menu__item dropdown\"]")
    private WebElement buttonAvatar;

    public HeaderBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка имени страницы {exampleNamePage}")
    public HeaderBlock checkNamePage(String exampleNamePage) {
        wait15second.until(ExpectedConditions.textToBePresentInElement(headerTitlePage, exampleNamePage));

        String headerPageText = headerTitlePage.getText();
        assertThat(headerPageText, equalToCompressingWhiteSpace(exampleNamePage));
        return this;
    }

    @Step("Поиск по тексту: {text}")
    public SearchPage searchText(String text) {
        buttonSearch.click();
        inputSearch.sendKeys(text);
        return new SearchPage(driver);
    }


}
