public class Card{
    private CardNumber cardNumber;
    private PinNumber pinNumber;


    public void createNewCard() {
        cardNumber = new CardNumber();
        System.out.println("Your card has been created");
        System.out.println("Your card number:");
        getNumberOfCard();
    }

    public void getNumberOfCard() {
        System.out.println(cardNumber.getCardNumber());
    }

    protected String getStringNumberOfCard(){
        return cardNumber.getCardNumber();
    }

    public void createNewPinNumber() {
        pinNumber = new PinNumber();
        System.out.println("Your card PIN:");
        pinNumber.getPinNumber();
    }

    public String getPinNumber(){
       return pinNumber.getStringPinNumber();
    }

}
