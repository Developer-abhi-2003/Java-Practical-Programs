public class AccessSpecifier_Approach3 {

    static class Numbers {

        private int a = 100;
        int b = 200;
        public int c = 300;
        protected int d = 400;
    }


    public static class Test {

        void show() {

            AccessSpecifier_Approach3.Numbers n =
                    new AccessSpecifier_Approach3.Numbers();

            System.out.println("From Show Function:");

//             System.out.println("A = " + n.a); // Error: private

            System.out.println("B = " + n.b);
            System.out.println("C = " + n.c);
            System.out.println("D = " + n.d);

            System.out.println("-----------------------------");
        }

        public static void main(String[] args) {

            AccessSpecifier_Approach3.Numbers n =
                    new AccessSpecifier_Approach3.Numbers();

            System.out.println("From Main Function:");

//             System.out.println("A = " + n.a); // Error: private

            System.out.println("B = " + n.b);
            System.out.println("C = " + n.c);
            System.out.println("D = " + n.d);

            System.out.println("-----------------------------");

            Test t = new Test();
            t.show();
        }
    }
}

