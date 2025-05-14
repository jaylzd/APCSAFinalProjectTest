/** 
 * Script class is the introduction the main page going over rules,
    starting and exiting the game
 * Line 6 3/4 classes
 * Line 9+ is the start up page
 * Line 19+ is starting the game
 * Line 22+ is the rules starter
 * Line 25+ and 65+ is the are you sure code just double checking they want to
 * Line 33+ and 72+ ends the game
 * Line 39+ restarts the code
 * Line 52+ is the overview of the rules
 * Line 88+ is the grammer code to call when the user doesnt input a valid int or string
 * */
import java.util.Scanner;
public class Script { 
    
    public static void intro() {  
        System.out.println("");
        System.out.println("\033[0;1mHello! Welcome to Live or Die!");
        System.out.println("Start game (1)");
        System.out.println("Rules (2)");
        System.out.println("Leave (3)\033[22m");
        System.out.println("");
        Scanner introsc = new Scanner(System.in);
        int a = introsc.nextInt();
        if (a == 1) { 
            Story.gameinfo();
        } else if (a == 2) {
            rules();
        } else if (a == 3) { 
            System.out.println("");
            System.out.println("\033[0;1mAre you sure?");
            System.out.println("1 -> Yes");
            System.out.println("2 -> No\033[22m");
            System.out.println("");
            int b = introsc.nextInt();
                if (b == 1) { 
                    System.out.println("");
                    System.out.println("\033[0;1mExiting....\033[22m");
                    System.exit(0);
                } else if (b == 2) {
                    intro(); 
        }else{
            grammer();
            intro();
        }
        
        }else{
            grammer();
            intro();
        } 
    }  
     
    public static void rules() { 
        Scanner rulessc = new Scanner(System.in);
            System.out.println("");
            System.out.println("\033[0;1m1. have a good time!");
            System.out.println("");
            System.out.println("Return to Main page?");
            System.out.println("1 -> Yes");
            System.out.println("2 -> No, ending program\033[22m");
            System.out.println("");
            int a = rulessc.nextInt();
            if (a == 1) {
                intro();
            } else if (a == 2) { 
                System.out.println("");
                System.out.println("\033[0;1mAre you sure?");
                System.out.println("1 -> Yes");
                System.out.println("2 -> No\033[22m");
                System.out.println("");
                int b = rulessc.nextInt();
                if (b == 1) { 
                    System.out.println("");
                    System.out.println("\033[0;1mExiting....\033[22m");
                    System.exit(0);
                } else if (b == 2) {
                    rules();
                }else{
                    grammer();
                    rules();
                }
            }else{
                grammer();
                rules();
            }
        }
        public static void grammer() { 
        System.out.println("");
        System.out.println("\033[0;1mYou need to input a Valid Number/Letter.\033[22m");
    }
}