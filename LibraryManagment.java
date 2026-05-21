// ==========================================================
// PROJECT NAME : Library Management System
// TECHNOLOGY    : Core Java
// CONCEPTS USED : OOP, Classes, Objects, ArrayList,
//                  Methods, Constructor, Loops,
//                  Conditional Statements, Scanner
// ==========================================================

// Importing required packages
import java.util.ArrayList;
import java.util.Scanner;

// ==========================================================
// BOOK CLASS
// This class stores all book-related information
// ==========================================================

class Book {

    // ======================================================
    // VARIABLES / ATTRIBUTES
    // ======================================================

    int id;
    String title;
    String author;
    boolean isIssued;

    // ======================================================
    // CONSTRUCTOR
    // Used to initialize book details
    // ======================================================

    Book(int id, String title, String author) {

        this.id = id;
        this.title = title;
        this.author = author;

        // Initially book is not issued
        this.isIssued = false;
    }

    // ======================================================
    // DISPLAY METHOD
    // Displays book details
    // ======================================================

    void displayBook() {

        System.out.println("\n-----------------------------");
        System.out.println("Book ID      : " + id);
        System.out.println("Book Title   : " + title);
        System.out.println("Author Name  : " + author);
        System.out.println("Issued Status: " + (isIssued ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }
}

// ==========================================================
// MAIN CLASS
// ==========================================================

public class LibraryManagement {

    // ======================================================
    // ARRAYLIST
    // Used to store multiple book objects dynamically
    // ======================================================

    static ArrayList<Book> books = new ArrayList<>();

    // ======================================================
    // SCANNER OBJECT
    // Used to take user input
    // ======================================================

    static Scanner sc = new Scanner(System.in);

    // ======================================================
    // MAIN METHOD
    // Program execution starts here
    // ======================================================

    public static void main(String[] args) {

        // Infinite loop for menu
        while (true) {

            // ==================================================
            // MENU SECTION
            // ==================================================

            System.out.println("\n=================================");
            System.out.println(" LIBRARY MANAGEMENT SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.println("=================================");

            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            // ==================================================
            // SWITCH CASE
            // Handles menu operations
            // ==================================================

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    returnBook();
                    break;

                case 5:
                    searchBook();
                    break;

                case 6:
                    removeBook();
                    break;

                case 7:
                    System.out.println("\nThank You For Using The System!");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice! Please Try Again.");
            }
        }
    }

    // ======================================================
    // ADD BOOK METHOD
    // Adds new books to ArrayList
    // ======================================================

    static void addBook() {

        System.out.print("\nEnter Book ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        // Creating object and adding into ArrayList
        books.add(new Book(id, title, author));

        System.out.println("\nBook Added Successfully!");
    }

    // ======================================================
    // VIEW BOOKS METHOD
    // Displays all books
    // ======================================================

    static void viewBooks() {

        // Checking if ArrayList is empty
        if (books.isEmpty()) {

            System.out.println("\nNo Books Available!");
            return;
        }

        // Loop through all books
        for (Book b : books) {

            b.displayBook();
        }
    }

    // ======================================================
    // ISSUE BOOK METHOD
    // Changes issued status to true
    // ======================================================

    static void issueBook() {

        System.out.print("\nEnter Book ID To Issue: ");
        int id = sc.nextInt();

        // Loop through all books
        for (Book b : books) {

            // Checking matching book ID
            if (b.id == id) {

                // Check if already issued
                if (!b.isIssued) {

                    b.isIssued = true;

                    System.out.println("\nBook Issued Successfully!");
                }

                else {

                    System.out.println("\nBook Already Issued!");
                }

                return;
            }
        }

        System.out.println("\nBook Not Found!");
    }

    // ======================================================
    // RETURN BOOK METHOD
    // Changes issued status to false
    // ======================================================

    static void returnBook() {

        System.out.print("\nEnter Book ID To Return: ");
        int id = sc.nextInt();

        // Loop through books
        for (Book b : books) {

            // Check matching ID
            if (b.id == id) {

                // Check if issued
                if (b.isIssued) {

                    b.isIssued = false;

                    System.out.println("\nBook Returned Successfully!");
                }

                else {

                    System.out.println("\nBook Was Not Issued!");
                }

                return;
            }
        }

        System.out.println("\nBook Not Found!");
    }

    // ======================================================
    // SEARCH BOOK METHOD
    // Searches books by title
    // ======================================================

    static void searchBook() {

        sc.nextLine();

        System.out.print("\nEnter Book Title To Search: ");

        String title = sc.nextLine();

        // Loop through books
        for (Book b : books) {

            // Ignore uppercase/lowercase
            if (b.title.equalsIgnoreCase(title)) {

                System.out.println("\nBook Found!");

                b.displayBook();

                return;
            }
        }

        System.out.println("\nBook Not Found!");
    }

    // ======================================================
    // REMOVE BOOK METHOD
    // Removes book from ArrayList
    // ======================================================

    static void removeBook() {

        System.out.print("\nEnter Book ID To Remove: ");

        int id = sc.nextInt();

        // Loop through books
        for (Book b : books) {

            // Check matching ID
            if (b.id == id) {

                books.remove(b);

                System.out.println("\nBook Removed Successfully!");

                return;
            }
        }

        System.out.println("\nBook Not Found!");
    }
}
