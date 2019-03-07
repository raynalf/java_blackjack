package exoBlackJack;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckBean deckBean = new DeckBean();
		Iterator<CardBean> iterable = deckBean.getCardDeck().iterator();
		System.out.println(deckBean.getCardDeck().size());

		while (iterable.hasNext()) {
			System.out.println(iterable.next());

		}

//		for (int i = 0; i < deckBean.getCardDeck().size(); i++) {
//			System.out.println(deckBean.drawCard());
//		}
	}

}
