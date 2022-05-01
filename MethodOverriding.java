public class MethodOverriding {
    int i, j;
    MethodOverriding(int a, int b) {
        i = a;
        j = b;
    }
    // Display i and j.
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends MethodOverriding {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Display k – this overrides show() in A.
    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // this calls show() in B
    }
}