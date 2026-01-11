package org.example.shapes;

// Класс описывает прямоугольник
public class Rectangle {

    double a;   // ширина прямоугольника
    double b;   // длина прямоугольника

    // Конструктор. Сохраняем стороны, проверяем корректность.
    public Rectangle(double a, double b) {
        // Если стороны неположительные, такой фигуры не существует
        if (a <= 0 || b <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
    }

    // Метод считает площадь прямоугольника
    double area() {
        return a * b;
    }

    // Метод считает периметр прямоугольника
    double perimeter() {
        return 2 * (a + b);
    }
}
