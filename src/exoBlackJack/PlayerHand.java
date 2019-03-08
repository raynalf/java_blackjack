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

	public int getScore() {
		int score = 0;

		for (Card card : drawnCards) {
			score += card.getValue();
		}
		return score;
	}

	// Get + Set
	public List<Card> getDrawnCards() {
		return drawnCards;
	}

	@Override
	public String toString() {
		StringBuilder cardsInHand = new StringBuilder();

		drawnCards.forEach(card -> cardsInHand.append(card + "\n"));
		return cardsInHand.toString();
	}

}
