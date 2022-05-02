public class ArrAvg {
    public static void main(String args[]) {
        double[] nums = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        double sum = 0;

        for ( double x: nums) sum += x;
        System.out.println("Average: " + (sum / nums.length));
    }
}
