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

		System.out.println(gameTable.getPlayerList());
	}

}
