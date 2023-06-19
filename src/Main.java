import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        //Задача 1
        System.out.println("Задача 1");
        int[] integers = new int[]{1, 2, 3};
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};
        int[] maxTemperature = {20, 22, 19, 22, 20, 17, 20};
        //Задача 2
        System.out.println("Задача 2");
        for (int index = 0; index < integers.length; index++) {
            if (index == integers.length - 1) {
                System.out.println(integers[index]);
                break;
            }
            System.out.print(integers[index] + ", ");
        }
        for (int index = 0; index < fractionalNumbers.length; index++) {
            if (index == fractionalNumbers.length - 1) {
                System.out.println(fractionalNumbers[index]);
                break;
            }
            System.out.print(fractionalNumbers[index] + ", ");
        }
        for (int index = 0; index < maxTemperature.length; index++) {
            if (index == maxTemperature.length - 1) {
                System.out.println(maxTemperature[index]);
                break;
            }
            System.out.print(maxTemperature[index] + ", ");
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int index = integers.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(integers[index]);
                break;
            }
            System.out.print(integers[index] + ", ");
        }
        for (int index = fractionalNumbers.length - 1; index >= 0 ; index--) {
            if (index == 0) {
                System.out.println(fractionalNumbers[index]);
                break;
            }
            System.out.print(fractionalNumbers[index] + ", ");
        }
        for (int index = maxTemperature.length - 1; index >= 0 ; index--) {
            if (index == 0) {
                System.out.println(maxTemperature[index]);
                break;
            }
            System.out.print(maxTemperature[index] + ", ");
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int index = 0; index < integers.length; index++) {
            if (integers[index] % 2 != 0) {
                integers[index] = integers[index] + 1;
            }
        }
        System.out.println(Arrays.toString(integers));
    }
}