package poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HandTest {

	@Test
	public void testEvalHand() {
		
		//Royal flush test
		Junit RoyalFlushTest = new Junit();
		
		Card card1 = new Card(SPADES, ACE);
		Card card2 = new Card(SPADES, KING);
		Card card3 = new Card(SPADES, QUEEN);
		Card card4 = new Card(SPADES, JACK);
		Card card5 = new Card(SPADES, TEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand royalflush = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.RoyalFlush,royalflush);
		
		//Straight flush test
		Junit StraightFlushTest = new Junit();
		
		Card card1 = new Card(SPADES, SIX);
		Card card2 = new Card(SPADES, FIVE);
		Card card3 = new Card(SPADES, FOUR);
		Card card4 = new Card(SPADES, THREE);
		Card card5 = new Card(SPADES, TWO);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand straightflush = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.StraightFlush,straightflush);
		
		//Four of a kind test
		Junit FourOfAKindTest = new Junit();
		
		Card card1 = new Card(SPADES, FOUR);
		Card card2 = new Card(CLUBS, FOUR);
		Card card3 = new Card(HEARTS, FOUR);
		Card card4 = new Card(DIAMONDS, FOUR);
		Card card5 = new Card(SPADES, TEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand fourofakind = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.FourOfAKind,fourofakind);
		
		//Full house test
		Junit FullHouseTest = new Junit();
		
		Card card1 = new Card(SPADES, TEN);
		Card card2 = new Card(DIAMONDS, QUEEN);
		Card card3 = new Card(CLUBS, TEN);
		Card card4 = new Card(SPADES, QUEEN);
		Card card5 = new Card(DIAMONDS, TEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand fullhouse = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.FullHouse,fullhouse);
		
		//Flush test
		Junit FlushTest = new Junit();
		
		Card card1 = new Card(SPADES, ACE);
		Card card2 = new Card(SPADES, TWO);
		Card card3 = new Card(SPADES, QUEEN);
		Card card4 = new Card(SPADES, THREE);
		Card card5 = new Card(SPADES, TEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand flush = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.Flush,flush);
		
		//Straight test
		Junit StraightTest = new Junit();
		
		Card card1 = new Card(SPADES, TWO);
		Card card2 = new Card(HEARTS, THREE);
		Card card3 = new Card(DIAMONDS, FOUR);
		Card card4 = new Card(CLUBS, FIVE);
		Card card5 = new Card(SPADES, SIX);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand straight = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.Straight,straight);
		
		//Three of a kind test
		Junit ThreeOfAKindTest = new Junit();
		
		Card card1 = new Card(HEARTS, SIX);
		Card card2 = new Card(SPADES, SEVEN);
		Card card3 = new Card(DIAMONDS, SEVEN);
		Card card4 = new Card(SPADES, FOUR);
		Card card5 = new Card(HEARTS, SEVEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand threeofakind = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.ThreeOfAKind,threeofakind);
		
		//Two pair test
		Junit TwoPairTest = new Junit();
		
		Card card1 = new Card(HEARTS, JACK);
		Card card2 = new Card(DIAMONDS, KING);
		Card card3 = new Card(SPADES, FOUR);
		Card card4 = new Card(CLUBS, JACK);
		Card card5 = new Card(DIAMONDS, FOUR);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand twopair = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.TwoPair,twopair);
		
		//Pair test
		Junit PairTest = new Junit();
		
		Card card1 = new Card(DIAMONDS, EIGHT);
		Card card2 = new Card(CLUBS, FIVE);
		Card card3 = new Card(HEARTS, KING);
		Card card4 = new Card(SPADES, EIGHT);
		Card card5 = new Card(HEARTS, TEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand pair = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.Pair,pair);
		
		//High card test
		Junit HighCardTest = new Junit();
		
		Card card1 = new Card(SPADES, ACE);
		Card card2 = new Card(HEARTS, FOUR);
		Card card3 = new Card(DIAMONDS, QUEEN);
		Card card4 = new Card(SPADES, SIX);
		Card card5 = new Card(CLUBS, SEVEN);
		
		ArrayList<Card> Import = new ArrayList<Card>();
		Import.add(card1);
		Import.add(card2);
		Import.add(card3);
		Import.add(card4);
		Import.add(card5);
		Hand CardsInHand = Import;
		
		Hand highcard = test.EvalHand(CardsInHand);
		assertEquals(eHandStrength.HighCard,highcard);
		
	}

}
