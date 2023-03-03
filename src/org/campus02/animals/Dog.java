package org.campus02.animals;

public class Dog extends Animal{
    public Dog(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("going for a walk");
    }

    public void makeNoise(){
        System.out.println("woof woof");
    }
}
