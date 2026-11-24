public class LocalInnerClass {
    int num = 100;

    void display(){
        int value = 200;
        class inner{
            void show(){
                System.out.println("Number = " + num);
                System.out.println("Value = " + value);
            }
        }
        inner i = new inner();
        i.show();
    }


    public static void main(String[] args) {

        LocalInnerClass l = new LocalInnerClass();
        l.display();


    }
}
