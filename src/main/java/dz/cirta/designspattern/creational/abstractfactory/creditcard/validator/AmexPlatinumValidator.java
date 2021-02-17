package dz.cirta.designspattern.creational.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.creational.abstractfactory.creditcard.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
