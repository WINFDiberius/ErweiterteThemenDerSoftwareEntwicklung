package org.campus02.animals;

public class Bird extends Animal implements Fly{


    public Bird(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("flying");
    }

    public void makeNoise() {
        System.out.println("chirp chirp");
    }

    @Override
    public void fly() {

    }
}
