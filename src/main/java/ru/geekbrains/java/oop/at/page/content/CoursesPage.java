package ru.geekbrains.java.oop.at.page.content;

import io.qameta.allure.Step;
import lombok.Getter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.block.ContentNavigationCoursesBlock;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

import java.util.List;

public class CoursesPage extends ContentBasePage {

    @Getter
    private ContentNavigationCoursesBlock contentNavigationCoursesBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> coursesList;

    public CoursesPage(WebDriver driver) {
        super(driver);
        this.contentNavigationCoursesBlock = new ContentNavigationCoursesBlock(driver);
    }

    @Step("Настройка фильтра курсов: {args}")
    public CoursesPage configFilter(String... args) {
        for (String text : args) {
            WebElement element = findElement(filterList, text);
            element.click();
        }
        return this;
    }

    @Step("Проверка отображения курсов: {args}")
    public CoursesPage checkingDisplayedCourses(String... args) {
       for (String text : args ) {
           WebElement element = findElement(coursesList, text);
           wait15second.until(ExpectedConditions.visibilityOf(element));
       }
       return this;
    }

    public ContentNavigationCoursesBlock getContentNavigationCourseBlock() {
        return contentNavigationCoursesBlock;
    }

    @Override
    public CoursesPage openUrl() {
        super.openUrl("https://geekbrains.ru/courses");
        return this;
    }

}
