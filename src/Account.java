import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private Card card1;
    private boolean checkPinNumber = false;
    private boolean checkCardNumber = false;


    public void createNewCard() {
        card1 = new Card();
        card1.createNewCard();
        card1.createNewPinNumber();
    }

    public void logInToYourAccount() {
        scanCardNumber();
        scanPinNumber();
        if (checkPinNumber && checkCardNumber) {
            System.out.println("You have successfully logged in!\n");
            accountInterface();
        } else {
            System.out.println("Wrong card number or PIN!");
        }
    }

    private void scanCardNumber() {
        System.out.println("Enter your card number");
        String tempCardNumber = scanner.nextLine();
        if (card1.getStringNumberOfCard().equals(tempCardNumber)) {
            this.checkCardNumber = true;
        } else {
            this.checkCardNumber = false;
        }
    }

    private void scanPinNumber() {
        System.out.println("Enter your PIN:");
        String tempPinNumber = scanner.nextLine();
        if (card1.getPinNumber().equals(tempPinNumber)) {
            this.checkPinNumber = true;
        } else {
            this.checkPinNumber = false;
        }
    }


    private void accountInterface() {
        System.out.println("1. Balance");
        System.out.println("2. Log out");
        System.out.println("0. Exit");
        int tempChoose;
        tempChoose = scanner.nextInt();

        switch (tempChoose) {
            case 1: {
                System.out.println("0");
                accountInterface();
                break;
            }
            case 2: {
                System.out.println("You have successfully logged out!");
                break;
            }
            case 0: {
                System.out.println("Bye!");
                System.exit(0);
                break;
            }
        }


    }

}
