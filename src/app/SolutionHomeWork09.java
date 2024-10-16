package app;

import java.util.Random;

public class SolutionHomeWork09 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        System.out.println("Матриця 4x4:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sumRowOdd = 0;
        int sumRowEven = 0;
        long prodColOdd = 1L;
        long prodColEven = 1L;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0) {
                    sumRowEven += matrix[i][j];
                } else sumRowOdd += matrix[i][j];
                if (j % 2 == 0) {
                    prodColEven *= matrix[i][j];
                } else prodColOdd *= matrix[i][j];
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumRowEven);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumRowOdd);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodColEven);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodColOdd);

        int result = 1;
        int sum0 = 0; //сумма 1 строки
        int sum = 0;

        for (int j = 0; j < matrix.length; j++) {
            sum0 += matrix[0][j];
        }
        for (int i = 0; i < matrix.length; i++) { //count sum for row
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
//            System.out.println("sum of row" + i + " " + sum);
            if (sum != sum0) {
                result = 0;
                System.out.println("Матриця не є магічним квадратом.");
                break;
            }
        }
        if (result == 1) {
            for (int j = 0; j < matrix.length; j++) { //count sum for column
                sum = 0;
                for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][j];
                }
//                System.out.println("sum of colum" + j + " " + sum);
                if (sum != sum0) {
                    result = 0;
                    System.out.println("Матриця не є магічним квадратом.");
                    break;
                }
            }
        }
        if (result == 1) {
            sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
            }
//            System.out.println("sum of diag1 " + sum);
            if (sum != sum0) {
                result = 0;
                System.out.println("Матриця не є магічним квадратом.");
            }

        }
        if (result == 1) {
            sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][matrix.length - i - 1];
            }
//            System.out.println("sum of diag2 " + sum);
            if (sum != sum0) {
                result = 0;
                System.out.println("Матриця не є магічним квадратом.");
            } else System.out.println("Матриця є магічним квадратом.");
        }
    }
}