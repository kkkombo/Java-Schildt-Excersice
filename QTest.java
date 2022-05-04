class QTest {
    private char[] q;
    private int indexPut, size;

    QTest (int size) {
        this.size = size;
        q = new char[size];
        indexPut = 0;
    }

    QTest (QTest obj) {
        indexPut = obj.indexPut;
        q = new char[obj.size];

        // Copy elements from overloaded object to the new one.
        for (int x: q) q[x] = obj.q[x];
    }

    // Construct a Queue with initial values.
    QTest (char[] a) {
        indexPut = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) put(a[i]);
    }

    int getSize() {
        return size;
    }

    char[] getArray() {
        return q;
    }

    void put (char valuePut) {
        if (indexPut == (q.length)) {
            System.out.println("Queue is full!");
            return;
        }
        q[indexPut++] = valuePut;
    }

    char get () {
         if (indexPut == 0) {
             System.out.println("Queue is empty!");
             return 0;
         }
         return q[--indexPut];
    }
}

class QTestDemo {
    public static void main(String args[]) {
        char ch;
        int i;
        QTest smallQ = new QTest(5);

        System.out.println("Adding: ");
        for (i = 0; i < 6; i++) {
            // Warning from put method won't be shown.
            if (i >= smallQ.getSize()) {
                break;
            }
            smallQ.put((char) ('A' + i));
            System.out.println((char) ('A' + i) + " with index " + i + ".");
        }

        // Conventional array print style.
        System.out.println("\n\nGetting current array: ");
        for (i = 0; i < smallQ.getSize(); i++) {
            System.out.print(smallQ.get() + " ");
        }

        // For-Each for Loop array print style.
        System.out.println("\n");
        for (int x: smallQ.getArray()) System.out.print((char) x + " ");

    }
}
