public class Fibonacchi {
    int size;
    int[] q;

    Fibonacchi(int size) {
        this.size = size;
        q = new int[size];
    }

    int[] fillFib() {
        q[0] = 0;
        q[1] = 1;
        for (int i = 2; i < size; i++) q[i] = q[i-1] + q[i-2];
        return q;
    }
}

class FibonnacchiTest {
    public static void main(String args[]) {
        var obj = new Fibonacchi(10);
        obj.fillFib();
        for (int i = 0; i < obj.size; i++) System.out.println(obj.q[i]);
    }
}
