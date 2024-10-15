package app;

import java.util.Random;

public class SolutionHomeWork09 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2) + 1;
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
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumRowEven);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prodColEven);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prodColOdd);

//        int sumrow0 = 0;
//        int sum = 0;
//        int str = 0;
//        while (sumrow0 == sum) {
//            sum = 0;
//            sumrow0 = 0;
//            for (int j = 0; j < matrix.length; j++) {
//                sumrow0 += matrix[0][j];
//                sum += matrix[str][j];
//            }
//            str++;
//            System.out.println("Сумма елементов строки " + str + " равна: " + sumrow0);
//            System.out.println("Сумма елементов строки " + str + " равна: " + sum);
//        }

//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    sumrow0 += matrix[0][j];
//                    sum += matrix[i][j];
//                }
//                k = i;
//                System.out.println("Сумма елементов строки " +k+ " равна: " +sumrow0);
//                System.out.println("Сумма елементов строки " +k+ " равна: " +sum);
//            }
//        }
//        int sumrow0 = 0;
//        int sumvalue = 0;
//        sumvalue = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == 0) {
//                    sumrow0 += matrix[i][j];
//                } else if ( i == 1 )
//                    sumvalue += matrix[i][j];
//            }
//        }
//        System.out.println(sumrow0);
//        System.out.println(sumvalue);
        int sumRow0 = 0;
        int sumRow1 = 0;
        int sumRow2 = 0;
        int sumRow3 = 0;
        int sumValue = 0;
        int sumCol0 = 0;
        int sumCol1 = 0;
        int sumCol2 = 0;
        int sumCol3 = 0;
        int i = 0;
        while (i<matrix.length){
            for (int j = 0; j < matrix.length; j++) {
               sumValue += matrix[i][j];
            }
            if (i ==0){
                sumRow0 = sumValue;
            } else if (i ==1) {
                sumRow1 = sumValue;
            } else if (i == 2) {
                sumRow2 = sumValue;
            } else if (i == 3) {
                sumRow3 = sumValue;
            }
            i++;
            sumValue = 0;
        }
        System.out.println(sumRow0);
        System.out.println(sumRow1);
        System.out.println(sumRow2);
        System.out.println(sumRow3);
        i = 0;
        while (i<matrix.length){
            for (int j = 0; j < matrix[i].length; j++) {
                sumValue += matrix[j][i];
            }
            if (i ==0){
                sumCol0 = sumValue;
            } else if (i ==1) {
                sumCol1 = sumValue;
            } else if (i == 2) {
                sumCol2 = sumValue;
            } else if (i == 3) {
                sumCol3 = sumValue;
            }
            i++;
            sumValue = 0;
        }
        int sumD1 = 0;
        int sumD2 = 0;
        System.out.println("sumCol0 " + sumCol0);
        System.out.println(sumCol1);
        System.out.println(sumCol2);
        System.out.println(sumCol3);
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[k].length; j++) {
                if (k==j){
                    sumD1 += matrix[k][j];
                } else if (( k == 3 && j==0)
                        ||(k == 2 && j == 1)
                        ||(k == 1 && j == 2)
                        ||(k == 0 && j == 3)) {
                    sumD2 += matrix[k][j];
                }
            }
        }
        System.out.println("sumD1 " + sumD1);
        System.out.println("sumD2 " + sumD2);

    }

}