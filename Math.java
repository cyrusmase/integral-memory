import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Math{
    public static void menu(){
        System.out.print("------------------\n(1) Find Change X\n(2) NI\n(3) NI\n(4) NI\n(5) Exit\n------------------\n");
        System.out.print("(*) Select from the menu above: ");
    }
    public static void start(){
        boolean end = false;
        while(end != true){
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
            System.out.println("Closing...");
            end = true;
            break;
        }
   
    }catch(InputMismatchException e){
        System.out.println("\n(x) Please enter a VALID choice from the list!\n");
        menu();
        start();
    }
    System.out.println("Closed!");
    c.close();
}
}
    public static void findChangeX(){
        try{
        int a,b,n;
        String answer,endpoint;
        double dec_answer;
        Scanner x = new Scanner(System.in);
        System.out.print("  Enter value of b: ");
        b = x.nextInt();
        System.out.print("  Enter value of a: ");
        a = x.nextInt();
        System.out.print("  Enter value of n: ");
        n = x.nextInt();
        System.out.print("    Enter which endpoint is being searched for [left, middle, right]: ");
        endpoint = x.next();
        if(endpoint.equalsIgnoreCase("left")){
            System.out.println("NI");
            start();
        }
        if(endpoint.equalsIgnoreCase("middle")){
            System.out.println("The equation used is as follows: "+"("+b+"-"+a+")/"+n);
            answer = ((b-a)+"/"+n);
            dec_answer = ((b-a)/n);
            System.out.println("Answer in fraction form: "+ answer);
            System.out.println("Answer in decimal form: "+ dec_answer);
        }
        if(endpoint.equalsIgnoreCase("right")){
            System.out.println("NI");
            start();
        }

        x.close();
        System.out.println("Function complete!\n");
        }catch(InputMismatchException e){
            System.out.println("(x) Please enter a valid integer!");
            findChangeX();
        }

    }
    public static void main(String[] args){
        menu();
        start(); 
        }
}