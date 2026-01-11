// Пример работы с библиотекой.(для двух книг )
// Здесь создаём пару книг и проверяем простые операции.
public class Main {
    public static void main(String[] args) {

        // Создаём две книги
        Book b1 = new Book("Три мушкетёра", "Александр Дюма", 1844);
        Book b2 = new Book("Маленький принц", "Антуан де Сент-Экзюпери", 1943);

        
        // Создаём библиотеку
        Library library = new Library();


        //сама работа с библиотекой черз функции
        // Кладём книги в библиотеку
        library.addBook(b1);
        library.addBook(b2);

        // Показываем, что сейчас в библиотеке
        library.printBooks();

        // Считаем, сколько книг у автора "Александр Дюма"
        int dumasCount = library.countByAuthor("Александр Дюма");
        System.out.println();
        System.out.println("Книг Александра Дюма в библиотеке: " + dumasCount);

        // Выдаём одну книгу
        System.out.println();
        System.out.println("Выдаём книгу: Маленький принц");
        library.checkoutBook("Маленький принц");

        // Ещё раз показываем книги
        System.out.println();
        library.printBooks();

        // Смотрим журнал операций
        System.out.println();
        library.printLogs();
    }
}
