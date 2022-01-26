package set22.animal;

public class TestAnimal {
    public static void main(String[] args) {
        /*
        // Using the subclasses
        Cat cat1 = new Cat(); // no parameters for the constructor
        cat1.greeting(); // wrong method name
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        Animal animal4 = new Animal(); // cant create instance of abstract class
         */

        Cat cat1 = new Cat("Jenna");
        cat1.greets();
        Dog dog1 = new Dog("Mark");
        dog1.greets();
        BigDog bigDog1 = new BigDog("John");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("Jenna");
        animal1.greets();
        Animal animal2 = new Dog("Mark");
        animal2.greets();
        Animal animal3 = new BigDog("John");
        animal3.greets();
    }
}

