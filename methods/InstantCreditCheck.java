package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    static int reguiredSalary = 25000;
    static int reguiredCreditScore = 700;
    static Scanner scanner = new Scanner( System.in);
    public static void main(String[] args) {
       double salary = getSalary();
       int creditScore = getCreditScore();
      scanner.close();

   boolean qualified =  isUserQualified(salary , creditScore) ;
   notfiyUser(qualified);
 
    }

    private static void notfiyUser(boolean qualified) {
        if (qualified) System.out.println("Congrats!, You've been approved.");
        else System.out.println("Sorry, You've been declined.");
    }


    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= reguiredSalary && creditScore >= reguiredCreditScore){
            return true;
        }
        else return false;
    }

    private static int  getCreditScore() {
        System.out.println("Enter your credit score");
        int crediScore = scanner.nextInt();
        return crediScore;
    }

    private static double getSalary() {
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }
}
