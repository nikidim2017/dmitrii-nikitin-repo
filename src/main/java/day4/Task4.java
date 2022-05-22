package day4;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        Random num = new Random();

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = num.nextInt(10000);
            System.out.println(numbers[i]);
        }

        System.out.println("Выводим суммы соседних 3-х элементов");
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 1; i < numbers.length - 2; i++) {
            sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            System.out.println(sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }

        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Индекс первого элемента: " + maxSumIndex);
    }
}




