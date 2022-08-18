package lesson3.task1;

import java.util.Scanner;

/**
 * Создать программу, которая позволяет ввести с
 * клавиатуры массив размером n и отсортировать его по
 * убыванию.
 */

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: → ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter element " + (i) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your base massive is:");
        for (int i = 0; i < arraySize - 1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[arraySize - 1]);
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arraySize - 1; i++){
                if(array[i] < array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Sorted massive DESC:");
        System.out.print("[");
        for (int i = 0; i < arraySize - 1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[arraySize - 1]);
        System.out.print("]");
    }
}
