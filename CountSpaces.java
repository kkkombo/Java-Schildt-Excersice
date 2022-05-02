public class CountSpaces {
    public static void main(String[] args) throws java.io.IOException {
        char inputChar;
        int spaceCount = 0;

        System.out.println("Input characters. Press \".\" to exit.");

        do {
            inputChar = (char) System.in.read();
            if (inputChar == ' ') spaceCount++;
        } while (inputChar != '.');

        System.out.println("Number of whitespaces in this character string is: " + spaceCount);
    }
}
