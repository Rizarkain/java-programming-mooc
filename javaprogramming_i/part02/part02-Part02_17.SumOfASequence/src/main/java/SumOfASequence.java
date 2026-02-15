
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int sum = 0;   
        System.out.println(" ");
        int end = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i <= end; i++) {
            sum = sum + i;
            
        }
        System.out.println(sum);
    }
}
