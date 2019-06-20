// card class represents a playing card.
public class Card
{
   private String face;  // face of card
   private String suit;  // suit of card
   
   // 2 argument constructor intialises car's face and suit
   public Card(String cardFace, String cardSuit)
   {
      face = cardFace; // initialises face of card
      suit = cardSuit;  // initialises suit of card
   }  // end 2 argument card constructor
   
   // return string representation of card
   public String toString()
   {
      return face + " of " + suit;
   }  // end method toString
} // end class Card
   