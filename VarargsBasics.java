public class VarargsBasics {
    // vaTest() uses a vararg.
    // v is an array.
    void vaTest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }
    public static void main(String[] args)
    {
        // vaTest() can be called with variable numbers of arguments.
        VarargsBasics obj = new VarargsBasics();
        // Or declare method with static -> no object needed. 
        obj.vaTest(10); // 1 arg
        obj.vaTest(1, 2, 3); // 3 args
        obj.vaTest(); // no args
    }
}
