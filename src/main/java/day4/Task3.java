package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int [][] numbers = new int[12][8];
        Random num = new Random(); // создаем новый объект - случайно число

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = num.nextInt(50); // заполняем массив случайными числами
            }
        }
        int[] sums = new int[numbers.length]; // создаем новый массив sums[] для перебора и поиска максимального числа и индекса строки
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sums[i] = sums[i] + numbers[i][j]; // заполняем созданнный массив sums[] случайными числами из массива numbers[]
                if (maxSum <= sums[i]) {
                    maxSum = sums[i];
                    maxIndex = i;
                }
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("// сумма элементов строки равна " + sums[i]);

            System.out.println();

        }
        System.out.println();
        System.out.println("Строка с наибольшей суммой: " + maxIndex);
    }
}



