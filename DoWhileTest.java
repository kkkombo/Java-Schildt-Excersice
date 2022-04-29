public class DoWhileTest {
    public static void main(String args[]) {
        int n = 10;

        do {
            System.out.println("tick " + n);
        } while (n-- > 0);

        int i = 0;
        while (i < 5) System.out.println(i++);
    }
}
