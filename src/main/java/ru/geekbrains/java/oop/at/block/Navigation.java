package ru.geekbrains.java.oop.at.block;

import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends PageFactory {

    // для реализации наследования от PageFactory
    public Navigation(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/events']")
     private WebElement buttonEvents;

     @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/courses']")
     private WebElement buttonCourses;

     @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/topics']")
     private WebElement buttonTopics;

     @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/posts']")
     private WebElement buttonPosts;

     @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/tests']")
     private WebElement buttonTests;

     @FindBy(css = "[class=\"gb-left-menu__nav\"] [href='/career']")
     private WebElement buttonCareer;

     public WebElement getButton(String nameButton) {

         switch (nameButton) {
             case "Вебинары":{
                 return buttonEvents;
             }
             case "Курсы":{
                 return buttonCourses;
             }
             case "Форум":{
                 return buttonTopics;
             }
             case "Блог":{
                 return buttonPosts;
             }
             case "Тесты":{
                 return buttonTests;
             }
             case "Карьера":{
                 return buttonCareer;
             }

         }
         throw new RuntimeException("Кнопка: " + nameButton + " не найдена на странице!");
     }
}
