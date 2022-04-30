public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = {99 , -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Min: " + min + ".\nMax: " + max);

        // Bubble sort.
        for (a = 0; a < nums.length; a++) {
            System.out.println("Round #" + (a+1));
            for (b = (nums.length - 1); b > a; b--) {
                if (nums[b-1] > nums[b]) {
                    System.out.println("Switching " + nums[b-1] + " with " + nums[b]);
                    int t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }
        System.out.println("Final array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
