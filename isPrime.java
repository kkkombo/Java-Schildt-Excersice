public class isPrime {
    public static void main(String[] args) {
        int i, j, d = 2, step = 1, x = 100;
        boolean isPrime = false;

        System.out.print("Evens are:");
        for (i = 2; i <= 100; i++) {
            if (i%2 == 0) System.out.print(" " + i);
        }
        System.out.println(".");

        System.out.print("Primes are:");
        for (i = 2; i <= 100; i++) {
            isPrime = true;
            for (j = 2; j <= i/j; j++) {
                if ((i % j) == 0) isPrime = false;
            }
            if (isPrime) System.out.print(" " + i);
        }
        System.out.println(".");

        System.out.print("Unique prime factors of " + x + " are:");
        while (x > 1) {
            if (x % d == 0) {
                System.out.print(" " + d);
                x /= d;
                while (x % d == 0) {
                    x /= d;
                }
            }
            d += step;
            step = 2;
        }
    }
}
