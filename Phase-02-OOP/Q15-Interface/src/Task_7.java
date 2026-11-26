public class Task_7 {
    interface Calculator{
        private void displayMessage(){
            System.out.println("Performing Calculation...");
        }
        default int addition(int a, int b){
            displayMessage();
            return a+b;
        }
        default int substraction(int a, int b){
            displayMessage();
            return a-b;
        }
    }
    class  MyCalculator implements Calculator{}

    public static void main(String[] args) {
        Task_7 obj = new Task_7();
        Task_7.MyCalculator calculator = obj.new MyCalculator();

        System.out.println("Addition = "+calculator.addition(20, 10));
        System.out.println("---------------------------------");
        System.out.println("Addition = "+calculator.substraction(20, 10));

    }
}
