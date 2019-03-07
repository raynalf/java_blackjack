package exoBlackJack;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DeckBean implements Iterable<CardBean> {
	private List<CardBean> cardList;

	// Constructor
	public DeckBean() {
		cardList = new LinkedList<>();
		populateDeck(cardList);
		shuffleDeck();
	}

	// Methods

	public CardBean drawCard() {
		return cardList.remove(1);
	}

	private void populateDeck(List<CardBean> cardDeck) {
		for (CardValues cardValues : CardValues.values()) {
			for (CardSuits cardSuits : CardSuits.values()) {
				final CardBean newCard = new CardBean(cardValues, cardValues.getValue(), cardSuits);
				cardDeck.add(newCard);
			}
		}
	}

	private void shuffleDeck() {
		Collections.shuffle(cardList);
	}

	@Override
	public Iterator<CardBean> iterator() {
		return cardList.iterator();
	}

	// Get + Set

	public List<CardBean> getCardDeck() {
		return cardList;
	}

}
