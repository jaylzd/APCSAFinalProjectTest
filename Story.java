/**
 * Story class basically goes over the overall main point of the game 
    it outputs the game with also a charector creator
 * Line 8 4/4 Classes which is also the core code for the game
 * Line 13 + gets the information asking name, age and gender
 * Line 17+ is asking the name
 * Line 22+ ensures the input is correct and doesnt error
 * Line 33+ is asking for gender
 * Line 40+ ensures the input is correct and doesnt error
 * Line 49+ is asking for age
 * Line 54+ ensures the input is correct and doesnt error
 * Line 62 is the object also printing the charector data
 * Line 67+ is just the proceeding code
 * Line 81+ is the game game going straight into the point of the game
 * Line 83 is storing left right variables for game
 * Line 92 is the ball location
 * Line 95+ is adding to the arrar for the game
 * Line 104+ is defining the lefts and rights in the array
 * Line 114+ Pass or fail code round 1
 * Line 126+ adding more left right variables for round 2
 * Line 140+ Pass or fail Code round 2
 * Line 155+ adding more left right variables for last round
 * Line 162+ Pass or fail code round 3
 * Line 166+ is the you win code if you pass all 3 rounds
 * Line 193+ another grammer for incase someone inputs wrong string or int
 * Line 198+ a are you sure code locking in your decision
*/
import java.util.Scanner;
import java.util.ArrayList;
public class Story {
        static String as = "";
        static String bs = "";
        static int cs;
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
        }else{
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
        Character player = new Character(as,bs,cs); 
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
        }else{
            grammer();
        }
    } 
    
    public static void gamestart() { 
        ArrayList<String> ball = new ArrayList<>();
        Scanner gss = new Scanner(System.in); 
        System.out.println("");
        System.out.println("\033[0;1mHello " + as + "!, You will go through 3 rounds of a game"); //explaining/introduction of game
        System.out.println("Pass all 3 you win, fail and you lose!\033[22m");
        startstart();
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
                }else{
                    grammer();
                    gamestart();
                }
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
                }else{
                    grammer();
                    gamestart();
                }
            
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
            } else if (c == 2 || c == 3) {
                System.out.println("");
                    System.out.println("\033[0;1mFail (0/3)\033[22m");
                    System.exit(0);
                }else{
                    grammer();
                    gamestart();
                }
                
                
                
                
            }
        
    
    
    
    
    
    public static void grammer() {
        System.out.println("");
        System.out.println("\033[0;1mYou made a spelling or grammer mistake\033[22m");
    }
    public static void startstart() {
        Scanner ss = new Scanner(System.in); 
        System.out.println("");
        System.out.println("\033[0;1mReady to start?");
        System.out.println("1 - Yes");
        System.out.println("2 - No\033[22m");
        System.out.println("");
        int a = ss.nextInt();
        if (a == 2){
            startstart();
        } else if (a == 1) {
            System.out.println("");
        }else{
            grammer();
            startstart();
        }
        
    }
}