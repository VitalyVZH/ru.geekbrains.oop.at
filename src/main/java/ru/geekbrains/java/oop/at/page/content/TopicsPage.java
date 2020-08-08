package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class TopicsPage extends ContentBasePage {

    public TopicsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TopicsPage openUrl() {
        super.openUrl("https://geekbrains.ru/topics");
        return this;
    }
}

