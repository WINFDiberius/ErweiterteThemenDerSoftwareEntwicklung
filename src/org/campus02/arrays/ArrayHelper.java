package org.campus02.arrays;

public class ArrayHelper {

    public static void arrangeOrder(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1 - j; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void sortByProductionYear(Car[] cars) {

        int count = 1;
        // Sortieren des Arrays mit Hilfe der Bubble-Sort-Algorithmus
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getProductionYear() > cars[j + 1].getProductionYear()) {

                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                    System.out.println(count);
                    count++;
                }
            }
        }
    }
}
