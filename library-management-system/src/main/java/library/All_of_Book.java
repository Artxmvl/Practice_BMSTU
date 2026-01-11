// Класс книги. Здесь просто держатся самые базовые данные.
public class Book {

    // Название книги 
    private String title;
    // Автор книги 
    private String author;
    // Год издания.
    private int year;

    
    // Конструктор. Через него создаём новую книгу.
    public Book(String title, String author, int year) {
        // Сохраняем значения из параметров во внутренние поля объекта
        this.title = title;
        this.author = author;
        this.year = year;
    }
//далее идут уже функции
    // Вернуть название книги
    public String getTitle() {
        return title;
    }

    // Вернуть автора
    public String getAuthor() {
        return author;
    }

    // Вернуть год 
    public int getYear() {
        return year;
    }

   
    @Override
    public String toString() {
        return title + " (" + author + ", " + year + ")";// Пример результата: "Война и мир (Лев Толстой, 1869)"
    }
}

