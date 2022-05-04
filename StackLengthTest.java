public class StackLengthTest {
    private int stck[];
    private int tos;

    StackLengthTest(int size) {
        stck = new int[size];
        tos = -1;
    }

    void push(int item) {
        // Stack length is items + 1.
        // If tos is 5 then 5th element already there because stck[++tos].
        if (tos == stck.length-1) {
            System.out.println("Stack is full.");
        } else {
            // If tos -1 then it will be the first item stck[0].
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        } else {
            // First return stck[tos == 4] then decrement.
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        StackLengthTest mystack1;
        mystack1 = new StackLengthTest(5);
        StackLengthTest mystack2 = new StackLengthTest(10);

        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 10; i++) mystack2.push(i);

        System.out.println("Stack in mystack1: ");
        for(int i = 0; i < 5; i++)
            System.out.print(mystack1.pop() + " ");

        System.out.println("\nStack in mystack2: ");
        for(int i = 0; i < 10; i++)
            System.out.print(mystack2.pop() + " ");
    }
}
