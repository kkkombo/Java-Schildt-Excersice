public class QuicksortDemo {
    // Set up a call to the actual Quicksort method.
    static void qsort(char[] items) {
        qs(items, 0, items.length-1);
    }

    // A recursive version of Quicksort for characters.
    private static void qs(char[] items, int left, int right)
    {
        int i, j;
        char x, y;
        i = left; j = right;
        System.out.println("Left: " + left + " and right: " + right + ".");
        x = items[(left+right)/2];
        System.out.println("x is " + x + ".");
        do {
            while ((items[i] < x) && (i < right)) i++;
            while ((x < items[j]) && (j > left)) j--;
            System.out.println("After start i is now " + i + " and j is " + j + ".");
            if (i <= j) {
                System.out.println("Switching " + items[i] + " and " + items[j] + ".");
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
                System.out.println("After switching i is now " + i + " and j is " + j + ".");
                System.out.println("x is " + x + ".");
            }
        } while (i <= j);
        System.out.println("Before change left is " + left + " and right is " + right + ".");
        if (left < j) {
            System.out.println("Left is " + left + " and j is " + j + ".");
            qs(items, left, j);
        }
        if (i < right) {
            System.out.println("i is " + i + " and right is " + right + ".");
            qs(items, i, right);
        }
    }
}

class QSDemo {
    public static void main(String[] args) {
        char[] a = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Original array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
        System.out.println();

        // Sorting the array.
        QuicksortDemo.qsort(a);
        System.out.print("Sorted array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
    }
}