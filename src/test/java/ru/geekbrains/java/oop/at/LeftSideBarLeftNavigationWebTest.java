package ru.geekbrains.java.oop.at;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.page.content.TestsPage;
import static ru.geekbrains.java.oop.at.block.LeftNavigation.Button;

import java.util.stream.Stream;

    /*
    1. Перейти на сайт geekbrains.ru/courses
    2. Нажать на кнопку Курсы
    3. Проверить что страница Курсы открылась
    4. Повторить для:
        - Курс
        - Вебинары
        - Форум
        - Блог
        - Тесты
        - Карьера
    */

@Execution(ExecutionMode.CONCURRENT)
@Feature("Навигация")
@Story("Проверка левого меню навигации")
@DisplayName("Навигация")
public class LeftSideBarLeftNavigationWebTest extends BeforeAndAfterStep {

    @Description("Тесты, которые проверяют функциональность без Pop-Up")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажание на: {0}")
    @MethodSource("stringProviderNotPopUp")

    public void checkNavigationNotPopUp(Button button) {
        new TestsPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(button)
                .getHeaderBlock().checkNamePage(button.getText());
    }

    public static Stream<Button> stringProviderNotPopUp() {
        return Stream.of(
                Button.TOPICS,
                Button.EVENTS,
                Button.TESTS,
                Button.CAREER
        );
    }

    @Test
    public void CheckNavigationNotPopUp() {
        new TestsPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(Button.COURSES)
                .closedPopUp()
                .getHeaderBlock().checkNamePage(Button.COURSES.getText());

    }
}
