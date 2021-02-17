package dz.cirta.designspattern.creational.abstractfactory.creditcardfactory;

import dz.cirta.designspattern.creational.abstractfactory.creditcardfactory.type.CardType;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.Validator;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.VisaValidator;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.CreditCard;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.VisaBlackCreditCard;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.VisaGoldCreditCard;

public class VisaAbstractFactory extends CreditCardAbstractFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
	
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		return new VisaValidator();
	}

}
