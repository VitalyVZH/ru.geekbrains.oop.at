package example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {

        Dog spike = new Dog("Спайк", 11223344);
        Dog lord = new Dog("Лорд", 22334455);
        Dog tony = new Dog("Тони", 33445566);

    // создание коллекции собак
        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(lord);
        dogList.add(tony);
        dogList.add(new Dog("Том", 44556677));

    // перебор элементов коллекции
        for(Dog dog : dogList) {
            System.out.println(dog);
        }
        System.out.println("");

    // вызов элементов коллекции через iterator

        Iterator<Dog> iterator = dogList.iterator();

        // проверка, если ли следующий элемент

        System.out.println(iterator.hasNext());

        // вывод следущего элемента (изначально iterator в позиции (-1)

        System.out.println(iterator.next());

        System.out.println("");

        // вывод всех элементов коллекции через iterator, с проверкой наличия следующего элемента

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
