package dz.cirta.designspattern.abstractfactory.creditcard.validator;

import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.Validator;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
