import java.util.Random;


/*
Type of Credit Card number:
4000 00DD DDDD DDDD
 */
public final class CardNumber {
    private final Random random = new Random();
    private String cardNumber = "";
    private LuhnAlg luhnAlgorithm = new LuhnAlg();


    CardNumber() {
        setNumbersOfCard();
    }

    private void setNumbersOfCard() {
        this.cardNumber = luhnAlgorithm.generateCardNumberLuhn();
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String checkNameOfBank() {
        if (cardNumber.charAt(0) == 4) {
            return "Visa";
        } else if (cardNumber.charAt(0) == 3 && (cardNumber.charAt(1) >= 3 && cardNumber.charAt(1) <= 7)) {
            return "American Express";
        } else if (cardNumber.charAt(0) == 5 && (cardNumber.charAt(1) >= 1 && cardNumber.charAt(1) <= 5)) {
            return "Mastercard";
        }
        return null;
    }

}
