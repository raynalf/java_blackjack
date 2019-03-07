package exoBlackJack;

import java.util.ArrayList;
import java.util.List;

public class PlayerHand {
	private List<Card> drawnCards;

	// Constructor
	public PlayerHand() {
		drawnCards = new ArrayList<>();
	}

	// Methods
	public void addCardToDrawnCardsList(Card card) {
		drawnCards.add(card);
	}

	public int getNumberOfCardsDrawn() {
		return drawnCards.size();
	}

	// Get + Set
	public List<Card> getDrawnCards() {
		return drawnCards;
	}

}
