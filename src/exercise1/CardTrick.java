package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Numeth Handunpurage Jan 24, 2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
          
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        // Ask the user for Card value and suit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int userValue = scanner.nextInt();

        System.out.print("Enter your card suit (1-4): ");
        int userSuit = scanner.nextInt();

        // Create user's card
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]);

        // Search for a match in the hand
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found. Try again!");
        }

        // Close the scanner
        scanner.close();
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author NNumeth Handunpurage Jan 24, 2024
     */
    private static void printInfo() {
        //I'm Done
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Numeth Handunpurage, Nice to Meet you");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a cybersecurity enineer one day. I am still trying for that");
        System.out.println("-- complete my program with full marks!. I did 2 semesters well.");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Watching tv series");
        System.out.println("-- Play Cricket");
        System.out.println("-- Reading");

        System.out.println();
    }
}
