package Homework6;

public class Homework6 {
    public static void main(String[] args) {
        int[] massive = {5, 15, 3, 8, 7, 4, 1, 11, 2, 249};
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Число из массива " + massive[i]);
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 != 0) {
                massive[i] = 0;
            }
            System.out.println("Число из нового массива " + massive[i]);
        }

        System.out.println("*******************");

        int[] massive1 = {6, 8, 10, 12, 17};
        int[] massive2 = new int[massive1.length + 1];
        for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }
        massive2[massive1.length] = 0;
        for (int i = 0; i < massive2.length; i++) {
            System.out.println("Число из массива2 " + massive2[i]);
        }

        System.out.println("*******************");

        int[] massive3 = {100, 105, 10, 120, 7};
        for (int i = 0; i < massive3.length - 1; i++) {
            for (int k = 0; k < massive3.length - i - 1; k++) {
                if (massive3[k] > massive3[k + 1]) {

                    int buf = massive3[k];
                    massive3[k] = massive3[k + 1];
                    massive3[k + 1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int element : massive3) {
            System.out.print(element + " ");
        }
    }
}