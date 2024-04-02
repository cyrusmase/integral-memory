import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.*;


public class Math {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        start();
    }

    public static void menu() {
        System.out.print(
            "------------------\n" +
            "(1) Find Change X\n" +
            "(2) Applying Trapezoidal Rule\n" +
            "(3) NI\n" +
            "(4) NI\n" +
            "(5) Exit\n" +
            "------------------\n");
        System.out.print("(*) Select from the menu above: ");
    }

    public static void start(){
        boolean end = false;
        while (!end ) { // clean code
                int choice = readInt();
//                System.out.println("Input: "+choice);
                switch (choice) {
                    case 1:
                        findChangeX();
                        break;
                    case 2:
                        findTrap();
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

    public static void findTrap(){
    try{
        double b,a,n,changeX;
        int Trap_n;
        String check = null;
        String fixIn;
        double[] ar;
        System.out.println("Please enter the variables for change X using ENTER to seperate variables!");
        System.out.print("What is the value for B?: ");
        b=scanner.nextDouble();
        System.out.print("What is the value for A?: ");
        a=scanner.nextDouble();
        System.out.print("What is the value for N?: ");
        n=scanner.nextDouble();
        System.out.print("Awesome! You entered: "+b+" for B; "+a+" for A; and "+n+" for N. Is this correct? [Y/N]");
        check=scanner.next();
        if(check.equalsIgnoreCase("y")){

        }else if(check.equalsIgnoreCase("n")){
            System.out.print("Which entry is incorrect? [B/A/N]");
            fixIn = scanner.next();
            if(fixIn.equalsIgnoreCase("b")){
                System.out.print("Please enter the correct values for input B: ");
                b=scanner.nextDouble();
            }
            if(fixIn.equalsIgnoreCase("a")){
                System.out.print("Please enter the correct values for input A: ");
                a=scanner.nextDouble();
            }
            if(fixIn.equalsIgnoreCase("n")){
                System.out.print("Please enter the correct values for input N: ");
                n=scanner.nextDouble();
            }
        }else if(check.equals(null)){
            System.out.println("Error check = NULL; Invalid input!");
        }
        changeX = ((b - a) + n);
        System.out.println("How many values of X are there? This should be something similar to the value for 'N' entered earlier!");
        System.out.print("Number of X values: ");
        Trap_n = scanner.nextInt();
        ar = new double[Trap_n];
        for(int i = 0; i<ar.length;i++){
            ar[i] = Trap_n;
            System.out.println("System says: Added to AR.");
        }
        for(int i = 0; i<ar.length;i++){
        System.out.println(ar[i]);    
        }
        
  
    }catch(InputMismatchException i){
        i.getMessage();
        System.out.println("Encountered an error! - Input Mismatch!");
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