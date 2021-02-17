package dz.cirta.designspattern.creational.abstractfactory.creditcardfactory;

import dz.cirta.designspattern.creational.abstractfactory.creditcardfactory.type.CardType;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.Validator;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.CreditCard;

//AbstractFactory
public abstract class CreditCardAbstractFactory {

	public static CreditCardAbstractFactory getCreditCardFactory(int creditScore) {
	
		if(creditScore > 650) {
			return new AmexAbstractFactory();
		}
		else {
			return new VisaAbstractFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
		
	public abstract Validator getValidator(CardType cardType);
}
