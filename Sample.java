public class Sample {

        String name;

        Sample(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Sample s1 = new Sample("Object1");
            Sample s2 = new Sample("Object2");

            s1 = s2;

            System.out.println("Reassignment done");
        }
    }


