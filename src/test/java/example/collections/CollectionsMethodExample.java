package example.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMethodExample {
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

    // вывод всей коллекции
        System.out.println(dogList);
    // вывод конкретного элемента
        System.out.println(dogList.get(3));
    }
}
