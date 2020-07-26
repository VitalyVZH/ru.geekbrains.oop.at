package ru.geekbrains.java.oop.at.base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public abstract class BaseTestSearch {

    public ChromeDriver chromeDriver;
    public WebDriverWait wait15second;

    @BeforeEach

    public void beforeAll() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        chromeDriver = new ChromeDriver(options);

        chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);

        chromeDriver.manage().window().maximize();

//      Перейти на сайт https://geekbrains.ru/courses

        chromeDriver.get("https://geekbrains.ru/courses");

        //chromeDriver.findElementByCssSelector("[class=\"gb-empopup-close\"]").click(); // отключение второго popup
        chromeDriver.findElementByCssSelector("button [class=\"svg-icon icon-popup-close-button \"]").click();

//      В поле Поиск ввести текст: java

        chromeDriver.findElementByCssSelector("li a [class=\"svg-icon icon-search \"]").click();
        chromeDriver.findElementByCssSelector("[class=\"search-panel__search-field\"]")
                .sendKeys("java");

        wait15second = new WebDriverWait(chromeDriver, 15);

    }

    @AfterEach
    public void afterAll(){
        chromeDriver.quit();
    }
}
