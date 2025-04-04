class Animal {
    void makeSound() {
        System.out.println("Some animals make sound.");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
class Cat extends Animal {
   
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}
public class MethodOverridingExample4{
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();
        
        myDog.makeSound();
        myCat.makeSound();
        myCow.makeSound();
    }
}
