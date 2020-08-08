package ru.geekbrains.java.oop.at.block;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.java.oop.at.page.BasePageObject;
import ru.geekbrains.java.oop.at.page.content.CoursesPage;

public class ContentNavigationCoursesBlock extends BasePageObject {

    @FindBy(css = "[class*=\"nav nav-tabs\"] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*=\"nav nav-tabs\"] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public ContentNavigationCoursesBlock(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие на tab: {tab}")
    public CoursesPage clickTab(Tab tab) {
        switch (tab) {
            case FREE_INTENSIVE: {
                tabFreeIntensive.click();
            }
            case PROFESSIONS: {
                tabProfessions.click();
            }
            case COURSES: {
                tabCourses.click();
            }
            case COMPANIES: {
                tabCompanies.click();
            }
        }
        return new CoursesPage(driver);
    }

    public enum Tab {
        PROFESSIONS,
        FREE_INTENSIVE,
        COURSES,
        COMPANIES
    }
}
