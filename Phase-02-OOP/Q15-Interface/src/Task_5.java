public class Task_5 {
    interface Bank{
        void getRateOfInterest();

        default void displayBankName() {
            System.out.println("Welcome to the Bank");
        }
    }
    static class SBI implements Bank{
        @Override
        public void getRateOfInterest(){
            System.out.println("Rate of Interest = 6%");
        }
        @Override
        public void displayBankName(){
            System.out.println("Welcome to State Bank of India");
        }
    }

    public static void main (String[] args){
        SBI sbi = new SBI();
        sbi.displayBankName();
        sbi.getRateOfInterest();

    }
}
