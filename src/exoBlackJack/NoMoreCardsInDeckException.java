package exoBlackJack;

public class NoMoreCardsInDeckException extends Exception {
	private static final String STANDARD_MESSAGE = "There are no more cards in the deck.";
	/**
	 *
	 */
	private static final long serialVersionUID = -532544714152818244L;

	public NoMoreCardsInDeckException(Exception cause) {
		super(STANDARD_MESSAGE, cause);
	}

}
