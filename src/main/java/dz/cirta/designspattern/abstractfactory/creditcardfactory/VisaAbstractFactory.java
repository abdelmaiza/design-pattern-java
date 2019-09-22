package dz.cirta.designspattern.abstractfactory.creditcardfactory;

import dz.cirta.designspattern.abstractfactory.creditcardfactory.type.CardType;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.Validator;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.VisaValidator;
import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.VisaBlackCreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.VisaGoldCreditCard;

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
