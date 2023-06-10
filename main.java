package com;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Library library = new Library();
        library.displayMenu(name);
    }
}

package com;

public abstract class Book {
    protected String name;
    protected String category;

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
package com;
public class FictionBook extends Book {
    private String author;

    public FictionBook(String name, String category, String author) {
        super(name, category);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fiction Book:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Author: " + author);
        System.out.println();
    }
}
package com;
public class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String name, String category, String topic) {
        super(name, category);
        this.topic = topic;
    }

    @Override
    public void displayInfo() {
        System.out.println("Non-Fiction Book:");
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println();
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}

package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> books;
    private int bookCount;

    public Library() {
        books = new ArrayList<>();
        bookCount = 0;
    }

    private void addBook(Book book) {
        books.add(book);
        bookCount++;
    }

    private int getBookCount() {
        return bookCount;
    }

    private void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("- " + book.getName() + " (" + book.getCategory() + ")");
        }
        System.out.println();
    }

    protected void displayMenu(String borrowerName) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a fiction book");
            System.out.println("2. Add a non-fiction book");
            System.out.println("3. Display available books");
            System.out.println("4. Finish borrowing");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (option == 1) {
                System.out.print("Enter the book name: ");
                String bookName = scanner.nextLine();
                System.out.print("Enter the book category: ");
                String bookCategory = scanner.nextLine();
                System.out.print("Enter the author: ");
                String author = scanner.nextLine();

                Book book = new FictionBook(bookName, bookCategory, author);
                addBook(book);

                System.out.println(bookName + " added successfully!\n");
            } else if (option == 2) {
                System.out.print("Enter the book name: ");
                String bookName = scanner.nextLine();
                System.out.print("Enter the book category: ");
                String bookCategory = scanner.nextLine();
                System.out.print("Enter the topic: ");
                String topic = scanner.nextLine();

                Book book = new NonFictionBook(bookName, bookCategory, topic);
                addBook(book);

                System.out.println(bookName + " added successfully!\n");
            } else if (option == 3) {
                displayBooks();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.\n");
            }
        }

        System.out.println("Borrower Name: " + borrowerName);
        System.out.println("Total borrowed books: " + getBookCount());
    }
}

