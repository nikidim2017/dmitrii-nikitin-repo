package day4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.lang.Math;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            int num = (int) Math.round(Math.random() * 10);
            numbers[i] = num;
            System.out.println(numbers[i]);
        }

        int numOver8 = 0;
        int numEqual1 = 0;
        int numEven = 0;
        int numOdd = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8) {
                numOver8++;
            }
            if (numbers[i] == 1) {
                numEqual1++;
            }
            if (numbers[i] % 2 == 0) {
                numEven++;
            }
            if (numbers[i] % 2 != 0) {
                numOdd++;
            }
            sum = sum + numbers[i];
        }
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество элементов больше 8: " + numOver8);
        System.out.println("Количество элементов равных 1: " + numEqual1);
        System.out.println("Количество четных элементов: " + numEven);
        System.out.println("Количество нечетных элементов: " + numOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}








