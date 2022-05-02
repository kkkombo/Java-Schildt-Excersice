public class ExceptionDemoContinue {
    public static void main(String[] args) {
        int[] numer = { 4, 8, 16, 32, 64, 128 };
        int[] denum = { 2, 0, 4, 4, 0, 8 };
        for(int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denum[i] + " is " +
                        numer[i]/denum[i]);
            }
            catch (ArithmeticException exc) {
                // Catch the exception.
                System.out.println("Can't divide by Zero!");
            }
        }
    }
}
