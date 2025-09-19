public class DemoGrossPay{
   public static void calculateGross(double hoursWorked) {
   double hourly = 22.75;
   double grossPay = hoursWorked * hourly;
   System.out.println(hoursWorked + " hours at $" + " per hour is $" + grossPay);
   }
   
   public static void main(String[] args){
   calculateGross(10.0);
   calculateGross(25.0);
   calculateGross(37.5);
   }
}
