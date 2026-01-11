package org.example;

// Класс хранит массив строк и их количество
public class StringStorage {

    String[] data = new String[1000];
    int size = 0;

    // Метод добавляет строку в массив
    public void add(String value) {
        data[size] = value;  // кладём строку в следующий свободный индекс
        size++;              // увеличиваем количество элементов
    }



    // Метод возвращает строку с максимальной длиной но сначала проверка на заполнененность
    public String getMaxByLength() {
        if (size == 0) {
            return null;     // если элементов нет, возвращаем null
        }

        String max = data[0];  // считаем первую строку максимальной

        // идём по всем заполненным элементам и ищем более длинную строку
        for (int i = 1; i < size; i++) {
            if (data[i].length() > max.length()) {
                max = data[i];
            }
        }
        return max;
    }




    // Метод возвращает среднюю длину всех строк
    public double getAverageLength() {
        if (size == 0) {
            return 0.0;  // если элементов нет, средняя длина 0
        }

        int sum = 0;  // сумма длин всех строк

        // суммируем длины строк
        for (int i = 0; i < size; i++) {
            sum += data[i].length();
        }

        // делим сумму длин на количество элементов
        return (double) sum / size;
    }
}
