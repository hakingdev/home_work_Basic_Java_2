import dog.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "Bulldog");
        Dog dog3 = new Dog("Tim", "Bulldog");
        Dog dog4 = new Dog("Elt", "Bulldog");
        Dog dog5 = new Dog("Corny", "Corgy");

        System.out.println("Dog 1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + ", " + dog2.getBreed());
        System.out.println("Dog 3: " + dog3.getName() + ", " + dog3.getBreed());
        System.out.println("Dog 4: " + dog4.getName() + ", " + dog4.getBreed());
        System.out.println("Dog 5: " + dog5.getName() + ", " + dog5.getBreed());

        System.out.println("Total dogs created: " + Dog.getTotalDogs());
    }
}