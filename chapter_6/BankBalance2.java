import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 100; // starting balance
        double rate = 0.03;
        int choice, year = 1;

        do {
            System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes\nor any other number for no >> ");
            choice = sc.nextInt();
            if (choice != 1) break;
            balance += balance * rate;
            year++;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f\n", year, rate, balance);
        } while (choice == 1);

        sc.close();
    }
}