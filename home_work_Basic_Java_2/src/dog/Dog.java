package dog;

public class Dog {
    private String name;
    private String breed;
    private static  int totalDogs = 0;

    public Dog(String name, String breed) { //создаем конструктор
        this.name = name;
        this.breed = breed;
        totalDogs++;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    public static int getTotalDogs() { // создаем метод по количеству собак
        return totalDogs;
    }


}
