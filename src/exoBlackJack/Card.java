package exoBlackJack;

public class Card {
	private CardValues name;
	private int value;
	private CardSuits color;

	public Card(CardValues name, int value, CardSuits color) {
		this.name = name;
		this.value = value;
		this.color = color;
	}

	@Override
	public String toString() {
		return name + "(" + value + ")" + " of " + color;
	}

	public int getValue() {
		return value;
	}

	public CardSuits getColor() {
		return color;
	}

	public CardValues getName() {
		return name;
	}

}
