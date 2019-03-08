package exoBlackJack;

import java.util.Iterator;

public class Controller {
	private GameTable gameTable;
	private Iterator<Player> playerList;

	// Constructor
	public Controller() {
		gameTable = new GameTable();
	}

	// Methods
	public void gameInit() {
		playerList = gameTable.getPlayerList().iterator();

		for (int i = 0; i < 2; i++) {
			for (Player player : gameTable.getPlayerList()) {
				player.drawCard(getCard());
			}
			gameTable.getBank().drawCard(getCard());
		}
	}

	public Card getCard() {
		try {
			return gameTable.getCardDeck().drawCard();
		} catch (NoMoreCardsInDeckException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Display
	public void displayState() {
		displayBankHandAndScore();
		displayEachPlayerHandAndScore();
		System.out.println(gameTable.getCardDeck().getCardList().size());
	}

	public void displayEachPlayerHandAndScore() {
		for (Player player : gameTable.getPlayerList()) {
			displayScoreAndNumberOfCards(player);
			displayCardsInHand(player);
		}
	}

	public void displayBankHandAndScore() {
		displayScoreAndNumberOfCards(gameTable.getBank());
		displayCardsInHand(gameTable.getBank());
	}

	public void displayCardsInHand(Player player) {
		player.getPlayerHand().getDrawnCards().forEach(card -> System.out.println(card));
		System.out.println();
	}

	public void displayScoreAndNumberOfCards(Player player) {
		String name = player.getName();
		int score = player.getPlayerHand().getScore();
		int numberOfCardsInHand = player.getPlayerHand().getNumberOfCardsDrawn();
		System.out.println(name + " -> score : " + score + "\n-> cards in hand : " + numberOfCardsInHand);
	}

	public void addPlayer(Player player) {
		gameTable.addPlayerToPlayerList(player);
	}

	public Player getNextPlayer() {
		return playerList.next();
	}

	// Get + Set
	public Iterator<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(Iterator<Player> playerList) {
		this.playerList = playerList;
	}
}
