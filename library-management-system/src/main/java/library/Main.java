package library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Война и мир",
                "Л.Н. Толстой", 1869, "978-5-17-090335-2"));
        library.addBook(new Book(2, "Преступление и наказание",
                "Ф.М. Достоевский", 1866, "978-5-17-090336-9"));
        library.addBook(new Book(3, "Анна Каренина",
                "Л.Н. Толстой", 1877, "978-5-17-090337-6"));

        System.out.println("=== Доступные книги ===");
        printBooks(library.getAvailableBooks());

        System.out.println("=== Поиск по ID=2 ===");
        System.out.println(library.findBookById(2));

        System.out.println("\n=== Книги автора: Л.Н. Толстой ===");
        printBooks(library.findBooksByAuthor("Л.Н. Толстой"));

        System.out.println("\n=== Выдача книги ID=1 ===");
        System.out.println(library.borrowBook(1) ? "Выдана" : "Не удалось выдать");

        System.out.println("\n=== Возврат книги ID=1 ===");
        System.out.println(library.returnBook(1) ? "Возвращена" : "Не удалось вернуть");

        System.out.println("\n=== Журнал операций ===");
        library.printOperationLog();
    }

    private static void printBooks(List<Book> books) {
        if (books == null || books.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
            System.out.println();
        }
    }
}
