package dz.cirta.designspattern.creational.abstractfactory.creditcardfactory;

import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.AmexGoldValidator;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.AmexPlatinumValidator;
import dz.cirta.designspattern.creational.abstractfactory.creditcardfactory.type.CardType;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.validator.Validator;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.AmexGoldCreditCard;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.AmexPlatinumCreditCard;
import dz.cirta.designspattern.creational.abstractfactory.creditcard.CreditCard;

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
