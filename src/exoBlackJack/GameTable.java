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

//	public Player getPlayer(Player player) {
//		return playerList.stream(). forEach(element->element.getName() == player.getName());
//	}

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

	public void setCardDeck(Deck cardDeck) {
		this.cardDeck = cardDeck;
	}

	public Player getBank() {
		return bank;
	}

	public void setBank(Player bank) {
		this.bank = bank;
	}
}
