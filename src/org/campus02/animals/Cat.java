package org.campus02.animals;

public class Cat extends Animal{
    public Cat(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("walking graciously");
    }

    public void makeNoise(){
        System.out.println("miouw");
    }
}
