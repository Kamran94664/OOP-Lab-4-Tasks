public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(name + " " + price);
    }

    public class TestProduct {
        static void increasePrice(Product p) {
            Product temp = new Product(p.name, p.price + 100);
            System.out.println("New price inside method: " + temp.price);
        }

        public static void main(String[] args) {
            Product p1 = new Product("Pen", 50);
            increasePrice(p1);
            System.out.println("Original price: " + p1.price);
        }
    }
}