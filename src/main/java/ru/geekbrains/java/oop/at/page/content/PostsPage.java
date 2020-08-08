package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

public class PostsPage extends ContentBasePage {

    public PostsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public PostsPage openUrl() {
        super.openUrl("https://geekbrains.ru/posts");
        return this;
    }
}
