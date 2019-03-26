package exoBlackJack;

public class Main {
	public static void main(String[] args) {

		GameManager gameManager = new GameManager();

		gameManager.addPlayer(new Player("Tom"));
		gameManager.addPlayer(new Player("Bob"));
		gameManager.addPlayer(new Player("Lynn"));

		gameManager.gameInit();

		gameManager.displayState();
	}

}
