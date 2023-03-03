package org.campus02.arrays;

public class Car implements Sortable {
    private int productionYear;
    private String colour;
    private int weight;

    public Car(int productionYear, String colour, int weight) {
        this.productionYear = productionYear;
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public int compareTo(Sortable other){
        Car otherCars = (Car) other;
        if (this.productionYear == otherCars.productionYear){
            return this.colour.compareTo(otherCars.getColour());
        }
        if (this.productionYear < otherCars.productionYear)
            return -1;
        else
            return +1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}