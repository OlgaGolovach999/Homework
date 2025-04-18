package Homework20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileGeneratorTask implements Callable<List<String>> {

    @Override
    public List<String> call() throws Exception {
        String threadName = Thread.currentThread().getName();
        System.out.println("Задача запущена в потоке: " + threadName);

        List<String> createdFiles = new ArrayList<>();

        File directory = new File("output");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        for (int i = 1; i <= 10; i++) {
            String filename = "output/file_" + UUID.randomUUID().toString() + ".txt";
            File file = new File(filename);
            try (FileWriter writer = new FileWriter(file)) {
                String content = IntStream.rangeClosed(1, 10)
                        .mapToObj(j -> generateRandomString(20))
                        .collect(Collectors.joining(System.lineSeparator()));
                writer.write(content + System.lineSeparator());
            } catch (IOException e) {
                System.out.println("Поток " + threadName + " - Ошибка записи файла: " + filename);
            }
            System.out.println("Поток " + threadName + " созданный файл: " + filename);
            createdFiles.add(filename);
        }

        Random random = new Random();
        int sleepTime = random.nextInt(3) + 1;
        System.out.println("Поток " + threadName + " останавливается на " + sleepTime + " секунд(ы/у).");
        Thread.sleep(sleepTime * 1000);
        System.out.println("Поток " + threadName + " окончание задачи.");

        return createdFiles;
    }

    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++){
            int index = rnd.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}