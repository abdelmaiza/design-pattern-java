package dz.cirta.designspattern.abstractfactory.creditcardfactory;

import dz.cirta.designspattern.abstractfactory.creditcard.validator.AmexGoldValidator;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.AmexPlatinumValidator;
import dz.cirta.designspattern.abstractfactory.creditcardfactory.type.CardType;
import dz.cirta.designspattern.abstractfactory.creditcard.validator.Validator;
import dz.cirta.designspattern.abstractfactory.creditcard.AmexGoldCreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.AmexPlatinumCreditCard;
import dz.cirta.designspattern.abstractfactory.creditcard.CreditCard;

public class AmexAbstractFactory extends CreditCardAbstractFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
            default:
                break;
        }
        return null;
    }

    @Override
    public Validator getValidator(CardType cardType) {

        switch (cardType) {
            case GOLD:
                return new AmexGoldValidator();

            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }
}
