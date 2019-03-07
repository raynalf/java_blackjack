package exoBlackJack;

import java.util.List;

public class GameTable {
	private List<Player> playerList;
	private DeckBean cardDeck;
	private Player bank;

	// Constructor
	public GameTable() {
		cardDeck = new DeckBean();
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

	public DeckBean getCardDeck() {
		return cardDeck;
	}

	public void setCardDeck(DeckBean cardDeck) {
		this.cardDeck = cardDeck;
	}

	public Player getBank() {
		return bank;
	}

	public void setBank(Player bank) {
		this.bank = bank;
	}
}
