
public class Main {

    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b, int c){
        return a+b+c;
    }

    static double add (double a, int b){
        return a+b;
    }

    static double add(double a, float b, int c){
        return a+b+c;
    }

    static float add(float a, float b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println(add(2, 5));
        System.out.println(add(5, 6, 4));
        System.out.println(add(5.5, 5));
        System.out.println(add(5.55, 5.8f, 4));
        System.out.println(add(8.0f, 4.6f, 3));
    }
}