package dz.cirta.designspattern.abstractfactory;

import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;
import dz.cirta.designspattern.abstractfactory.creditcardfactory.CreditCardAbstractFactory;
import dz.cirta.designspattern.abstractfactory.creditcardfactory.type.CardType;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardAbstractFactory abstractFactory = CreditCardAbstractFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardAbstractFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
