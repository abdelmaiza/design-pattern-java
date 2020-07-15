package dz.cirta.designspattern.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
