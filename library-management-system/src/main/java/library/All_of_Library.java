package library;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Book> books;
    private final OperationLog operationLog;

    public Library() {
        this.books = new ArrayList<>();
        this.operationLog = new OperationLog();
    }

    public void addBook(Book book) {
        if (book == null) return;

        books.add(book);
        operationLog.addEntry(OperationLog.OperationType.ADD_BOOK,
                "Добавлена книга: " + book.getTitle() + " (ID=" + book.getId() + ")");
    }

    public Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        if (author == null) return result;

        for (Book b : books) {
            if (b.getAuthor() != null && b.getAuthor().equalsIgnoreCase(author)) {
                result.add(b);
            }
        }
        return result;
    }

    public boolean borrowBook(int id) {
        Book book = findBookById(id);
        if (book == null) return false;
        if (!book.isAvailable()) return false;

        book.setAvailable(false);
        operationLog.addEntry(OperationLog.OperationType.BORROW,
                "Выдана книга: " + book.getTitle() + " (ID=" + book.getId() + ")");
        return true;
    }

    public boolean returnBook(int id) {
        Book book = findBookById(id);
        if (book == null) return false;
        if (book.isAvailable()) return false;

        book.setAvailable(true);
        operationLog.addEntry(OperationLog.OperationType.RETURN,
                "Возвращена книга: " + book.getTitle() + " (ID=" + book.getId() + ")");
        return true;
    }

    public List<Book> getAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.isAvailable()) result.add(b);
        }
        return result;
    }

    public void printOperationLog() {
        operationLog.printLog();
    }

    // Метод getStatistics, перенесённый cherry-pick'ом
    public String getStatistics() {
        int total = books.size();
        int available = 0;
        for (Book b : books) {
            if (b.isAvailable()) available++;
        }
        int borrowed = total - available;
        return "Всего книг: " + total + ", доступных: " + available + ", выданных: " + borrowed;
    }

    // Вложенный статический класс
    public static class OperationLog {

        // Внутренний класс для записи операции
        public class LogEntry {
            private final OperationType type;
            private final LocalDateTime timestamp;
            private final String description;

            public LogEntry(OperationType type, LocalDateTime timestamp, String description) {
                this.type = type;
                this.timestamp = timestamp;
                this.description = description;
            }

            @Override
            public String toString() {
                return "[" + timestamp + "] " + type + " — " + description;
            }
        }

        public enum OperationType {
            ADD_BOOK, BORROW, RETURN
        }

        private final List<LogEntry> entries;

        public OperationLog() {
            this.entries = new ArrayList<>();
        }

        public void addEntry(OperationType type, String description) {
            entries.add(new LogEntry(type, LocalDateTime.now(), description));
        }

        public List<LogEntry> getEntries() {
            return new ArrayList<>(entries);
        }

        public void printLog() {
            if (entries.isEmpty()) {
                System.out.println("Журнал операций пуст.");
                return;
            }
            System.out.println("Журнал операций:");
            for (LogEntry e : entries) {
                System.out.println(e);
            }
        }
    }
}

