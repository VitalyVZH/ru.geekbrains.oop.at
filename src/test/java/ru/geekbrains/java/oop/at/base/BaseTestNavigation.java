package ru.geekbrains.java.oop.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class BaseTestNavigation {

    public WebDriver driver;
    public WebDriverWait wait15second;

    @BeforeEach

    public void beforeAll() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://geekbrains.ru/events");

        wait15second = new WebDriverWait(driver, 15);

    }

    @AfterEach
    public void afterEach() {

        WebElement header = driver
                .findElement(By.id("top-menu"));
        WebElement footer = driver
                .findElement(By.cssSelector("footer[class=\"site-footer\"]"));

        wait15second.until(ExpectedConditions.visibilityOf(header));
        wait15second.until(ExpectedConditions.visibilityOf(footer));

        driver.quit();
    }
}
