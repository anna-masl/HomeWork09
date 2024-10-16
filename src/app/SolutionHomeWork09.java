package app;

import java.util.Random;

public class SolutionHomeWork09 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
//        int [][] matrix = new int[][]{{8,1,6},{3,5,7},{4,9,2}};

        int sumRowOdd = 0;
        int sumRowEven = 0;
        long prodColOdd = 1L;
        long prodColEven = 1L;
        boolean isMagicSquare = true;
        int sumControl = 0; //сумма main diagonal
        int sumDiagonal = 0;
        int sumRow = 0;
        int sumColumn = 0;

        System.out.println("Матриця 4x4:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

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

        for (int i = 0; i < matrix.length; i++) {
            sumControl += matrix[i][i];
            sumDiagonal += matrix[i][matrix.length - i - 1];
        }
//        System.out.println("sum of diag1 " + sumControl);
//        System.out.println("sum of diag2 " + sumDiagonal);

        if (sumDiagonal != sumControl) {
            isMagicSquare = false;
            System.out.println("Матриця не є магічним квадратом.");
        }

        if (isMagicSquare) {
            for (int i = 0; i < matrix.length; i++) { //count sum for row
                sumRow = 0;
                sumColumn = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sumRow += matrix[i][j];
                    sumColumn += matrix[j][i];
                }
//                System.out.println("sum of row" + i + " " + sumRow);
//                System.out.println("sum of column" + i + " " + sumColumn);
                if (sumRow != sumControl || sumColumn != sumControl) {
                    isMagicSquare = false;
                    System.out.println("Матриця не є магічним квадратом.");
                    break;
                }
            }
            System.out.println("Матриця є магічним квадратом.");
        }
    }
}