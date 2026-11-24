public class AnonymusClass {
    interface calculator{
        void calculate();
    }
    public static void main(String[] args) {
        calculator c = new calculator() {
            @Override
            public void calculate() {
                System.out.println("Sum = " +(20+30));
            }
        };
        c.calculate();
    }
}
