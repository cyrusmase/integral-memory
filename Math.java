import java.util.InputMismatchException;
import java.util.Scanner;
public class Math{
    public static void main(String[] args){
        System.out.print("------------------\n(1) Find Change X\n------------------\n");
        System.out.println("Select from the menu above: ");
    start(); 
    }
    public static void start(){
        Scanner c = new Scanner(System.in);
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
    }
    public static void findChangeX(){
        try{
        int a,b,n;
        String answer;
        Scanner x = new Scanner(System.in);
        System.out.print("enter value of b: ");
        b = x.nextInt();
        System.out.print("enter value of a: ");
        a = x.nextInt();
        System.out.print("enter value of n: ");
        n = x.nextInt();
        answer = ((b-a)+"/"+n);
        x.close();
        System.out.println("Answer: "+ answer);
        }catch(InputMismatchException e){
            System.out.println("Please enter a valid integer!");
            findChangeX();
        }

    }
}