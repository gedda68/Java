// Card shuffling and dealing
public class DeckOfCardsTest
{
   // execute application
   public static void main (String[] args)
   {  
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle(); // place cards in random order
      
      // print all cards in the order in which they were dealt
      for (int i = 1; i <= 52; i++)
      {
         // deal and display a Card
         System.out.printf("%-19s", myDeckOfCards.dealCard());
         
         if(i % 4 == 0) // output a newline after every 4th card
            System.out.println();
      } // end for loop
   }// end main
}// end class DeckOfCardsTest