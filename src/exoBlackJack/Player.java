package exoBlackJack;

public class Player {
	private String name;
	private PlayerHand playerHand;
	private int score;
	private boolean isDrawingCards;

	// Constructor
	public Player(String name) {
		this.name = name;
		playerHand = new PlayerHand();
		score = 0;
		isDrawingCards = false;
	}

	// Methods
	@Override
	public String toString() {
		return "Player [name=" + name + ", playerHand=" + playerHand + ", score=" + score + ", isDrawingCards="
				+ isDrawingCards + "]";
	}

	public void drawCard(Card card) {
		playerHand.addCardToDrawnCardsList(card);
	}

	// Get + Set
	public PlayerHand getPlayerHand() {
		return playerHand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
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
