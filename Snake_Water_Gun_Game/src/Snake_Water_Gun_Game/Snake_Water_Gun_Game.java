package Snake_Water_Gun_Game;

import java.util.Random;
import java.util.Scanner;

public class Snake_Water_Gun_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		// Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create a random number generator
        Random random = new Random();
        
        // Options for the game
        String[] options = {"s", "w", "g"};
        
        // Generate a random index for the computer's choice
        int compIndex = random.nextInt(3);
        String compChoice = options[compIndex];
        
        // Ask the user for their choice
        System.out.print("Your Turn: Snake(s), Water(w), or Gun(g)? : ");
        String userChoice = scanner.next();
        
        // Print the computer's choice
        System.out.println("Computer chose " + compChoice);
        
        // Determine the winner
        String result = gameWin(compChoice, userChoice);
        
        // Display the result
        if (result.equals("tie")) {
            System.out.println("The game is a tie!");
        } else if (result.equals("win")) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    public static String gameWin(String comp, String you) {
        // If two values are equal, declare a tie
        if (comp.equals(you)) {
            return "tie";
        }
        
        // Check for all possibilities when computer chose s
        if (comp.equals("s")) {
            return you.equals("w") ? "win" : "lose";
        }
        
        // Check for all possibilities when computer chose w
        if (comp.equals("w")) {
            return you.equals("g") ? "win" : "lose";
        }
        
        // Check for all possibilities when computer chose g
        if (comp.equals("g")) {
            return you.equals("s") ? "win" : "lose";
        }
        
        return "unknown";
    }
}
