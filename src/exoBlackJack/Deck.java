package exoBlackJack;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deck implements Iterable<Card> {
	private List<Card> cardList;

	// Constructor
	public Deck() {
		cardList = new LinkedList<>();
		populateDeck(cardList);
		shuffleDeck();
	}

	// Methods

	public Card drawCard() {
		return cardList.remove(1);
	}

	private void populateDeck(List<Card> cardDeck) {
		for (CardValues cardValues : CardValues.values()) {
			for (CardSuits cardSuits : CardSuits.values()) {
				final Card newCard = new Card(cardValues, cardValues.getValue(), cardSuits);
				cardDeck.add(newCard);
			}
		}
	}

	private void shuffleDeck() {
		Collections.shuffle(cardList);
	}

	@Override
	public Iterator<Card> iterator() {
		return cardList.iterator();
	}

	// Get + Set

	public List<Card> getCardDeck() {
		return cardList;
	}

}
