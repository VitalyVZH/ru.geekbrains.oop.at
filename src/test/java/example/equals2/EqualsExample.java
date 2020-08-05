package example.equals2;

import org.junit.jupiter.api.Assertions;

public class EqualsExample {
    public static void main(String[] args) {
        Dog spike = new Dog(11223344);
        Dog lord = new Dog(11223344);

        Assertions.assertTrue(spike.equals(lord));
    }


}
