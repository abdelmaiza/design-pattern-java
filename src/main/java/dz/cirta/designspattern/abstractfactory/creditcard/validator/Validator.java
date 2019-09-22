package dz.cirta.designspattern.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
