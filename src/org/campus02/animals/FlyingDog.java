package org.campus02.animals;

public class FlyingDog extends Dog implements Fly{
    public FlyingDog(String color, int countEyes, String name) {
        super(color, countEyes, name);
    }

    @Override
    public void walk() {
        System.out.println("going for a walk");
    }

    public void makeNoise(){
        System.out.println("woof woof");
    }

    public void fly(){
        System.out.println("Flying in the air.");
    }

}
