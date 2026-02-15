public class Mobile {
        String brand;
        int price;
        Mobile() {
            this("Unknown", 0);
        }
        Mobile(String brand) {
            this(brand, 10000);
        }
        Mobile(String brand, int price) {
            this.brand = brand;
            this.price = price;
        }
        void show() {
            System.out.println(brand + " " + price);
        }
        public static void main(String[] args) {
            Mobile m1 = new Mobile();
            Mobile m2 = new Mobile("Samsung");
            Mobile m3 = new Mobile("Apple", 90000);
            m1.show();
            m2.show();
            m3.show();
        }
    }

