package ru.geekbrains.java.oop.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class BaseTestSearch {

    public WebDriver driver;
    public WebDriverWait wait15second;

    @BeforeEach

    public void beforeAll(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();

//      Перейти на сайт https://geekbrains.ru/courses

        driver.get("https://geekbrains.ru/courses");

        //driver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click(); // отключение второго popup
        driver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

//      В поле Поиск ввести текст: java

        driver.findElement(By.cssSelector("li a [class=\"svg-icon icon-search \"]")).click();
        driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"))
                .sendKeys("java");

        wait15second = new WebDriverWait(driver, 15);

    }

    @AfterEach
    public void afterAll(){
        driver.quit();
    }
}
