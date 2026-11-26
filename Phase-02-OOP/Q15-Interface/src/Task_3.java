public class Task_3 {
    interface Vehicle{void start();}
    interface Car extends Vehicle{void drive();}

    static class BMW implements Car{
        @Override
        public void start(){
            System.out.println("Vehicle is Started.....");
        }
        @Override
        public void drive(){
            System.out.println("BMW is Driving.....");
        }
    }

    public static void main (String []args){
        BMW BMW = new BMW();
        BMW.start();
        BMW.drive();
    }
}
