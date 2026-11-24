public class StaticNestedClass {
    static int number = 100;
    int value = 200;

    static class inner{
        void display(){
            System.out.println("Static variable = " + number);
            StaticNestedClass obj = new StaticNestedClass();
            System.out.println("Non-Static variable = " + obj.value);
        }
    }

    public static void main(String[] args) {

        StaticNestedClass.inner i = new StaticNestedClass.inner();
        i.display();

    }
}
