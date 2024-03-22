import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        start();
    }

    public static void menu() {
        System.out.print(
            "------------------\n" +
            "(1) Find Change X\n" +
            "(2) NI\n" +
            "(3) NI\n" +
            "(4) NI\n" +
            "(5) Exit\n" +
            "------------------\n");
        System.out.print("(*) Select from the menu above: ");
    }

    public static void start() {
        boolean end = false;
        while (!end ) { // clean code
                int choice = readInt();
//                System.out.println("Input: "+choice);
                switch (choice) {
                    case 1:
                        findChangeX();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("Closing...");
                        end = true;
                        break;
                    default:
                        // print error
                }
        }
        System.out.println("Closed!");
        scanner.close();
    }

    public static void findChangeX() {
        try {
            int a, b, n;
            String answer, endpoint;
            double dec_answer;
            System.out.print("  Enter value of b: ");
            b = readInt();
            System.out.print("  Enter value of a: ");
            a = readInt();
            System.out.print("  Enter value of n: ");
            n = readInt();

            System.out.print("    Enter which endpoint is being searched for [left, middle, right]: ");
            endpoint = readString();
            if (endpoint.equalsIgnoreCase("left") || endpoint.equalsIgnoreCase("l")) {
                System.out.println("NI");
                start();
            }
            if (endpoint.equalsIgnoreCase("middle")) {
                System.out.println("The equation used is as follows: " + "(" + b + "-" + a + ")/" + n);
                answer = ((b - a) + "/" + n);
                dec_answer = ((b - a) / (double) n);
                System.out.println("Answer in fraction form: " + answer);
                System.out.println("Answer in decimal form: " + dec_answer);
            }
            if (endpoint.equalsIgnoreCase("right")) {
                System.out.println("NI");
                start();
            }

            System.out.println("Function complete!\n");
        } catch (InputMismatchException e) {
            System.out.println("(x) Please enter a valid integer!");
            findChangeX();
        }
    }

    private static int readInt() {
        while (true) {
            try {
                int val = scanner.nextInt();
                return val;
            } catch (InputMismatchException e) {
                System.err.println("Input must be a number");
                scanner.next();
            } catch (NoSuchElementException | IllegalStateException e) {
                System.err.println("Ran out of input");
                System.exit(1);
            }
        }
    }

    private static String readString() {
        while (true) {
            try {
                String val = scanner.next();
                return val;
            } catch (NoSuchElementException | IllegalStateException e) {
                System.err.println("Ran out of input");
                System.exit(1);
            }
        }
    }
}