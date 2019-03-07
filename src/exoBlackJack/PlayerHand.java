package exoBlackJack;

import java.util.List;

public class PlayerHand {
	private List<CardBean> drawnCards;

	// Methods
	public void addCardToDrawnCardsList(CardBean card) {
		drawnCards.add(card);
	}

	public int getNumberOfCardsDrawn() {
		return drawnCards.size();
	}

	// Get + Set
	public List<CardBean> getDrawnCards() {
		return drawnCards;
	}

}
