public class Task_11 {
    interface Payment{
        void pay(int amount);
    }
    static class UPI implements Payment{
        @Override
        public void pay(int amount){
            System.out.println("Payment through UPI = " + amount);
        }
    }

    static class CreditCard implements Payment{
        @Override
        public void pay(int amount) {
            System.out.println("Payment through Credit Card = " + amount);
        }
    }

    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(50000);
    }
}
