public class Hand1
{
   private String name;
   private int points;
   private Card[] hand = new Card[52];
   private static int currentCard = 0;
   public Hand(String name)
   {
      points = 0;
      this.name = name;
   }
   public String getName()
   {
      return this.name;
   }
   public int getPoints()
   {
      return this.points;
   }
   public void deal(Deck d)
   {
      int randomIndex = (int)(Math.random() * 52);
      for(int i = 0; i < 26; i++)
      {
         while(d.deck[randomIndex] == null){
            randomIndex = (int)(Math.random() * 52);
         }
         hand[i] = d.deck[randomIndex];
         d.deck[randomIndex] = null;
      }
   }
   public void addPoints(int points)
   {
      this.points += points;
   }
   public void playRound(Hand h)
   {
      Card c1 = hand[currentCard];
      Card c2 = h.hand[currentCard];
      Card winner = c1.compareCard(c2);
      System.out.println("Playing round " + (currentCard + 1));
      System.out.println("Comparing Cards...");
      System.out.println(name + "'s card: " + c1);
      System.out.println(h.getName() + "'s card: " + c2);
      
      if(winner == null){
         System.out.println("Tie! No points awarded this round.");
      } else if(winner.equals(c1)){
         System.out.println(name + " had the better card! 1 point awarded to " + name);
         addPoints(1);
      } else {
         System.out.println(h.getName() + " had the better card! 1 point awarded to " + h.getName());
         h.addPoints(1);
      }
      currentCard++;
      System.out.println("Current scores:\n" + name + "'s points: " + points);
      System.out.println(h.getName() + "'s points: " + h.getPoints());
   }
}