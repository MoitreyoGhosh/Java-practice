import java.util.Scanner;
public class W2A5 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String title = sc.next();
            String author = sc.next();

            Book book = new Book();

            book.setTitle(title);
            book.setAuthor(author);

            book.displayDetails();
        }
    }

    class Book {
        private String title;
        private String author;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public void displayDetails() {
            System.out.println("Title: " + this.title);
            System.out.print("Author: " + this.author);
        }
    }
