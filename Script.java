import java.util.Scanner;

/**
 * The {@code Script} class manages the introduction and main menu of the
 * "Live or Die" game. It allows players to start the game, view rules, or exit.
 *
 * <p>Function Breakdown:</p>
 * <ul>
 *   <li>Line 6: Script is one of the 3/4 main classes</li>
 *   <li>Line 9+: Startup page and menu display</li>
 *   <li>Line 19+: Starts the game using {@code Story.gameinfo()}</li>
 *   <li>Line 22+: Opens the rules screen</li>
 *   <li>Line 25+ and 65+: "Are you sure?" confirmation prompts</li>
 *   <li>Line 33+ and 72+: Exits the game</li>
 *   <li>Line 39+: Restarts the menu after invalid input</li>
 *   <li>Line 52+: Displays the rules of the game</li>
 *   <li>Line 88+: Handles invalid inputs via {@code grammer()}</li>
 * </ul>
 */
public class Script { 
    
    /**
     * Displays the game's main menu and handles user input to:
     * <ul>
     *   <li>Start the game</li>
     *   <li>View rules</li>
     *   <li>Exit the game (with confirmation)</li>
     * </ul>
     * Recursively calls itself on invalid input.
     */
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
            } else {
                grammer();
                intro();
            }

        } else {
            grammer();
            intro();
        } 
    }  
     
    /**
     * Displays the rules of the game and offers the user the option to:
     * <ul>
     *   <li>Return to the main menu</li>
     *   <li>Exit the program (with confirmation)</li>
     * </ul>
     * Loops on invalid input.
     */
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
            } else {
                grammer();
                rules();
            }
        } else {
            grammer();
            rules();
        }
    }

    /**
     * Handles user input errors by displaying a warning
     * and requesting valid input. Called whenever input is not an
     * expected integer value.
     */
    public static void grammer() { 
        System.out.println("");
        System.out.println("\033[0;1mYou need to input a Valid Number/Letter.\033[22m");
    }
}
