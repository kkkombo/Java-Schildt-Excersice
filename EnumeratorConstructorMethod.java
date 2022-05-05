// Use an enum constructor, instance variable, and method.

enum TransportConstr {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed; // typical speed of each transport

    // Constructor
    TransportConstr(int s) { speed = s; }
    int getSpeed() { return speed; }
}

class EnumeratorConstructorMethod {
    public static void main(String[] args)
    {
        Transport tp;

        // Display speed of an airplane.
        System.out.println("Typical speed for an airplane is " +
                TransportConstr.AIRPLANE.getSpeed() + " miles per hour.\n");

        // Display all Transports and speeds.
        System.out.println("All Transport speeds: ");
        for(TransportConstr t : TransportConstr.values())
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
    }
}