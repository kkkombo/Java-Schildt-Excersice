public class StringsTest {
    public static void main(String args[]) {
        String str1 = new String("String #1");
        String str2 = new String("String #2");
        String str3 = "String #3";
        String str4 = "String #3";

        System.out.println(str1 + "\n" + str2 + "\n");

        str2 = str1;

        System.out.println(str1 + "\n" + str2 + "\n");

        str1 = "Bla";
        System.out.println(str1 + "\n" + str2 + "\n" + str3);

        System.out.println("\nLength of string #3: " + str3.length());
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(str2.charAt(i));
        }
        if (!str1.equals(str2)) System.out.println("\n\"" + str1 + "\" and \"" + str2 + "\" are not the same.");

        System.out.println(str1.compareTo(str2) + " " + str2.compareTo(str3) + " " + str3.compareTo(str1));
        System.out.println(str3.compareTo(str4));

        System.out.println("\n" + str1 + str2);
        System.out.println();

        String str5 = "A long sentence to use with substring.";
        String substring = str5.substring(28, str5.length()-1);
        System.out.println(substring);
    }
}