package dz.cirta.designspattern.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.Validator;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
