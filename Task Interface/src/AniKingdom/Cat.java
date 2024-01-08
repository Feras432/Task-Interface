package AniKingdom;

import Interface.Animal;

public class Cat implements Animal {
    public void eat() {
        System.out.println("The cat is eating");
    }

    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    public void makeSound() {
        System.out.println("The cat is meowing");
    }

}
