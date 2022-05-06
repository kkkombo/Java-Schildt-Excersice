// Demonstrate ordinal() and compareTo().
// An enumeration of Transport varieties.
enum TransportMethods {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumeratorMethods {
    public static void main(String[] args)
    {
        TransportMethods tp, tp2, tp3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all Transport constants" +
                " and their ordinal values: ");
        for (TransportMethods t : TransportMethods.values()) System.out.println(t + " " + t.ordinal());
        tp = TransportMethods.AIRPLANE;
        tp2 = TransportMethods.TRAIN;
        tp3 = TransportMethods.AIRPLANE;
        System.out.println();

        // Demonstrate compareTo()
        if (tp.compareTo(tp2) < 0) System.out.println(tp + " comes before " + tp2);
        if (tp.compareTo(tp2) > 0) System.out.println(tp2 + " comes before " + tp);
        if (tp.compareTo(tp3) == 0) System.out.println(tp + " equals " + tp3);
    }
}
