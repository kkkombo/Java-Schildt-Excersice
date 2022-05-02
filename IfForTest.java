public class IfForTest {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 10; x++) {
            if (x == 0) {
                System.out.println("It's a " + x + ".");
            }
            else if (x%2 == 0) {
                System.out.println("It's an even number " + x + ".");
            }
            else {
                System.out.println("It's an odd number " + x + ".");
            }
        }
    }
}
