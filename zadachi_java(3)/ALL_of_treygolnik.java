package org.example.shapes;

// Класс описывает треугольник
public class Triangle {

    double a;  // первая сторона
    double b;  // вторая сторона
    double c;  // третья сторона

    // Конструктор. Проверка и в случае успеха сохранение
    public Triangle(double a, double b, double c) {

        // 1. Сначала проверяем, что каждая сторона положительная
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        // 2. Потом
        // сумма любых двух сторон должна быть строго больше третьей
        if (a + b <= c) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        if (a + c <= b) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        if (b + c <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }

        // Если все проверки прошли, сохраняем стороны
        this.a = a;
        this.b = b;
        this.c = c;
    }





    // Метод считает периметр треугольника
    double perimeter() {
        return a + b + c;
    }

    // Метод считает площадь треугольника по формуле Герона
    double area() {
        double p = perimeter() / 2.0;               // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
