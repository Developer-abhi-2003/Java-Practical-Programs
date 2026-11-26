
public class Main {
    interface shape{
        void calculateArea();
    }
    static class rectangle implements shape{
        int areaRec;
        @Override
        public void calculateArea() {
            int l = 10, b = 5;
            areaRec = l*b;
        }
    }
    public static void main(String[] args) {

        rectangle r = new rectangle();
        r.calculateArea();
        System.out.println("Area of Rectangle = " + r.areaRec);

    }
}