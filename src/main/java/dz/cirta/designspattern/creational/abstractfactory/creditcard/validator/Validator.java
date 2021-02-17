package dz.cirta.designspattern.creational.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.creational.abstractfactory.creditcard.CreditCard;

public interface Validator {
	public boolean isValid(CreditCard creditCard);
}
