package org.example.shapes;

// Класс описывает круг
public class Circle {

    double r;  // радиус круга

    // Конструктор. Сохраняем радиус и проверяем корректность.
    public Circle(double r) {
        // Радиус должен быть положительным
        if (r <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.r = r;
    }

    // Метод считает площадь круга
    double area() {
        return Math.PI * r * r;
    }

    // Метод считает длину окружности (периметр круга)
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
