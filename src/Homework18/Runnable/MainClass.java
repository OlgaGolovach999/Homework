package Homework18.Runnable;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Задача 1.1: Две машины, параллельное движение без остановки");
        startParallelCarsSimple();

        System.out.println("\nЗадача 1.2: Две машины, параллельное движение с остановкой");
        startParallelCarsWithStop();

        System.out.println("\nЗадача 1.3: Три машины, где две начинают движение после завершения первой");
        startThreeCarThreadsWithJoin();
    }

    private static void startParallelCarsSimple() {
        Car car1 = new Car("Toyota Camry", "0913KB5", 0);
        Car car2 = new Car("BMW X5", "3235EH7", 0);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания завершения потоков задачи 1.1");
        }
        System.out.println("Задача 1.1 завершена.");
    }

    private static void startParallelCarsWithStop() {
        Car car1 = new Car("Toyota Camry", "0913KB5", 10);
        Car car2 = new Car("BMW X5", "3235EH7", 8);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания завершения потоков задачи 1.2");
        }
        System.out.println("Задача 1.2 завершена.");
    }

    private static void startThreeCarThreadsWithJoin() {
        Car car1 = new Car("Toyota Camry", "0913KB5", 10);
        Car car2 = new Car("BMW X5", "3235EH7", 8);
        Car car3 = new Car("Audi A6", "1256XK4", 5);

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        thread1.start();
        try {
            thread1.join();
            System.out.println("Первая машина завершила движение. Запускаем оставшиеся машины...");
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания завершения потока: " + car1.getName());
        }

        thread2.start();
        thread3.start();

        try {
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Ошибка ожидания завершения потоков задачи 1.3");
        }
        System.out.println("Задача 1.3 завершена.");
    }
}