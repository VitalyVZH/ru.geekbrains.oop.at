package example.hashset;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

    // реализация через List (содержит повторы)
    @Test
    public void addList() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(spike);
        dogList.add(tom);
        dogList.add(max);
        dogList.add(new Dog("Том", 11225211));

        System.out.println(dogList);
    }

    // реализация через hasSet (не содержит повторы)
    @Test
    public void addMap() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(spike);
        dogSet.add(tom);
        dogSet.add(max);
        dogSet.add(new Dog("Том", 11225211));

        System.out.println(dogSet);
    }

    // возвращает длину
    @Test
    public void size() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(spike);
        dogSet.add(tom);
        dogSet.add(max);

        System.out.println(dogSet.size());
    }

    // получение конкретного элемента через List
    @Test
    public void getInMap() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(spike);
        dogSet.add(tom);
        dogSet.add(max);

        // конвертация в list
        List<Dog> list = new ArrayList<>(dogSet);

        System.out.println(list.get(1));
    }

}
