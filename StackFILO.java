public class StackFILO {
    private char[] stck;
    private int tos;

    // Constructor for stack given size.
    StackFILO(int size) {
        stck = new char[size];
        tos = 0;
    }

    // Constructor for stack given array.
    StackFILO(char[] a) {
        stck = new char[a.length];
        tos = 0;

        for (int i = 0; i < a.length; i++) push(a[i]);
    }

    // Constructor for stack given stack object.
    StackFILO(StackFILO obj) {
        tos = obj.tos;
        stck = new char[obj.stck.length];

        for (int i = 0; i < tos; i++) stck[i] = obj.stck[i];
    }

    void push(char ch) {
        if (tos == stck.length) {
            System.out.println("The stack is full, try another stack.");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    char pop() {
        if (tos == 0) {
            System.out.println("Stack is empty :(");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

class FILODemo {
    public static void main(String[] args) {
        // Construct 10-element empty stack.
        StackFILO stk1 = new StackFILO(10);
        char[] name = {'T', 'o', 'm'};

        // Construct stack from array.
        StackFILO stk2 = new StackFILO(name);
        char ch;
        int i;
        // put some characters into stk1.
        for (i = 0; i < 10; i++) stk1.push((char) ('A' + i));

        // Construct stack from another stack.
        StackFILO stk3 = new StackFILO(stk1);

        // Show the stacks.
        System.out.print("Contents of stk1: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");
        System.out.print("Contents of stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}