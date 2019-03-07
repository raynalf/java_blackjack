package exoBlackJack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DeckBean {
	private List<CardBean> cardDeck;

	// Constructor
	public DeckBean() {
		cardDeck = new LinkedList<>();
		populateDeck(cardDeck);
		shuffleDeck();
	}

	// Methods

	public CardBean drawCard() {
		return cardDeck.remove(1);
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
		Collections.shuffle(cardDeck);
	}

	// Get + Set

	public List<CardBean> getCardDeck() {
		return cardDeck;
	}

	public void setCardDeck(List<CardBean> cardDeck) {
		this.cardDeck = cardDeck;
	}
}
