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

        int sumrow0 = 0;
        int sum = 0;
        int i = 0;
        while (sumrow0 == sum) {
            sum = 0;
            sumrow0 = 0;
            if (i == 4) break;
            for (int j = 0; j < matrix.length; j++) {
                sumrow0 += matrix[0][j];
                sum += matrix[i][j];
            }
            i++;
            System.out.println("Сумма елементов строки " + i + " равна: " + sumrow0);
            System.out.println("Сумма елементов строки " + i + " равна: " + sum);
        }

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

    }
//        System.out.println("not");
//        System.out.println(sumvalue0);
//        System.out.println(sumvalue1);
}