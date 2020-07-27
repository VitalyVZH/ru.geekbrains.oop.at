package ru.geekbrains.example.hamcrest.greater.than.objects;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class ObjectsTest {

    @DisplayName("Сравнение объектов по ссылке")
    @Test
    void sameInstanceTest() {

        String name = "Лорд";
        Dog dog1 = new Dog(name);
//      Dog dog2 = dog1;
        MatcherAssert.assertThat(dog1, sameInstance(dog1));
    }

    @DisplayName("Сравнение объектов по toString")
    @Test
    void hasToStringTest() {

        String name = "Лорд";
        Dog dog = new Dog(name);
        MatcherAssert.assertThat(dog, hasToString("Моё имя Лорд"));
    }

    @DisplayName("Является ли класс подтипом")
    @Test
    void typeCompatibleWithTest() {

        MatcherAssert.assertThat(Dog.class, typeCompatibleWith(Animal.class));
    }

    @DisplayName("Является ли объект подтипом")
    @Test
    void instanceOfTest() {

        String name = "Лорд";
        Dog dog = new Dog(name);
        MatcherAssert.assertThat(dog, instanceOf(Animal.class));
    }

    @DisplayName("Проверка hasProperty")
    @Test
    void hasPropertyTest() {

        Dog dog = new Dog("Лорд");
        MatcherAssert.assertThat(dog, hasProperty("name", equalTo("Лорд")));
    }

    @DisplayName("Проверка объектов по значению")
    @Test
    void samePropertyValuesAsTest() {

        //String name = "Лорд";
        Dog dog1 = new Dog("Лорд");
        Dog dog2 = new Dog("Лорд");
        MatcherAssert.assertThat(dog1, samePropertyValuesAs(dog2));
    }
}
