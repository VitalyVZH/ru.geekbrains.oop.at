package example.equals2;

public class Dog {

    private String name;
    private String breed;
    private int age;
    private int weight;
    private boolean gender;

    private int dogPassportNumber;

    public Dog(int dogPassportNumber) {
        this.dogPassportNumber = dogPassportNumber;
    }

    @Override
    public boolean equals(Object object) {
        // проверка ссылки на один и тот же объект
        if(this == object) return true;
        if(object == null) return false;
        // проверка на совпадение класса
        if(getClass() != object.getClass()) return false;

        Dog dog = (Dog) object;
        return this.dogPassportNumber == dog.dogPassportNumber;
    }
}
