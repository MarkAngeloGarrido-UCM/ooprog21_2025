import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       double otrate = 1.5;

        System.out.println("How many hours did you work this week? ");
        double weeklyhour = input.nextDouble();

        System.out.println("What is your regular pay rate? ");
        double regpay = input.nextDouble();

        double totalregpay = regpay * weeklyhour;
        double ot = totalregpay * otrate;
        double otfinal = ot - totalregpay;

        System.out.println("Regular pay is " + totalregpay);
        System.out.println("Overtime pay is:  " + otfinal);
    }
}

