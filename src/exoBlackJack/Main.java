package exoBlackJack;

public class Main {
	public static void main(String[] args) {

		Controller controller = new Controller();

		controller.addPlayer(new Player("Tom"));
		controller.addPlayer(new Player("Bob"));
		controller.addPlayer(new Player("Lynn"));

		controller.gameInit();

		controller.displayState();
	}

}
