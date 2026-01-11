package org.example;

// Класс для проверки работы StringStorage
public class Proverki {
    public static void main(String[] args) {
        // создаём хранилище строк на 10 элементов
        StringStorage storage = new StringStorage(10);

        // добавляем несколько строк
        storage.add("eruigvdjn");
        storage.add("jkfvhdns");
        storage.add("gjf");
        storage.add("jfkskjgjsrugvngen");

        // выводим строку максимальной длины
        System.out.println("Самая длинная строка: " + storage.getMaxByLength());

        // выводим среднюю длину строк
        System.out.println("Средняя длина: " + storage.getAverageLength());
    }
}
