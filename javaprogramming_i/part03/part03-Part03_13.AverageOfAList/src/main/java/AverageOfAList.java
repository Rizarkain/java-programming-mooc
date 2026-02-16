
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        int numbers = 0;
        for (Integer number: list) {
            sum += number;
            numbers++;
        }
        System.out.println("Average: " + (1.0 * sum / numbers));
    }
}
