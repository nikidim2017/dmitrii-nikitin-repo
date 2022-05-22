package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {


        int[] numbers = new int[100];
        int maxNumber = -1;
        int minNumber = 9999;
        int numEndZero = 0;
        int numEndZeroSum = 0;

       Random num = new Random();

        for (int i: numbers) {
            numbers[i] = num.nextInt(10000);
            System.out.println(numbers[i]);
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }

            if (numbers[i] % 10 == 0) {
                numEndZero++;
            }

            if (numbers[i] % 10 == 0) {
                numEndZeroSum = numEndZeroSum + numbers[i] ;
            }
        }
        System.out.println("Максимальный элемент: " + maxNumber);
        System.out.println("Минимальный элемент: " + minNumber);
        System.out.println("Число элементов, заканчивающихся на 0: " + numEndZero);
        System.out.println("Сумма элементов, заканчивающихся на 0: " + numEndZeroSum);

    }
}
