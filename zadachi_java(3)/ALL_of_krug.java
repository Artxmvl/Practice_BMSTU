package org.example.shapes;

// Класс описывает круг
public class Circle {
    double r;  // радиус круга


    // Конструктор. Проверка и в случае успеха сохранение
    public Circle(double r) {
        // Радиус должен быть положительным
        if (r <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.r = r;
    }


<<<<<<< HEAD


=======
    
>>>>>>> c43aa04147e089e8588d7c7b8a770064cf74b6d3
    // Метод считает площадь круга
    double area() {
        return Math.PI * r * r;
    }

    // Метод считает длину окружности (периметр круга)
    double perimeter() {
        return 2 * Math.PI * r;
    }
}
