package example.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {

    }

    // добавление элементов в коллекцию add()
    @Test
    public void add() {
        Dog spike = new Dog("Спайк", 11223211);
        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(new Dog("Лорд", 33221144));

    }

    // поиск индекса в коллекции indexOf()
    @Test
    public void indexOf() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);
        dogList.add(new Dog("Лорд", 33221144));

        System.out.println(dogList.indexOf(tom));

    }

    // есть ли в коллекции определенный объект contains()
    @Test
    public void contains() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);
        dogList.add(new Dog("Лорд", 33221144));

        System.out.println(dogList.contains(tom));

    }

    // удаление определенного объекта из коллекции remove()
    @Test
    public void remove() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);
        dogList.add(new Dog("Лорд", 33221144));

        System.out.println(dogList);
        System.out.println(dogList.remove(tom));
        System.out.println(dogList);

    }
}
