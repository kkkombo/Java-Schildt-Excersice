class Vehicle {
    private int passengers, fuelcap, mpg;

    Vehicle (int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    int getRange () {
        return (fuelcap * mpg);
    }

    double calculateFuelNeeded(int miles) {
        return (double) miles/mpg;
    }
}

// Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds
    // This is a constructor for Truck.
    Truck(int p, int f, int m, int cargocap) {
        // Using super keyword to refer to Vehicle constructor.
        super(p, f, m);
        this.cargocap = cargocap;
    }

    // Accessor methods for cargocap.
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TestVehicle {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);

        System.out.println("Minivan's range is: " + minivan.getRange());
        System.out.println("Minivan needs " + minivan.calculateFuelNeeded(100) + " gallons.");

        // Construct some trucks.
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;
        gallons = semi.calculateFuelNeeded(dist);
        System.out.println("Semi can carry " + semi.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles semi needs " +
                gallons + " gallons of fuel.\n");
        gallons = pickup.calculateFuelNeeded(dist);
        System.out.println("Pickup can carry " + pickup.getCargo() +
                " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " +
                gallons + " gallons of fuel.");
    }
}