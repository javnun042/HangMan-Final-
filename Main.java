class Main {
  public static void main(String[] args) {
    import java.util.Scanner;

public class Main {
	// use the following global variables for the program
    static String blankWord="";
    static String word;
    static String guessedLetters="";

    static int wordLength = 0;
    static Scanner user_input;


    public static void main(String[] args) {

        System.out.println("Welcome to Hangman");
        System.out.println();
        System.out.println("The rules are simple.. guess the word before time runs out.");
        System.out.println();
        System.out.println("Choosing word....");

        setup();

        run();

    }



    public static void setup() {
    // the following method should call the setupRandomWord method and set up any variables.

    }

    public static void run() {
    // the main program should include the following: 1) a while loop that keeps the user guessed letters until all
    // letters of the word are guessed. or the user makes too many incorrect guesses.
    // If a letter is found, all instances of the letter are shown in the word.
    // if an incorrect guess is made, the new hangman is shown.  Give feedback after every guess.
    // A final output when games ends.
     
    }

    private static boolean checkGuessedLetter(char c) {
    // the following method checks to see if the letter has been guessed yet and returns true if yes and false if not.
        
    return false;
    }

    public static void showStatus() {
    	// the following methods displays the following to the user: 
    	// 1) how many letters in the word 2) what letters the user has already guessed, and
    	// 3) the current status of the word ( _ _ _ a _ t _ s )

    }

    public static void setupRandomWord() {
    	// the following method randomizes the choice of a word for the game.. use 10 possible words
      
    }

    private static int findInstancesOfLetter(char c) {
    	// the following method returns an integer of how many a particular letter appears in string
       
    return 0;
    }

    private static void replaceCharAt(int i, char c) {
    	// the following method replaces a character in a string (i.e. change position 3 of string to 'a')
        
    }

    private static char getLetter() {
    	// the following method asks the user for a letter and returns the character entered.
      
    return 'c';
    }

    private static void showHangman(int wrong) {
    	// displays the current hangman. Five wrong guesses and man is hanged and game ends.

        switch (wrong) {
            case 0:
                break;

            case 1:
                System.out.println("We've got the scaffold ready...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 2:
                System.out.println("Second wrong.. he's hanging...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 3:
                System.out.println("He's raising his hands for help.. Help him!...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 4:
                System.out.println("No time left.. one false step...");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("   _|___");
                break;

            case 5:
                System.out.println("Times up!");
                System.out.println("   _______");
                System.out.println("    |/      |");
                System.out.println("    |      (_)");
                System.out.println("    |      \\|/");
                System.out.println("    |       |");
                System.out.println("    |      / \\");
                System.out.println("    |");
                System.out.println("   _|___");

                break;

        }
    }

}
  }
}