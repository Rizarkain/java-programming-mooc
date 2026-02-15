
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int total = 0;
        
        while (true) {
            System.out.println("Give a number:");
            double number = Double.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number != 0) {
                average = average + number;
                total = total + 1;
            }
            
        }
        System.out.println("Average of the numbers: " + (average / total));
    }
}
