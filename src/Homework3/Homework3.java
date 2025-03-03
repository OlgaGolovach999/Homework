package Homework3;

public class Homework3 {
    public static void main(String[] args) {
        // x/6+25=98
        int x = (98 - 25) * 6;
        System.out.println("x = " + x);
        System.out.println("******************");
        int a = 8, y = 9, z = 12;
        a+= 5; //a = a+5;
        System.out.println("сложение с присваиванием " +a);

        y *= 9; // y = y * 9;
        System.out.println("умножение с присваиванием " +y);

        z -= 12; //z = z - 12;
        System.out.println("разница с присваиванием " +z);
        System.out.println("******************");

        int b = 35;
        int c = 65;
        int i = b > c ? 5 : 10;
        System.out.println("тернарный оператор " +i);
        System.out.println("******************");

        int n = 5, m = 2, k = n * m;

        k= ++n*m--;
        System.out.println ("значение k должно быть " +k);
        System.out.println ("инкримент n " +n);
        System.out.println ("декремент m " +m);

    }
}