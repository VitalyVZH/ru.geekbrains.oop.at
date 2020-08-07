package example.array;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {

    }

    // добавление элементов в коллекцию add()
    @Test
    public void add() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog max = new Dog("Макс", 11224311);
        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(new Dog("Лорд", 33221144));
        dogList.add(1, max); //принудительная установка элемента на конкретное место

        System.out.println(dogList);

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

    // замена элемента по индексу set()
    @Test
    public void set() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);

        Dog lord = new Dog("Лорд", 43879988);
        System.out.println(dogList);
        dogList.set(2, lord);
        System.out.println(dogList);

    }

    // очистка массива clear()
    @Test
    public void clear() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);

        System.out.println(dogList);
        dogList.clear();
        System.out.println(dogList);
    }

    // конвертация в обычный массив toArray()
    @Test
    public void toArray() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);

        Object[] objects = dogList.toArray();
    }

    // объединение union()
    @Test
    public void union() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(spike);

        List<Dog> dogList2 = new ArrayList<>();
        dogList2.add(tom);
        dogList2.add(max);

        dogList1.addAll(dogList2);
        System.out.println(dogList1);
    }

    // двунаправленный итератор ListIterator()
    @Test
    public void listIterator() {
        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);

        ListIterator<Dog> dogListIterator = dogList.listIterator();

        while (dogListIterator.hasNext()) {
            System.out.println(dogListIterator.next());
        }
        System.out.println("");
        while (dogListIterator.hasPrevious()) {
            System.out.println(dogListIterator.previous());
        }

    }

}
