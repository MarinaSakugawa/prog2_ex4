package ex4;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSounds() {
        System.out.println(getName() + "がにゃーと鳴いた");
    }
}
