
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        int second = end;
        
        for (int first = beginning; first <= second; first++) {
            if (first % 3 == 0) {
                System.out.println(first);
            }    
        }
    }
}
