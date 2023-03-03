package org.campus02.animals;

public class AnimalsDemo {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green",2,"Quaxi");
        Animal quaxiAsAnimal = (Animal) quaxi;
        Frog quaxiAsFrog = (Frog) quaxiAsAnimal;

        Cat schnurrsula = new Cat("grey", 2, "Schnurrsula");
        Animal schnurrsulaAsAnimal = (Animal) schnurrsula;
        Cat schnurrsulaAsCat = (Cat) schnurrsulaAsAnimal;
    }
}
