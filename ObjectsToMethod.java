public class ObjectsToMethod {
    int a, b, c, volume;

    ObjectsToMethod(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }
    // Return true if ob defines same block.
    boolean sameBlock(ObjectsToMethod obj) {
        if((obj.a == a) & (obj.b == b) & (obj.c == c)) return true;
        else return false;
    }
    // Return true if ob has same volume.
    boolean sameVolume(ObjectsToMethod obj) {
        if(obj.volume == volume) return true;
        else return false;
    }
}
class PassObj {
    public static void main(String[] args) {
        var ob1 = new ObjectsToMethod(10, 2, 5);
        var ob2 = new ObjectsToMethod(10, 2, 5);
        var ob3 = new ObjectsToMethod(4, 5, 5);
        System.out.println("ob1 same dimensions as ob2: " +
                ob1.sameBlock(ob2));
        System.out.println("ob1 same dimensions as ob3: " +
                ob1.sameBlock(ob3));
        System.out.println("ob1 same volume as ob3: " +
                ob1.sameVolume(ob3));
    }
}
