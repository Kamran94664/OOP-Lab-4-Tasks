public class LibraryBook {

        String title;
        int price;
        LibraryBook() {
            title = "Unknown";
            price = 0;
        }
        LibraryBook(String title) {
            this.title = title;
            price = 500;
        }
        LibraryBook(String title, int price) {
            this.title = title;
            this.price = price;
        }
        void display() {
            System.out.println("Title: " + title);
            System.out.println("Price: " + price);
            System.out.println();
        }
        public static void main(String[] args) {
            LibraryBook b1 = new LibraryBook();
            LibraryBook b2 = new LibraryBook("Java Basics");
            LibraryBook b3 = new LibraryBook("OOP Concepts", 750);

            b1.display();
            b2.display();
            b3.display();
        }
    }

