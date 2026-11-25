package package2;

import package1.Parent;

public class Child extends Parent{

    void display(){
        System.out.println("Form Display Fucntion :-");
//        System.out.println("A = " + a);     // Error: private
//        System.out.println("B = " + b);     // Error: default
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println("_________________________");

    }

    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();

        System.out.println("From Main Function :-");
//        System.out.println("A = " + p.a);     // Error: private
//        System.out.println("B = " + p.b);     // Error: default
//        System.out.println("C = " + p.c);     // Error: protected
        System.out.println("D = " + p.d);
        System.out.println("_________________________");

        c.display();
    }
}
