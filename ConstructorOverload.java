public class ConstructorOverload {
    int x;

    ConstructorOverload() {
        System.out.println("Inside MyClass().");
        x = 0;
    }

    ConstructorOverload(int i) {
        System.out.println("Inside MyClass(int).");
        x = i;
    }

    ConstructorOverload(double d) {
        System.out.println("Inside MyClass(double).");
        x = (int) d;
    }

    ConstructorOverload(int i, int j) {
        System.out.println("Inside MyClass(int, int).");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        var t1 = new ConstructorOverload();
        var t2 = new ConstructorOverload(88);
        var t3 = new ConstructorOverload(17.23);
        var t4 = new ConstructorOverload(2, 4);
        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
