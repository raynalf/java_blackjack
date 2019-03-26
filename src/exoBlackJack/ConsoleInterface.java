package exoBlackJack;

public class ConsoleInterface {

	// Display
	public void displayState(GameTable gameTable) {
		displayHandAndScore(gameTable.getBank());
		displayHandAndScore(gameTable.getCurrentPlayer());

		System.out.println(gameTable.getCardDeck().getCardList().size());
//			TODO
//			user input : Scanner
//			deal with ace value
//

	}

//		public void displayEachPlayerHandAndScore() {
//			for (Player player : gameTable.getPlayerList()) {
//				displayScoreAndNumberOfCards(player);
//				displayCardsInHand(player);
//			}
//		}

	public void displayHandAndScore(Player player) {
		displayScoreAndNumberOfCards(player);
		displayCardsInHand(player);
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

}
