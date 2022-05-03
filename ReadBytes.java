// Read an array of bytes from the keyboard.
import java.io.*;

class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[5];
        System.out.println("Enter some characters:");
        System.in.read(data);
        System.out.print("You entered: ");
        // Try without (char) = get ASCII codes instead.
        for (int i = 0; i < data.length; i++) System.out.println((char) data[i]);
    }
}