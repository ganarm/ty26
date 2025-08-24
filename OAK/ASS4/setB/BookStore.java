//package setB;
import java.io.*;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    public Book(int bookId, String bookName, double bookPrice, int bookQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
    }
}

public class BookStore 
{
    //private static final int RECORD_SIZE = 92; // Size of each record in bytes

    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("book.dat", "rw");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Search for a specific book by name");
                System.out.println("2. Display all books and total cost");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        searchBookByName(file);
                        break;
                    case 2:
                        displayAllBooks(file);
                        break;
                    case 3:
                        file.close();
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchBookByName(RandomAccessFile file) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book name to search: ");
        String searchName = scanner.nextLine();
               file.seek(0);
        while (file.getFilePointer() < file.length()) {
            int bookId = file.readInt();
            String bookName = nextLine();
            double bookPrice = file.readDouble();
            int bookQty = file.readInt();

            if (bookName.trim().equalsIgnoreCase(searchName)) {
                System.out.println("Book ID: " + bookId);
                System.out.println("Book Name: " + bookName.trim());
                System.out.println("Book Price: $" + bookPrice);
                System.out.println("Quantity Available: " + bookQty);
                return;
            }
        }
        System.out.println("Book not found.");
        
    }

    private static void displayAllBooks(RandomAccessFile file) throws IOException {
        file.seek(0); // Start reading from the beginning of the file
        double totalCost = 0;

        while (file.getFilePointer() < file.length()) {
            int bookId = file.readInt();
            String bookName = nextLine();
            double bookPrice = file.readDouble();
            int bookQty = file.readInt();

            totalCost += (bookPrice * bookQty);

            System.out.println("Book ID: " + bookId);
            System.out.println("Book Name: " + bookName.trim());
            System.out.println("Book Price: $" + bookPrice);
            System.out.println("Quantity Available: " + bookQty);
            System.out.println("------------------------");
        }

        System.out.println("Total Cost of all Books: $" + totalCost);
    }

/*    private static String readFixedString(int length, RandomAccessFile file) throws IOException {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = file.readChar();
            sb.append(c);
        }
        return sb.toString();
    }*/
}

