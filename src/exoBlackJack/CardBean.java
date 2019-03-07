package exoBlackJack;

public class CardBean {
	private String name;
	private int value;
	private String color;

	public CardBean(String name, int value, String color) {
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

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

}
