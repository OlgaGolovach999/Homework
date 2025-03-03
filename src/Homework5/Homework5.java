package Homework5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int a = 1; a <= 100; a++) {
            if (a % 7 == 0 || a % 3 == 0) {
                System.out.println("Число кратное 3 или 7 из диапазона от 0 до 100: " + a);
            }
        }
        System.out.println("*******************");

        System.out.println("Введите ax:");
        int ax = in.nextInt();
        System.out.println("Введите bx:");
        int bx = in.nextInt();
        int sum = 0;
        int start = Math.min(ax, bx);
        int end = Math.max(ax, bx);
        while (start <= end) {
            sum += start;
            start++;
        }
        System.out.println("Сумма всех чисел = " + sum);

        System.out.println("*******************");

        int reversnumber = 0;
        System.out.println("Введите число number, которое не заканчивается на 0:");
        int number = in.nextInt();
        while (number != 0) {
            int x = number % 10;
            reversnumber = reversnumber * 10 + x;
            number /= 10;
        }
        System.out.println("Число в обратном порядке number: " + reversnumber);

        System.out.println("*******************");

        System.out.println("Введите число num, которое не заканчивается на 0:");
        int num = in.nextInt();
        int c = 1;
        while (c <= num) {
            if (c % 2 == 0) {
                System.out.println(c + " - чётное число");
            } else {
                System.out.println(c + " - нечётное число");
            }
            c++;
        }
    }
}