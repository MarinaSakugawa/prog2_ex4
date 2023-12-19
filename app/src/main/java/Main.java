import ex4.Animal;
import ex4.Bird;
import ex4.Cat;
import ex4.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.makeSounds();

        Cat cat = new Cat("たま");
        cat.makeSounds();

        Dog dog = new Dog("ポチ");
        dog.makeSounds();
        dog.swim();

        Bird bird = new Bird("インコ");
        bird.makeSounds();
        bird.fly();
    }
}
