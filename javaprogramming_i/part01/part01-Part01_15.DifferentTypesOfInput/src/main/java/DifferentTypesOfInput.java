
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string:");
        String string = scanner.nextLine();
        System.out.println("Give an integer:");
        int integer1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double double1 = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boolean1 = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + string);
        System.out.println("You gave the integer " + integer1);
        System.out.println("You gave the double " + double1);
        System.out.println("You gave the boolean " + boolean1);

        // Write your program here

    }
}
