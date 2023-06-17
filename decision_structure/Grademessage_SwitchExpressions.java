package decision_structure;

import java.util.Scanner;

public class Grademessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();
        String message = switch (grade){

            case "A" -> "Excellent job!";

            case "B" ->  "Great job!";

            case "C" -> "Good job!";

            case "D" -> "You need to work a bit harder";

            case "F" -> "Uh oh";


            default -> "Error. Invalid grade";
        };
        System.out.println(message);
    }
}
