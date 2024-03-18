import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Math{

    public static void main(String[] args){
    menu();
    start(); 
    }
    public static void menu(){
        System.out.print("------------------\n(1) Find Change X\n------------------\n");
        System.out.print("(*) Select from the menu above: ");
    }
    public static void start(){
        Scanner c = new Scanner(System.in);
        try{
        int choice;
        choice = c.nextInt();
       // System.out.println("Input: "+choice);
        switch(choice){
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
            
            break;
        }
        c.close();
    }catch(InputMismatchException e){
        System.out.println("\n(x) Please enter a VALID choice from the list!\n");
        menu();
        start();
    }
}
    public static void findChangeX(){
        try{
        int a,b,n;
        String answer;
        double dec_answer;
        Scanner x = new Scanner(System.in);
        System.out.print("  Enter value of b: ");
        b = x.nextInt();
        System.out.print("  Enter value of a: ");
        a = x.nextInt();
        System.out.print("  Enter value of n: ");
        n = x.nextInt();
        answer = ((b-a)+"/"+n);
        dec_answer = ((b-a)/n);
        x.close();
        System.out.println("Answer in fraction form: "+ answer);
        System.out.println("Answer in decimal form: "+ dec_answer);
        System.out.println("Function complete!\n");
        }catch(InputMismatchException e){
            System.out.println("(x) Please enter a valid integer!");
            findChangeX();
        }

    }
}