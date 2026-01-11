package org.example;

import org.example.shapes.Rectangle;
import org.example.shapes.Circle;
import org.example.shapes.Triangle;

// Класс для проверки
public class Proverki {
    public static void main(String[] args) {
        // Создаём прямоугольник со сторонами 3 и 4
        Rectangle rectangle = new Rectangle(3, 4);

        // Создаём круг с радиусом 5
        Circle circle = new Circle(5);

        // Создаём треугольник со сторонами 3, 4 и 5
        Triangle triangle = new Triangle(3, 4, 5);

        // Выводим площадь и периметр прямоугольника
        System.out.println("Rectangle: area = " + rectangle.area()
                + ", perimeter = " + rectangle.perimeter());

        // Выводим площадь и периметр круга
        System.out.println("Circle: area = " + circle.area()
                + ", perimeter = " + circle.perimeter());

        // Выводим площадь и периметр треугольника
        System.out.println("Triangle: area = " + triangle.area()
                + ", perimeter = " + triangle.perimeter());
    }
}
