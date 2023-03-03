package org.campus02.animals;

public class Frog extends Animal{
    public Frog(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("jumping");
    }

    public void makeNoise(){
        System.out.println("quack");
    }
}
