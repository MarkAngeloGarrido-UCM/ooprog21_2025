import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check: "); //changed >> to : cuz it makes more sense
        check1 = input.nextDouble(); // Change the int to double cuz 15% can have decimals

        System.out.print("Enter the amount of your friend's check: ");
        check2 = input.nextDouble(); // added a dot  

        calcTip(check1);
        calcTip(check2);
    }

    public static void calcTip(double bill) { //added parameter cuz main method uses calcTip(check1)
        final double RATE = 0.15; //typo doubel
        double tip = bill * RATE; //corrected this into a formula from / to *
        System.out.println("The tip should be at least $" + tip);
    }
}
