public class Task_13 {
    interface Deposit {void deposit(double amount);}
    interface Withdraw {void withdraw(double amount);}
    interface Balance {void checkBalance();}

    static class BankAccount implements Deposit, Withdraw, Balance{

        double balance = 10000;

        @Override
        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid Deposit Amount!");
                return;
            }
            balance += amount;
            System.out.println("Deposited = " + amount);
        }

        @Override
        public void withdraw(double amount) {
            if (amount <= 0){
                System.out.println("Invalid Withdrawal Amount!");
                return;
            }
            if (amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn = " + amount);
            }
            else{
                System.out.println("Isnsuficient Balance!");
            }
        }

        @Override
        public void checkBalance() {
            System.out.println("Current Balance = " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.checkBalance();
        account.deposit(-50000);
        account.withdraw(34240);
        account.checkBalance();
    }
}
