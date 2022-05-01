public class InheritanceShapes {
    private double width; // these are
    private double height; // now private

    // A default constructor.
    InheritanceShapes() {
        width = height = 0.0;
    }

    // Parameterized constructor.
    InheritanceShapes(double w, double h) {
        width = w;
        height = h;
    }

    // Construct object with equal width and height.
    InheritanceShapes(double x) {
        width = height = x;
    }

    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height + ".");
    }
}
// A subclass of TwoDShape for triangles.
class Triangle extends InheritanceShapes {
    private String style;

    // A default constructor.
    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }

    // One argument constructor.
    Triangle(double x) {
        super(x); // call superclass constructor
        style = "filled";
    }

    double area() {
        return getWidth() * getHeight() / 2;
    }
    void setStyle(String s) { style = s; }
    void showStyle() {
        System.out.println("Triangle is " + style + ".");
    }
}

// Extend Triangle.
class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s, w, h);
        color = c;
    }

    String getColor() { return color; }
    void showColor() { System.out.println("Color is " + color + ".");
    }
}

class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        var ct1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle ct2 = new ColorTriangle("Red", "filled", 2.0, 2.0);

        t1.setWidth(4.0);
        t1.setHeight(4.0);
        t1.setStyle("filled");

        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.setStyle("outlined");

        System.out.println("\nInfo for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area() + ".");

        System.out.println("\nInfo for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area() + ".");

        System.out.println("\nInfo for ct1: ");
        ct1.showStyle();
        ct1.showDim();
        ct1.showColor();
        System.out.println("Area is " + ct1.area() + ".");

        System.out.println("\nInfo for ct2: ");
        ct2.showStyle();
        ct2.showDim();
        ct2.showColor();
        System.out.println("Area is " + ct2.area() + ".");
    }
}