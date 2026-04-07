
public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase(20);
        counter.increase(-40);
        counter.decrease(3);
        System.out.println(counter.value());
    }
}
