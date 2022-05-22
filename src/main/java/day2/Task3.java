package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число a");
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        int number = a + 1;
        while (number < b) {
            if ((number % 5 == 0) && (number % 10 != 0)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
