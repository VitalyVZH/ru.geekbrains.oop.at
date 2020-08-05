package hw7;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FirstTask {


    // Создать массив с набором из 10–20 слов, должны встречаться повторяющиеся. Найти и вывести список уникальных слов, из которых состоит массив.
    // Посчитать, сколько раз встречается каждое слово.
    @Test
    public void FirstTask() {

        String [] wordsList = {"кошка", "собака", "белка", "медведь", "тигр", "собака", "лиса", "мышь", "кошка", "ёж"};
        List<String> list = Arrays.asList(wordsList);
        Set<String> wordsArray = new HashSet<>(list);
   /*   wordsArray.add("кошка");
        wordsArray.add("собака");
        wordsArray.add("белка");
        wordsArray.add("медведь");
        wordsArray.add("тигр");
        wordsArray.add("собака");
        wordsArray.add("лиса");
        wordsArray.add("мышь");
        wordsArray.add("кошка");
        wordsArray.add("ёж");*/

        for (String i : wordsArray) {
            System.out.println("{" + i + "}: " + Collections.frequency(list, i));

        }
    }
}
