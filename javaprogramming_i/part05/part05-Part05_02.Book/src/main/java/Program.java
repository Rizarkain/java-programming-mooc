import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author?");
        String author = scanner.nextLine();
        System.out.println("Title?");
        String title = scanner.nextLine();
        System.out.println("Pages?");
        int pages = Integer.valueOf(scanner.nextLine());
        
        Book book = new Book(author, title, pages);
        System.out.println(book);
        

    }
}
