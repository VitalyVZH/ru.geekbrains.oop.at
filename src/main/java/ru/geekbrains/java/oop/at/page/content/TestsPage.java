package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class TestsPage extends ContentBasePage {

    public TestsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TestsPage openUrl() {
        super.openUrl("https://geekbrains.ru/tests");
        return this;
    }
}
