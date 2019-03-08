package exoBlackJack;

public class Player {
	private String name;
	private PlayerHand playerHand;
	private boolean isDrawingCards;

	// Constructor
	public Player(String name) {
		this.name = name;
		playerHand = new PlayerHand();
		isDrawingCards = false;
	}

	// Methods
	@Override
	public String toString() {
		return "Player [name=" + name + ", playerHand=" + playerHand + ", isDrawingCards=" + isDrawingCards + "]";
	}

	public void drawCard(Card card) {
		playerHand.addCardToDrawnCardsList(card);
	}

	// Get + Set
	public PlayerHand getPlayerHand() {
		return playerHand;
	}

	public boolean isDrawingCards() {
		return isDrawingCards;
	}

	public void setDrawingCards(boolean isDrawingCards) {
		this.isDrawingCards = isDrawingCards;
	}

	public String getName() {
		return name;
	}

}
