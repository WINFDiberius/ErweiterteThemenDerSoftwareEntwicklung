package org.campus02.animals;

import java.util.ArrayList;

public class Nature {
    private ArrayList<Animal> animals;

    public Nature() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        this.animals.add(a);
    }

    public int countColor(String color) {
        int count = 0;
        for (Animal a : this.animals) {
            if (a.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "org.campus02.animals.Nature{" +
                "animals=" + animals +
                '}';
    }

    public static void main(String[] args) {
        Nature nature = new Nature();

        Cat schnurrsula = new Cat("black",2,"Schnurrsula");
        Dog bellatrix = new Dog("black",2,"Bellatrix");
        Frog quaxi = new Frog("green",2,"Quaxi");
        Bird birb = new Bird("yellow",2,"birb");

        nature.addAnimal(schnurrsula);
        nature.addAnimal(bellatrix);
        nature.addAnimal(quaxi);
        nature.addAnimal(birb);


        System.out.println(nature.countColor("black"));


           }
}
