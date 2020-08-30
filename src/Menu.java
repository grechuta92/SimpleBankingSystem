import java.util.Scanner;

public class Menu {
    Account account;
    private Scanner scanner = new Scanner(System.in);
    private int chooseOption = 0;


    Menu() {
        startProgram();
    }


    public void startProgram() {
        System.out.println("\n1. Create an account");
        System.out.println("2. Log into account");
        System.out.println("0. Exit");
        chooseOption = scanner.nextInt();

        switch (chooseOption) {
            case 1: {
                account = new Account();
                account.createNewCard();
                startProgram();
                break;
            }
            case 2: {
                account.logInToYourAccount();
                startProgram();
                break;
            }
            case 0: {
                System.exit(0);
                break;
            }
            default: {
                startProgram();
            }
        }
    }

}
