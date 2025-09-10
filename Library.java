import java.util.*;

class Library {
    static class Book {
        String id;
        String title;
        boolean isIssued;

        Book(String id, String title) {
            this.id = id;
            this.title = title;
            this.isIssued = false;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Title: " + title + ", Issued: " + (isIssued ? "Yes" : "No");
        }
    }

    static class IssuedBook {
        String bookId;
        String studentName;
        String issueDate;

        IssuedBook(String bookId, String studentName, String issueDate) {
            this.bookId = bookId;
            this.studentName = studentName;
            this.issueDate = issueDate;
        }
    }

    private List<Book> books = new ArrayList<>();
    private List<IssuedBook> issuedBooks = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    void addBook(String id, String title) {
        books.add(new Book(id, title));
        System.out.println("Book added: " + title);
    }

    void issueBook(String bookId, String studentName) {
        for (Book book : books) {
            if (book.id.equals(bookId)) {
                if (book.isIssued) {
                    System.out.println("Sorry, the book is already issued.");
                    return;
                }
                book.isIssued = true;
                String date = java.time.LocalDate.now().toString();
                issuedBooks.add(new IssuedBook(bookId, studentName, date));
                System.out.println("Book issued to " + studentName + " on " + date);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void returnBook(String bookId) {
        for (Book book : books) {
            if (book.id.equals(bookId)) {
                if (!book.isIssued) {
                    System.out.println("This book was not issued.");
                    return;
                }
                book.isIssued = false;
                issuedBooks.removeIf(issued -> issued.bookId.equals(bookId));
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void viewBooks() {
        System.out.println("\n--- All Books ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    void viewIssuedBooks() {
        System.out.println("\n--- Issued Books ---");
        if (issuedBooks.isEmpty()) {
            System.out.println("No books issued.");
            return;
        }
        for (IssuedBook ib : issuedBooks) {
            System.out.println("Book ID: " + ib.bookId + ", Student: " + ib.studentName + ", Date: " + ib.issueDate);
        }
    }

    void menu() {
        while (true) {
            System.out.println("\n--- Library Management ---");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View All Books");
            System.out.println("5. View Issued Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    addBook(id, title);
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    String bid = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    issueBook(bid, sname);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String rid = sc.nextLine();
                    returnBook(rid);
                    break;
                case 4:
                    viewBooks();
                    break;
                case 5:
                    viewIssuedBooks();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.menu();
    }
}