import java.util.Scanner;

/**
 * The {@code Main} class serves as the entry point of the "Live or Die" game.
 * It simply redirects to the main menu logic handled in the {@link Script} class.
 *
 * <p>Structure Overview:</p>
 * <ul>
 *   <li>Line 3: One of the 2/4 core classes</li>
 *   <li>Line 10: Starts the program by calling {@code Script.intro()}</li>
 * </ul>
 */
public class Main { // 2/4 classes

    /**
     * The main method launches the game by calling {@link Script#intro()}.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Script.intro();
    }
}
