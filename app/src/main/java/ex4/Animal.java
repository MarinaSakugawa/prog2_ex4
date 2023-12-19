package ex4;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void makeSounds(){
        System.out.println(getName() + "が鳴いている");
    }
}
