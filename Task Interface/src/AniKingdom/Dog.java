package AniKingdom;

import Interface.Animal;

public class Dog implements Animal {
    public void eat() {
        System.out.println("The dog eats");
    }

    public void sleep() {
        System.out.println("The dog sleeps");
    }

    public void makeSound() {
        System.out.println("The dog barks");
    }

}
