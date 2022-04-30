// Contains an error. Please don't run this shit.
class PandCTest {
    int n;

    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }

    synchronized void put(int n) {
        System.out.println("Put: " + n);
    }
}

class Producer implements Runnable {
    PandCTest q;
    Thread t;

    // Constructor for Producer.
    Producer(PandCTest q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }

    // Overwriting the existing run method from Runnable.
    public void run() {
        int i = 0;

        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    PandCTest q;
    Thread t;

    Consumer(PandCTest q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PC {
    public static void main(String args[]) {
        PandCTest q = new PandCTest();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // Start the threads.
        p.t.start();
        c.t.start();
    }
}