package Homework17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainClass {
    public static void main(String[] args) {

        first();
        second();
        third();
        fourth();

        Car car = new Car("Toyota", 200, "Japan");
        System.out.println("\nСоздан объект автомобиля: " + car);
        serializeCar(car);

        Car deserializedCar = deserializeCar("Car.ser");
        System.out.println("Десериализованный объект автомобиля: " + deserializedCar);
    }

    private static void first() {
        File file = new File("newFile\\newFile.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches " +
                    "of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his " +
                    "time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he " +
                    "had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with " +
                    "silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was " +
                    "training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited in the evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, " +
                    "visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при записи файла с относительным путём", e);
        }
    }

    private static void second() {
        File file = new File("d:\\TestFile", "newFilik.txt");
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches " +
                    "of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his " +
                    "time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he " +
                    "had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his " +
                    "kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with " +
                    "silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was " +
                    "training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited in the evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, " +
                    "visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при записи файла с абсолютным путём", e);
        }
    }

    private static void third() {
        File file = new File("newFile\\newFile.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println("Содержимое файла newFile\\newFile.txt:");
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при чтении файла newFile\\newFile.txt", e);
        }
    }

    private static void fourth() {
        File file = new File("d:\\TestFile", "newFilik.txt");
        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            System.out.println("Содержимое файла d:\\TestFile\\newFilik.txt:");
            System.out.println(text);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при чтении файла d:\\TestFile\\newFilik.txt", e);
        }
    }

    public static void serializeCar(Car car) {
        String fileName = "Car.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(car);
            System.out.println("\nОбъект автомобиля успешно сериализован в файл: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при сериализации объекта автомобиля", e);
        }
    }

    public static Car deserializeCar(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Car) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Ошибка при десериализации объекта автомобиля", e);
        }
    }
}