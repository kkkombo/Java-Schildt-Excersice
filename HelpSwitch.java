public class HelpSwitch {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        System.out.println("Make a choice:");
        System.out.println("\t1. If\n\t2. Switch\n\t3. For\n\t4. Do\n\t5. Do-while");

        do {
            choice = (char) System.in.read();
            if (choice == 'q') {
                System.out.println("Quitting!");
                break;
            }
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' || choice > '5');

        switch (choice) {
            case '1':
                System.out.println("You've chosen if.");
                break;
            case '2':
                System.out.println("You've chosen switch.");
                break;
            case '3':
                System.out.println("You've chosen for.");
                break;
            case '4':
                System.out.println("You've chosen do.");
                break;
            case '5':
                System.out.println("You've chosen do-while.");
                break;
        }
    }
}
