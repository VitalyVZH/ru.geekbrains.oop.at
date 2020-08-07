package example.hashmap;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExample {

    // добавлене элементов в HashMap
    @Test
    public void add() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Николай", spike); // в случае с Map используется put вместо add
        mapStringDog.put("Сергей", tom);
        mapStringDog.put("Вадим", max);

        System.out.println(mapStringDog);
    }

    // получение конкретного элемента get()
    @Test
    public void get() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Николай", spike); // в случае с Map используется put вместо add
        mapStringDog.put("Сергей", tom);
        mapStringDog.put("Вадим", max);

        System.out.println(mapStringDog.get("Вадим"));
    }

    // получение всех значений getValues()
    @Test
    public void getValues() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Николай", spike); // в случае с Map используется put вместо add
        mapStringDog.put("Сергей", tom);
        mapStringDog.put("Вадим", max);

        System.out.println(mapStringDog.values());
    }

    // получение всех ключей getKeys()
    @Test
    public void getKeys() {

        Dog spike = new Dog("Спайк", 11223211);
        Dog tom = new Dog("Том", 11225211);
        Dog max = new Dog("Макс", 11232211);

        Map<String, Dog> mapStringDog = new HashMap<>();
        mapStringDog.put("Николай", spike); // в случае с Map используется put вместо add
        mapStringDog.put("Сергей", tom);
        mapStringDog.put("Вадим", max);

        System.out.println(mapStringDog.keySet());
    }
}
