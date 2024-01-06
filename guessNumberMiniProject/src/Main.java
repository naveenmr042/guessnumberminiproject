
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int levelOption = 0;

        while(true) {
            System.out.println("press 1 for Easy level (1-100)");
            System.out.println("press 2 for Medium level (1-500)");
            System.out.println("press 3 for Hard level (1-1000)");
            System.out.println("Press 4 for Quit");
            System.out.println("Enter your choice :");
            levelOption = sc.nextInt();
            switch (levelOption) {
                case 1: {
                    easyLevel();
                    break;
                }
                case 2: {
                    mediumLevel();
                    break;
                }
                case 3: {
                    hardLevel();
                    break;
                }
                case 4: {
                    exit(1);
                }
                default:
                    System.out.println("Invalid Option !!");
                    System.out.println("Try Again !!");
                    System.out.println();
            }
        }
    }
         // Easy Level Block
    public static void easyLevel() {
        Scanner sc = new Scanner(System.in);

        int myNumber = 0,userNumber = 0;
        myNumber = (int)(Math.random()*100);

        do{
            System.out.println("Enter your Number :");
            userNumber = sc.nextInt();

            if(myNumber == userNumber) {
                System.out.println("WOOHOO ! YOUR GUESS IS CORRECT !!");
                System.out.println("YOU ARE EXCELLENT !!");
                break;
            }
            else if(myNumber > userNumber){
                System.out.println("Your number is too small ");
            }
            else {
                System.out.println("your number is too large ");
            }
        }while(userNumber > 0);

        System.out.print("My Number is :");
        System.out.println(myNumber);
        System.out.println();
    }


    // Medium Level Block
    public static void mediumLevel() {

        Scanner sc = new Scanner(System.in);

        int myNumber = 0,userNumber = 0;
        myNumber = (int)(Math.random()*500);

        do{
            System.out.println("Enter your Number :");
            userNumber = sc.nextInt();

            if(myNumber == userNumber) {
                System.out.println("WOOHOO ! YOUR GUESS IS CORRECT !!");
                System.out.println("YOU ARE EXCELLENT !!");
                break;
            }
            else if(myNumber > userNumber){
                System.out.println("Your number is too small ");
            }
            else {
                System.out.println("your number is too large ");
            }
        }while(userNumber > 0);

        System.out.print("My Number is :");
        System.out.println(myNumber);
        System.out.println();
    }

    // Hard Level Block
    public static void hardLevel() {

        Scanner sc = new Scanner(System.in);

        int myNumber = 0,userNumber = 0;
        myNumber = (int)(Math.random()*1000);

        do{
            System.out.println("Enter your Number :");
            userNumber = sc.nextInt();

            if(myNumber == userNumber) {
                System.out.println("WOOHOO ! YOUR GUESS IS CORRECT !!");
                System.out.println("YOU ARE EXCELLENT !!");
                break;
            }
            else if(myNumber > userNumber){
                System.out.println("Your number is too small ");
            }
            else {
                System.out.println("your number is too large ");
            }
        }while(userNumber > 0);

        System.out.print("My Number is :");
        System.out.println(myNumber);
        System.out.println();
    }
}
