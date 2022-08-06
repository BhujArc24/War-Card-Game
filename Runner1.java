import java.util.Scanner;

public class Runner1
{
   public static void main(String[] args)
   {
      boolean isDone = false;
      Scanner sc = new Scanner(System.in);
      String input;
      Deck myDeck;
      Hand hand1;
      Hand hand2;
      while (!isDone){
         myDeck = new Deck();
         myDeck.shuffle();         
         System.out.println("Please input Player 1's name:");
         input = sc.nextLine();
         hand1 = new Hand(input);
         System.out.println("Please input Player 2's name:");
         input = sc.nextLine();
         hand2 = new Hand(input);
         
         System.out.println("Welcome to the game " + hand1.getName() + " and " + hand2.getName());
         System.out.println("Dealing out cards...");
         hand1.deal(myDeck);
         hand2.deal(myDeck);
         System.out.println("Hands dealt.");
         for(int round = 1; round <= 26; round++){
            hand1.playRound(hand2);
            System.out.println("\nPress enter to continue\n");
            input = sc.nextLine();
         }
         System.out.println("Please input y to play again or n to stop playing.");
         input = sc.nextLine();
         if(input.equals("y")){
            isDone = false;
         } else {
            isDone = true;
         }
      }
   }
}