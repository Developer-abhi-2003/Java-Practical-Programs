public class AccessSpecifier_Approach2 {
    static class Numbers{
        private int a = 100;
        int b = 200;
        public int c = 300;
        protected int d = 400;

        void show(){

            System.out.println("From Show Function : ");
            System.out.println("A = " + a);
            System.out.println("B = " + b);
            System.out.println("C = " + c);
            System.out.println("D = " + d);
            System.out.println("____________________");
        }
    }
    public static void main(String[] args) {
        Numbers n = new Numbers();

        System.out.println("From main Function : ");
        System.out.println("A = " + n.a);
        System.out.println("B = " + n.b);
        System.out.println("C = " + n.c);
        System.out.println("D = " + n.d);
        System.out.println("____________________");

        n.show();
    }
}
