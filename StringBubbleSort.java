class StrBubble {
    public static void main(String[] args) {
        String[] strs = {
                "this", "is", "a", "test",
                "of", "a", "string", "sort"
        };

        int a, b, size = strs.length;
        String t;

        // Display original array
        System.out.print("Original array is: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();

        // This is the bubble sort for strings.
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].length() > strs[b].length()) {
                    // Exchange elements if out of order.
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        }
        System.out.print("Sorted array is: ");
        for(int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
    }
}

