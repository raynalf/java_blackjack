package exoBlackJack;

import java.util.ArrayList;
import java.util.List;

public class GameTable {
	private List<Player> playerList;
	private Deck cardDeck;
	private Player bank;

	// Constructor
	public GameTable() {
		playerList = new ArrayList<>();
		cardDeck = new Deck();
		bank = new Player("Banque");
	}

	// Methods

	public void addPlayerToPlayerList(Player player) {
		playerList.add(player);
	}

	// Get + Set
	public List<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}

	public Deck getCardDeck() {
		return cardDeck;
	}

	public Player getBank() {
		return bank;
	}

}
