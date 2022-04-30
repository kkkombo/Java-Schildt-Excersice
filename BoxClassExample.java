public class BoxClassExample {
    double width, height, depth;

    BoxClassExample(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Constructor used if no arguments specified.
    BoxClassExample() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    // Constructor used for a cube.
    BoxClassExample(double len) {
        this.width = this.height = this.depth = len;
    }

    double getVol () {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        BoxClassExample mybox1 = new BoxClassExample(10, 15, 20);
        BoxClassExample mybox2 = new BoxClassExample();
        BoxClassExample mybox3 = new BoxClassExample(10);

        System.out.println("Volume of the box 1 is " + mybox1.getVol() + ".");
        System.out.println("Volume of the box 3 is " + mybox3.getVol() + ".");
    }
}
