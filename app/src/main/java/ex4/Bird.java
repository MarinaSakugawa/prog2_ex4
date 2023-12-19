package ex4;

public class Bird extends Animal implements Flyable{
    
    public Bird(String name){
        super(name);
    }

    @Override
    public void makeSounds(){
        System.out.println(getName() + "がチュンチュンと鳴いた");
    }

    @Override
    public void fly() {
        System.out.println(getName() + "はぱたぱたと飛んでいる");
    }
}
