package Homework8;

public class MainText {
    public static void main(String[] args) {
        Text processor = new Text();
        String str1 = "Я люблю java";
        String str2 = "java";
        String result1 = processor.logikaStrings(str1, str2);
        System.out.println("Результат 2.1: " + result1);

        String str3 = "Привет!";
        String str4 = "Это Оля!";
        String result2 = processor.twoStrings(str3, str4);
        System.out.println("Результат 3.1: " + result2);


        Text processor1 = new Text();
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 3;
        String str = "ВЕСНА";

        String result = processor1.insertSubstringAfterIndex(text, k, str);
        System.out.println("Результат: " + result);
    }
}