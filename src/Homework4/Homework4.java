package Homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = in.nextInt();
        System.out.println("Введите b:");
        int b = in.nextInt();
        System.out.println("Введите c:");
        int c = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Четное число: " + a);
        }
        if (b % 2 == 0) {
            System.out.println("Четное число: " + b);
        }
        if (c % 2 == 0) {
            System.out.println("Четное число: " + c);
            System.out.println("******************");
        }
        System.out.println("Введите d:");
        int d = in.nextInt();
        System.out.println("Введите i:");
        int i = in.nextInt();
        System.out.println("Введите f:");
        int f = in.nextInt();

        if (d % 2 == 0 && d % 5 == 0) {
            System.out.println("Число кратное 2-ум и 5-ти: " + d);
        }
        if (i % 2 == 0 && i % 5 == 0) {
            System.out.println("Число кратное 2-ум и 5-ти: " + i);

        }
        if (f % 2 == 0 && f % 5 == 0) {
            System.out.println("Число кратное 2-ум и 5-ти: " + f);
            System.out.println("******************");
        }
        System.out.println("Введите x:");
        int x = in.nextInt();

        double result = 15.0 / x;
        int intResult = (int) Math.round(result);

        switch (intResult) {
            case 3:
                System.out.println("Результат деления равен 3");
                break;
            case 5:
                System.out.println("Результат деления равен 5");
                break;
            default:
                System.out.println("Результат деления равен дробному числу " + result);
                System.out.println("******************");
        }
    }
}