package exoBlackJack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DeckBean {
	private List<CardBean> cardDeck;

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
			for (CardColors cardColors : CardColors.values()) {
				cardDeck.add(new CardBean(cardValues.toString(), cardValues.getValue(), cardColors.toString()));
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
