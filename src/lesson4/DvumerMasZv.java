package lesson4;

import java.util.Random;
import java.util.Scanner;

public class DvumerMasZv {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static int matrixSize1;
    static int matrixSize2;
    static int dioganaleSumm;

    static int centerCoordinatesValue = 0;

    public static void main(String[] args) {
        System.out.println("Размерность ");
        matrixSize1 = scanner.nextInt();
        matrixSize2 = scanner.nextInt();
        int[][] matrix = new int[matrixSize1][matrixSize2];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(3,5);
            }
        }

        outMatrix(matrix);
        diagonaleSumm(matrix);
        lineSumm(matrix);
        center(matrix);
        obrezMatrici(matrix);
        obrezEsliNeKv(matrix);

//        int maxValue = 0;
//        for (int i = 0; i < arrayishe.length; i++) {
//            for (int j = 0; j < arrayishe[i].length; j++) {
//                if (arrayishe[i][j] > maxValue){
//                    maxValue = arrayishe[i][j];
//                }
//            }
//        }
//        System.out.println(maxValue);
    }

    public static void outMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
        }
    }

    public static void diagonaleSumm(int[][] matrix){
        //int dioganaleSumm = 0;
        int secondStolbec = 0;
        int mxIn = matrix.length - 1;
        if(matrixSize1 == matrixSize2) {
            for (int i = mxIn; i >= 0; i--) {
                dioganaleSumm += matrix[i][mxIn - i];
                //System.out.println(matrix[i][mxIn - i]);
            }
            //System.out.println("Сумма диагонали → " + dioganaleSumm);
        }
        else {
            System.out.println();
            System.out.println("Не квадрат");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 1; j < 2 ; j++) {
                    secondStolbec += matrix[i][j];
                }
            }
            System.out.println("Сумма второго столбца " + secondStolbec);
        }
    }

    public static void lineSumm(int[][] matrix){
        int lineSumm = 0;
        if(matrixSize1 == matrixSize2){
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    lineSumm += matrix[i][j];
                }
                System.out.println();
                System.out.println("Сумма второй строки " + lineSumm);
                System.out.println("Сумма побочной диагонали " + dioganaleSumm);
                System.out.println("Сумма второй строки минус сумма побочной диагонали " + (lineSumm - dioganaleSumm));
            }
        }
    }
    public static void center (int[][] matrix){
        int centerCoordinatesValue = 0;
        int a = matrixSize1;
        int b = matrixSize2;
        if (a % 2 == 0 || matrixSize1 != matrixSize2) {
            System.out.println("Центр не находится");
        }
        else {
            a = matrixSize1 / 2;
            b = matrixSize2 / 2;
            for (int i = a; i < a + 1; i++) {
                for (int j = b; j < b + 1; j++) {
                    centerCoordinatesValue = matrix[i][j];
                    System.out.print("Координаты центра " + i);
                    System.out.println(" " + j);
                }
                System.out.println("Значение центра " + centerCoordinatesValue);
            }
        }
    }
    public static void obrezMatrici (int[][] matrix) {
        int a = matrixSize1;
        int b = matrixSize2;
        if (a % 2 == 0 || matrixSize1 != matrixSize2) {
            System.out.println("Делаем матрицу пригодной ");
            for (int i = 0; i < matrix.length - 2; i++) {
                System.out.println();
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println();
            for (int i = matrix.length - 1; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
        }
    }
    public static void obrezEsliNeKv (int[][] matrix){
        int min = matrix[0][0];
        int a = matrixSize1;
        int b = matrixSize2;
        if (a!=b && matrixSize1 != matrixSize2){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (min > matrix[i][j]){
                        min = matrix[i][j];
                    }
                }
            }
            System.out.println();
            System.out.println("Min - " + min);
            System.out.println("Матрица размером равная наименьшему значению");
            for (int i = 0; i < min; i++) {
                System.out.println();
                for (int j = 0; j <min; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
        }
        a = min / 2;
        b = min / 2;
        for (int i = a; i < a + 1; i++) {
            for (int j = b; j < b + 1; j++) {
                centerCoordinatesValue = matrix[i][j];
                System.out.println();
                System.out.print("Координаты центра " + i);
                System.out.println(" " + j);
            }
            System.out.println("Значение центра " + centerCoordinatesValue);
        }
    }
}
