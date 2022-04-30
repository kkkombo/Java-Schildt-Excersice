class Vehicle {
    int passengers, fuelcap, mpg;

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

class TestVehicle {
    public static void main(String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);

        System.out.println("Minivan's range is: " + minivan.getRange());
        System.out.println("Minivan needs " + minivan.calculateFuelNeeded(100) + " gallons.");
    }
}
