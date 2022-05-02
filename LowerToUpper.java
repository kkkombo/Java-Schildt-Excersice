public class LowerToUpper {
    public static void main(String[] args) throws java.io.IOException {
        char inputChar;
        int CONVERSION_VALUE = 32;

        System.out.println("Input alphabet characters. Press \".\" to exit:");

        do {
            inputChar = (char) System.in.read();
            if (inputChar >= 'a' & inputChar <= 'z') {
                System.out.print((char) (inputChar - CONVERSION_VALUE));
            }
            else if (inputChar >= 'A' & inputChar <= 'Z') {
                System.out.print((char) (inputChar + CONVERSION_VALUE));
            }
            else {
                System.out.print(inputChar);
            }
        } while (inputChar != '.');
    }
}
