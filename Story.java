/**
 * The Story class is the main driver for the game.
 * It includes a character creator and a simple 3-round ball-following game.
 *
 * <p>Code breakdown by sections:
 * <ul>
 *   <li>Lines 13+: Gets the information: asking name, age, and gender</li>
 *   <li>Line 17+: Asking the name</li>
 *   <li>Line 22+: Ensures the input is correct and doesn't error</li>
 *   <li>Line 33+: Asking for gender</li>
 *   <li>Line 40+: Ensures the input is correct and doesn't error</li>
 *   <li>Line 49+: Asking for age</li>
 *   <li>Line 54+: Ensures the input is correct and doesn't error</li>
 *   <li>Line 62: Creates and prints the character data</li>
 *   <li>Line 67+: Proceeding to the next section of code</li>
 *   <li>Line 81+: Game introduction and explanation</li>
 *   <li>Line 83: Storing left/right variables for the game</li>
 *   <li>Line 92: Ball location</li>
 *   <li>Line 95+: Adding moves to the array for the game</li>
 *   <li>Line 104+: Defining lefts and rights in the array</li>
 *   <li>Line 114+: Pass/fail logic for round 1</li>
 *   <li>Line 126+: More left/right variables for round 2</li>
 *   <li>Line 140+: Pass/fail logic for round 2</li>
 *   <li>Line 155+: More left/right variables for round 3</li>
 *   <li>Line 162+: Pass/fail logic for round 3</li>
 *   <li>Line 166+: Win message if all 3 rounds are passed</li>
 *   <li>Line 193+: Grammar check for invalid input</li>
 *   <li>Line 198+: Confirmation for locking in decision</li>
 * </ul>
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Story {
    static String as = "";
    static String bs = "";
    static int cs;

    /**
     * Collects and validates user input for character creation: name, gender, and age.
     * Also displays the character info and provides the option to edit before starting the game.
     */
    public static void gameinfo() {
        Scanner gamesc = new Scanner(System.in);
        System.out.println("");
        System.out.println("\033[0;1mWhats your Name?");
        System.out.println("1 -> Annie");
        System.out.println("2 -> josh\033[22m");
        System.out.println("");
        int a = gamesc.nextInt();
        if (a == 1) {
            as = "Annie";
        } else if (a == 2) {
            as = "Josh";
        } else {
            grammer();
            gameinfo();
        }

        System.out.println("");
        System.out.println("\033[0;1mWhats your Gender?");
        System.out.println("1 -> Female");
        System.out.println("2 -> Male\033[0;22m");
        System.out.println("");
        int b = gamesc.nextInt();
        if (b == 1) {
            bs = "Female";
        } else if (b == 2) {
            bs = "Male";
        } else {
            grammer();
            gameinfo();
        }

        System.out.println("");
        System.out.println("\033[0;1mWhats your Age?\033[22m");
        System.out.println("");
        int c = gamesc.nextInt();
        if (!(c >= 0 && c <= 1000000)) {
            grammer();
            gameinfo();
        }
        cs = c;

        System.out.println("");
        System.out.println("\033[0;1mCharacter information:\033[22m");
        Character player = new Character(as, bs, cs);
        player.Stats();

        System.out.println("");
        System.out.println("\033[0;1mChange Charactor information?");
        System.out.println("1 -> Yes");
        System.out.println("2 -> No, proceed to story\033[22m");
        System.out.println("");
        int d = gamesc.nextInt();
        if (d == 1) {
            gameinfo();
        } else if (d == 2) {
            gamestart();
        } else {
            grammer();
        }
    }

    /**
     * Runs the 3-round ball-following game. The player must guess the correct slot
     * after following a sequence of left/right movements.
     * Failing any round ends the game.
     */
    public static void gamestart() {
        ArrayList<String> ball = new ArrayList<>();
        Scanner gss = new Scanner(System.in);

        System.out.println("");
        System.out.println("\033[0;1mHello " + as + "!, You will go through 3 rounds of a game");
        System.out.println("Pass all 3 you win, fail and you lose!\033[22m");

        startstart();

        // Round 1
        System.out.println("\033[0;1mFollow the ball");
        System.out.println("(1) (Ball) (3))");
        System.out.println("Ball is in slot 2 right now!\033[22m");
        System.out.println("");
        ball.add("left");
        ball.add("right");
        ball.add("left");
        ball.add("right");
        ball.add("right");
        ball.add("left");

        for (int i = 0; i < ball.size(); i++) {
            String b = ball.get(i);
        }

        System.out.println("\033[0;1m" + ball);
        System.out.println("wheres the ball?");
        System.out.println("(1) (2) (3)");
        System.out.println("1/3\033[22m");
        System.out.println("");
        int a = gss.nextInt();
        if (a == 2) {
            System.out.println("");
            System.out.println("\033[0;1m1/3 complete!\033[22m");
        } else if (a == 1 || a == 3) {
            System.out.println("");
            System.out.println("\033[0;1mFail (0/3)\033[22m");
            System.exit(0);
        } else {
            grammer();
            gamestart();
        }

        // Round 2
        ball.add("right");
        ball.add("left");
        ball.add("left");
        ball.add("right");
        ball.add("right");
        ball.add("left");
        ball.add("left");
        ball.add("right");
        ball.add("left");

        System.out.println("\033[0;1m" + ball);
        System.out.println("wheres the ball?");
        System.out.println("(1) (2) (3)");
        System.out.println("2/3\033[22m");
        System.out.println("");
        int b = gss.nextInt();
        if (b == 1) {
            System.out.println("");
            System.out.println("\033[0;1m2/3 complete!\033[22m");
        } else if (b == 2 || b == 3) {
            System.out.println("");
            System.out.println("\033[0;1mFail (0/3)\033[22m");
            System.exit(0);
        } else {
            grammer();
            gamestart();
        }

        // Round 3
        ball.add("right");
        ball.add("left");
        ball.add("right");
        ball.add("right");

        System.out.println("\033[0;1m" + ball);
        System.out.println("wheres the ball?");
        System.out.println("(1) (2) (3)");
        System.out.println("3/3\033[22m");
        System.out.println("");
        int c = gss.nextInt();
        if (c == 3) {
            System.out.println("");
            System.out.println("\033[0;1m3/3 complete!");
            System.out.println("");
            System.out.println("YOU WIN!!");
            System.exit(0);
        } else if (c == 2 || c == 1) {
            System.out.println("");
            System.out.println("\033[0;1mFail (0/3)\033[22m");
            System.exit(0);
        } else {
            grammer();
            gamestart();
        }
    }

    /**
     * Displays a message for invalid grammar or incorrect input.
     */
    public static void grammer() {
        System.out.println("");
        System.out.println("\033[0;1mYou made a spelling or grammer mistake\033[22m");
    }

    /**
     * Asks if the player is ready to start the game. Validates the input and loops
     * until the player confirms readiness.
     */
    public static void startstart() {
        Scanner ss = new Scanner(System.in);
        System.out.println("");
        System.out.println("\033[0;1mReady to start?");
        System.out.println("1 - Yes");
        System.out.println("2 - No\033[22m");
        System.out.println("");
        int a = ss.nextInt();
        if (a == 2) {
            startstart();
        } else if (a == 1) {
            System.out.println("");
        } else {
            grammer();
            startstart();
        }
    }
}
