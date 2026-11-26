public class Task_12 {
    interface Company{
        String COMPANY_NAME = "DRDO";
        int EMP_COUNT = 1000;
        String COUNTRY = "India";
    }

    public static void main(String[] args) {

        System.out.println("Company Name = " + Company.COMPANY_NAME);
        System.out.println("Employee Cont = " + Company.EMP_COUNT);
        System.out.println("Country = " + Company.COUNTRY);
    }
}
