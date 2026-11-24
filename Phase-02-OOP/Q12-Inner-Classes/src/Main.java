
public class Main {

    static class outer {
        private int number = 100;

        class inner {
            void display(){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        outer o = new outer();
        outer.inner i = o.new inner();

        i.display();
    }
}