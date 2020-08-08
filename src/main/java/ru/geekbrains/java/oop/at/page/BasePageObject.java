package ru.geekbrains.java.oop.at.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BasePageObject {

    protected WebDriver driver;
    protected WebDriverWait wait15second;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
        this.wait15second = new WebDriverWait(driver, 15);
        PageFactory.initElements(driver, this);
    }

    @Step("Поиск в коллекции элемента WebElement с текстом {expectedText}")
    protected WebElement findElement(List<WebElement> list, String expectedText) {
        List<String> arrayList = new ArrayList<>();

        for (WebElement webElement : list) {
            String actualText = webElement.getText();
            arrayList.add(actualText);

            if (actualText.toLowerCase().trim().equals(expectedText.toLowerCase().trim())) {
                return webElement;
            }
        }
        throw new RuntimeException("В коллекции элементов: " + arrayList + "\nНе найден элемент с тектом: " + expectedText);
    }
}
