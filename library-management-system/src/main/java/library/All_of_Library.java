
import java.util.ArrayList;

// Класс библиотеки. Хранит список книг и журнал операций.
public class Library {

    // Список всех книг в библиотеке
    private ArrayList<Book> books = new ArrayList<>();
    // Журнал операций (что мы делали с книгами)
    private ArrayList<OperationLog> logs = new ArrayList<>();


    //Функции для основной работы с книгами (типа добавить выдать и другие)
    // Добавить книгу в библиотеку
    public void addBook(Book book) {
        books.add(book);
        // Записываем в журнал, что книгу добавили
        logs.add(new OperationLog("ADD", "Добавлена книга: " + book));
    }

    // Выдать книгу: находим по названию и убираем из списка
    public void checkoutBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getTitle().equals(title)) {
                books.remove(i);
                // Записываем в журнал, что книгу выдали
                logs.add(new OperationLog("CHECKOUT", "Книга выдана: " + b));
                return; // выходим после первой найденной
            }
        }
    }

    // Вернуть книгу в библиотеку
    public void returnBook(Book book) {
        books.add(book);
        // Записываем в журнал, что книгу вернули
        logs.add(new OperationLog("RETURN", "Книга возвращена: " + book));
    }

    // Вывести список всех книг
    public void printBooks() {
        System.out.println("Все Книги в библиотеке ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    // Вывести журнал всех операций
    public void printLogs() {
        System.out.println("Всего Журнал операций ");
        for (OperationLog log : logs) {
            System.out.println(log);
        }
    }

        // Посчитать, сколько книг этого автора есть в библиотеке
    public int countByAuthor(String author) {
        int count = 0; // начинаем с нуля
        for (Book b : books) {
            // equals сравнивает строки по содержимому
            if (b.getAuthor().equals(author)) {
                count++; // нашли книгу нужного автора, увеличиваем счётчик
            }
        }
        return count; // возвращаем количество найденных книг
    }

    // Вложенный статический класс — одна запись в журнале
    public static class OperationLog {
        private String type;      // тип операции: ADD, CHECKOUT, RETURN
        private String message;   // текстовое описание операции

        // Конструктор записи журнала
        public OperationLog(String type, String message) {
            this.type = type;
            this.message = message;
        }

        // Как выводится запись журнала(по типу красивого вывода из других заданий) 
        public String toString() {
            return type + ": " + message;
        }
    }

}
