public class Deck1
{
   public Card[] deck = new Card[52];
   public Deck()
   {
      String[] suit = {"Clubs","Spades","Hearts","Diamonds"};
      String[] rank = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
      int suitCounter = 0;
      int rankCounter = 0;
      for(int i = 0; i < 52; i++)
      {
         if(rankCounter == 13)
         {
            rankCounter = 0;
            suitCounter++;
            if(suitCounter == 4)
            {
               suitCounter = 0;
            }
         }
         
         deck[i] = new Card(suit[suitCounter], rank[rankCounter]);
         
         rankCounter++;
      }
   }
   public void shuffle(){
      int randomIndex;
      int randomIndex2;
      Card[] randomDeck = new Card[52];
      Card temp;
      for(int i = 0; i < 52; i++)
      {
         randomIndex = (int)(Math.random() * 52);
         randomIndex2 = (int)(Math.random() * 52);
         
         temp = deck[randomIndex];
         deck[randomIndex] = deck[randomIndex2];
         deck[randomIndex2] = temp;
      }
   }
   public String toString()
   {
      String myDeck = "";
      for(int i = 0; i < 52; i++)
      {
         myDeck += deck[i] + "\n";
      }
      return myDeck;
   }
}