package Loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;
        System.out.println("how many hours did you work ?");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();
        while (hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. try again");
            hoursWorked = input.nextDouble();
        }
        input.close();
        double grossPay = hoursWorked * rate;
        System.out.println("Gross pay : " + grossPay);
    }
}
