package Homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<List<String>> future = executor.submit(new FileGeneratorTask());
            futures.add(future);
        }

        for (Future<List<String>> future : futures) {
            try {
                List<String> files = future.get();
                System.out.println("Задача выполнена с файлами: " + files);
            } catch (Exception e) {
                System.out.println("Ошибка при получении результата задачи: " + e.getMessage());
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}