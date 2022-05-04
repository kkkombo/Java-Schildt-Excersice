// Use the built-in enumeration methods.
// An enumeration of Transport varieties.
enum EnumeratorValue {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;
        System.out.println("Here are all Transport constants");

        // Use values().
        Transport[] allTransports = Transport.values();
        for (Transport t : allTransports)
            System.out.println(t);
        System.out.println();

        // Use valueOf().
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}