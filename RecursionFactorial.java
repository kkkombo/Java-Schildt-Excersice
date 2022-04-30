public class RecursionFactorial {
    int n;

    int computeFactorial (int n) {
        this.n = n;
        if (n == 1) return 1;
        int result = n * computeFactorial(n-1);
        return result;
    }
}

class FasctorialTest {
    public static void main(String args[]) {
        var fact = new RecursionFactorial();
        System.out.println("Factor of 5 is " + fact.computeFactorial(5));
    }
}
