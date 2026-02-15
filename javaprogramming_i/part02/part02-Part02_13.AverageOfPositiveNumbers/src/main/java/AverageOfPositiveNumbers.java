
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        int total = 0;
        
        while (true) {
            System.out.println("Give a number:");
            double givenNumber = Double.valueOf(scanner.nextLine());
            
            if (givenNumber == 0) {
                System.out.println("nnot");
                break;
            }
            if (givenNumber < 0) {
                System.out.println("Cannot calculate the average");
                continue;
            }
            
            average = average + givenNumber;
            total = total + 1;
            
            
        }
        System.out.println("Average of positive numbers: " + (average / total));
    }
}
