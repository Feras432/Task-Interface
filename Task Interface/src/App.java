import AniKingdom.Cat;
import AniKingdom.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        Dog sparky = new Dog();
        Cat garfield = new Cat();

        sparky.eat();
        sparky.makeSound();
        sparky.sleep();
        garfield.eat();
        garfield.makeSound();
        garfield.sleep();
    }
}
