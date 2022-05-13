// Use a wildcard.
class NumericFnsWC<T extends Number> {
    T num;
    // Pass the constructor a reference to a numeric object.
    NumericFnsWC(T n) {
        num = n;
    }
    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    // Determine if the absolute values of two objects are the same.
    boolean absEqual(NumericFnsWC<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}

public class GenericsWildCard {
    public static void main(String[] args) {
        NumericFnsWC<Integer> iOb = new NumericFnsWC<Integer>(6);
        NumericFnsWC<Double> dOb = new NumericFnsWC<Double>(-6.0);
        NumericFnsWC<Long> lOb = new NumericFnsWC<Long>(5L);
        System.out.println("Testing iOb and dOb.");
        if(iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
        System.out.println();
        System.out.println("Testing iOb and lOb.");
        if(iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}