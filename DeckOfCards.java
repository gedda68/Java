// DeckOfCards class represents a playing deck of cards
import java.util.Random;

public class DeckOfCards
{
   private Card[] deck; // array of card ojbect
   private int currentCard; // index of next card to be dealt(0-51)
   private static final int NUMBER_OF_CARDS = 52; // constant number of cards
   
   // random number generator
   private static final Random rand = new Random();
   
   // constuctor fills deck of cards
   public DeckOfCards()
   {
      String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
                        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
      
      deck = new Card[NUMBER_OF_CARDS]; // create array of cards
      currentCard = 0; // set currentCard so first card dealt is deck[0]
      
      // populate deck with card objects
      for(int count = 0; count < deck.length; count++)
         deck[count] = new Card(faces[count % 13], suits[count / 13]);
         
   } // end DeckOfCards constructor
   
   // shuffle deck of cards with one-pass algorithm
   public void shuffle()
   {
      // after shuffling, dealing should start at deck[0] again
      currentCard = 0;  // reinitialise currentCard
      
      // for each card, pick another random card (0-51) and swap them
      for(int first = 0; first < deck.length; first++)
      { 
         // select a random number between 0 and 51
         int second = rand.nextInt(NUMBER_OF_CARDS);
         
         // swap current Card with randomly selected card
         Card temp = deck[first];
         deck[first] = deck[second];
         deck[second] = temp;
      } // end for
   } // end method shuffle
   
   // deal one Card
   public Card dealCard()
   {
      // determine whether Cards remain to be dealt
      if(currentCard < deck.length)
         return deck[currentCard++]; // return current card in an array
      else 
         return null;  // indicates all cards were dealt
    } // end method dealCard
} // end Class DeckOfCards
         
     