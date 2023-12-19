import ex4.Animal;
import ex4.Cat;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.makeSounds();

        Cat cat = new Cat("たま");
        cat.makeSounds();
    }
}
