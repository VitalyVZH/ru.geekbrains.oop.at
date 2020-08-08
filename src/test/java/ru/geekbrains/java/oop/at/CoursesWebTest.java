package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.block.ContentNavigationCoursesBlock;
import ru.geekbrains.java.oop.at.block.LeftNavigation;
import ru.geekbrains.java.oop.at.page.content.CoursesPage;

import static org.hamcrest.MatcherAssert.assertThat;

       /*
        1. Перейти на страницу авторизация https://geekbrains.ru/login
        2. Ввести логин : hks47018@eoopy.com
        3. Пароль: hks47018
        4. Нажать кнопку войти
        5. Проверить что отобразилась страница "Главная"
        6. Нажать в навигации "Курсы"
        7. Нажать в шапке сайта "Курсы"
        8. Выбрать в фильтрах чекбокс "Бесплатные"
        9. Выбрать в фильтрах чекбокс "Тестирование"
        10. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 1"
        11. Проверить что в выборке отображается курсы "Тестирование ПО. Уровень 2"
        */

@Execution(ExecutionMode.CONCURRENT)
@Feature("Курсы")
@Story("Проверка страницы курсы")
@DisplayName("Курсы")
public class CoursesWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка страницы курсы")
    @Test
    public void checkSignInValidLogin() {

        CoursesPage coursesPage = ((CoursesPage)
                new CoursesPage(driver)
                    .openUrl()
                    .closedPopUp()
                    .getLeftNavigation()
                    .clickButton(LeftNavigation.Button.COURSES)
        );

        coursesPage.getContentNavigationCoursesBlock()
                .clickTab(ContentNavigationCoursesBlock.Tab.COURSES)
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses(
                        "Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2"
                );
    }
}
