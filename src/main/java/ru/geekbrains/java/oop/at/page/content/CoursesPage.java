package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.block.ContentNavigationCoursesBlock;
import ru.geekbrains.java.oop.at.page.content.base.ContentBasePage;

import java.util.List;

public class CoursesPage extends ContentBasePage {

    private ContentNavigationCoursesBlock contentNavigationCoursesBlock;

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> coursesList;

    public CoursesPage(WebDriver driver) {
        super(driver);
        this.contentNavigationCoursesBlock = new ContentNavigationCoursesBlock(driver);
        PageFactory.initElements(driver, this);
    }

    public CoursesPage configFilter(String... args) {
        for (String test : args) {
            WebElement element = findElement(filterList, test);
            element.click();
        }
        return this;
    }

    public CoursesPage checkingDisplayedCourses(String... args) {
       for (String test : args ) {
           WebElement element = findElement(coursesList, test);
           wait15second.until(ExpectedConditions.visibilityOf(element));
       }
       return this;
    }

    public ContentNavigationCoursesBlock getContentNavigationCoursesBlock() {
        return contentNavigationCoursesBlock;
    }

    @Override
    public CoursesPage openUrl() {
        driver.get("https://geekbrains.ru/courses");
        return this;
    }

}
