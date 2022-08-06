public class Card1
{
   private String suit;
   private String rank;
   
   public Card(String suit, String rank){
      this.suit = suit;
      this.rank = rank;
   }
   public String toString(){
      return this.rank + " of " + this.suit;
   }
   public boolean equals(Card c)
   {
      if(this.suit.equals(c.suit) && this.rank.equals(c.rank))
      {
         return true;
      } else {
         return false;
      }
   }
   public int calculateRank()
   {
      if(rank.length() < 3){
         return Integer.parseInt(rank);
      } else if(rank.equals("Ace")){
         return 1;
      } else if(rank.equals("Jack")){
         return 11;
      } else if(rank.equals("Queen")){
         return 12;
      } else {
         return 13;
      }
   }
   public Card compareCard(Card c)
   {
      int rank1 = this.calculateRank();
      int rank2 = c.calculateRank();
      if(rank1 != rank2){
         if(rank1 > rank2){
            return this;
         } else {
            return c;
         }
      } else {
         return null;
      }
   }
}