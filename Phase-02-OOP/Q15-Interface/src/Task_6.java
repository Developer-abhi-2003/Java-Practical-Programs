public class Task_6 {
    interface MathOperations{
        static int square(int n) {return n*n;}
        static int cube(int n) { return n*n*n;}
    }
    public static void main (String []args){
        System.out.println("Square of 5 = " + MathOperations.square(5));
        System.out.println("Cube of 5 = " + MathOperations.cube(5));
    }
}
