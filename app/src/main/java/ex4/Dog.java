package ex4;

public class Dog extends Animal implements Swimmable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSounds() {
        System.out.println(getName() + "がわんと鳴いた");
    }
    
    @Override
    public void swim() {
        System.out.println(getName() + "は泳いでいる");
    }
}

