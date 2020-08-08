<p align="center"><a href="https://geekbrains.ru" target="_blank" rel="noopener noreferrer"><img width="200" src="https://theme.zdassets.com/theme_assets/487546/7429249bedfdfd3c5a84841094c88293e616423e.png" alt="Geekbrains"></a></p>

# Проект автоматизации тестирования сайта geekbrains.ru

Учебный проект созданный в рамках курса "ООП в Java"

Автотесты проверяющие функциональность сайта https://geekbrains.ru/

## Запуск тестирования

Для запуска тестирования обновите списки dependency и plagin, затем воспользуйтесь данной командой в Maven

    mvn clean test allure:serve

## Создано с помощью

<li><a href="https://maven.apache.org/" target="_blank" rel="noopener nofollow">Maven</a>
— управление зависимостями</li>
<li><a href="https://junit.org/junit5/" target="_blank" rel="noopener nofollow">JUnit5</a>
— библиотека для модульного тестирования</li>
<li><a href="https://www.selenium.dev/" target="_blank" rel="noopener nofollow">Selenium</a>
— инструмент для автоматизации</li>
<li><a href="http://hamcrest.org/" target="_blank" rel="noopener nofollow">Hamcrest</a>
— фреймворк, помогающий писать программные тесты</li>
<li><a href="http://allure.qatools.ru/" target="_blank" rel="noopener nofollow">Allure</a>
— фреймворк для создания отчётов по результатам автотестов</li>
<li><a href="https://projectlombok.org/" target="_blank" rel="noopener nofollow">Lombok</a>
— дополнительная функциональность в Java</li>

## Краткое описание классов

<li>BasePageObject - базовый класс</li>
<li>Классы CareerPage, CoursePage, EventsPage, HomePage, PostsPage, SearchPage, TestsPage, TopicsPage - инстанцируют класс ContentBasePage</li>
<li>Класс AuthorizationPage - проверка авторизации на сайте</li>
<li>Класс HeaderBlock - проверка загрузки блока header</li>
<li>Класс LeftNavigation - проверка работоспособности левого меню</li>
<li>Класс SearchTabsBlock - проверка работоспособности поисковых запросов на сайте</li>

## Автор

  <li><a href="https://github.com/VitalyVZH">Виталий Зверев</a></li>

## Благодарности

  Благодарю за помощь в написании данного кода, нашего преподавателя:
  <li><a href="https://github.com/Antonppavlov">Антон Павлов</a></li> 