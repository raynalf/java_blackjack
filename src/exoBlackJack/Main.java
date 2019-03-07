package exoBlackJack;

public class Main {

	public static void main(String[] args) {
//		DeckBean deckBean = new DeckBean();
//
//		for (CardBean currentCard : deckBean) {
//			System.out.println(currentCard);
//		}

		GameTable gameTable = new GameTable();
		gameTable.addPlayerToPlayerList(new Player("Tom"));
		gameTable.getBank().drawCard(gameTable.getCardDeck().drawCard());

		System.out.println(gameTable.getBank().getPlayerHand().getDrawnCards());
//		gameTable.getPlayerList().
//
//		System.out.println(gameTable.getPlayerList().iterator().next().getPlayerHand().getDrawnCards());
	}

}
