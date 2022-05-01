public class DynamicMethodDispatch {
    void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends DynamicMethodDispatch {
    void who() {
        System.out.println("who() in Sub1");
    }
}

class Sub2 extends DynamicMethodDispatch {
    void who() {
        System.out.println("who() in Sub2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        var superOb = new DynamicMethodDispatch();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();
        DynamicMethodDispatch supRef;

        supRef = superOb;
        supRef.who();
        supRef = subOb1;
        supRef.who();
        supRef = subOb2;
        supRef.who();
    }
}