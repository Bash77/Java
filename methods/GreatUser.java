package methods;

import java.util.Scanner;

public class GreatUser {
    public static void main(String[] args) {
        String name = getUserName();
        GreatUser(name);
    }

    private static String getUserName() {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }
    public static void GreatUser( String name){
        System.out.println("Hi there, " + name);
    }
}
