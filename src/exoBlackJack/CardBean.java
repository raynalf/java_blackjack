package exoBlackJack;

public class CardBean {
	private CardValues name;
	private int value;
	private CardSuits color;

	public CardBean(CardValues name, int value, CardSuits color) {
		this.name = name;
		this.value = value;
		this.color = color;
	}

	@Override
	public String toString() {
		return "CardBean [name=" + name + ", value=" + value + ", color=" + color + "]";
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
