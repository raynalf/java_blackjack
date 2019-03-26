package exoBlackJack;

public class Player {
	private String name;
	private PlayerHand playerHand;

	// Constructor
	public Player(String name) {
		this.name = name;
		playerHand = new PlayerHand();
	}

	// Methods
	public void drawCard(Card card) {
		playerHand.addCardToDrawnCardsList(card);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", playerHand=" + playerHand + "]";
	}

	// Get + Set
	public PlayerHand getPlayerHand() {
		return playerHand;
	}

	public String getName() {
		return name;
	}

}
