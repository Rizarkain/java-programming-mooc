
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number:");
        int second = Integer.valueOf(scanner.nextLine());
        if (first >= 0 && second >= 0) {
            double sum = (first + second);
            System.out.println("Square root of the sum: " + (Math.sqrt(sum)));
        } else {
            System.out.println("You wrote a negative value!");
        }

    }
}
