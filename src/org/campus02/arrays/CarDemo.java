package org.campus02.arrays;


public class CarDemo {



    public static void main(String[] args) {

        int[] arrangeorder = new int[]{3,5,4,22,2,6,32,61,3};

        ArrayHelper.arrangeOrder(arrangeorder);

        for (int i = 0; i < arrangeorder.length; i++) {
            System.out.print(arrangeorder[i] + ",");
        }
        System.out.println("\n");



        Car[] cars = {
                new Car(2022, "silver", 2500),
                new Car(2000, "blue", 1300),
                new Car(1989, "brown", 1200)
        };

        ArrayHelper.sortByProductionYear(cars);

        StringBuilder sb = new StringBuilder();

        for(Car car : cars){
            sb.append("|   " + car.toString() + "\t|" + "\n");
        }

        String result = sb.toString();
        System.out.println(result);


        for(Car car : cars){
            System.out.print("|  ");
            System.out.print(car.toString());
            System.out.println("\t|");
        }



    }

}
