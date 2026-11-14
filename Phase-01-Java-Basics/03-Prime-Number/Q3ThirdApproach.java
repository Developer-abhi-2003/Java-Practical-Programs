public class Q3ThirdApproach {

        public static void main(String[] args) {

            for (int i = 0; i <= 100; i++) {
                if (i <= 1) {}
                else if (i == 2 || i == 3 || i == 5) {
                    System.out.print(i + "\t");
                }
                else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0){}
                else
                    System.out.print(i + "\t");
            }
        }
    }

