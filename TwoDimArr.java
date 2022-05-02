public class TwoDimArr {
    public static void main(String args[]) {
        int[][] nums = new int[10][2];

        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums[1].length; b++) {
                nums[a][b] = (a + 1) + b * a * (a + 1);
            }
        }
        // Conventional for loop.
        for (int a = 0; a < nums.length; a++) {
            System.out.println();
            for (int b = 0; b < nums[1].length; b++) {
                System.out.print(nums[a][b] + "\t");
            }
        }

        System.out.print("\n");
        // For-Each loop.
        for (int x[]: nums) {
            for (int y: x) System.out.print(y + " ");
        }
    }
}
