import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
Luhn algotithm - Checksum formula used to validate a variety of identification numbers of credit card numbers.


 */

public class LuhnAlg {
    private Random random = new Random();
    private int[] generateNumber = new int[16];
    private int[] tempNumber = new int[16];
    private String luhnCardNumber;
    private ArrayList<String> listOfAccountNumbers = new ArrayList();

    public String generateCardNumberLuhn() {
        int sum = 0;
        generateNumber[0] = 4;
        for (int i = 1; i < 6; i++) {
            generateNumber[i] = 0;
        }
        for (int i = 6; i < generateNumber.length - 1; i++) {
            generateNumber[i] = random.nextInt(10);
        }
        tempNumber = generateNumber.clone();

        for (int i = 0; i < tempNumber.length - 1; i = i + 2) {
            tempNumber[i] *= 2;
        }
        for (int i = 0; i < tempNumber.length - 1; i++) {
            if (tempNumber[i] > 9) {
                tempNumber[i] -= 9;
            }
        }

        for (int i = 0; i < tempNumber.length - 1; i++) {
            sum += tempNumber[i];
        }
        if (sum % 10 != 0) {
            generateNumber[generateNumber.length-1] = (10 - (sum % 10));
        } else {
            generateNumber[generateNumber.length - 1] = 0;
        }
        luhnCardNumber = Arrays.toString(generateNumber).replace(", ", "").replace("[", "").replace("]", "");

        checkDoesCardNumberExist();

        return luhnCardNumber;
    }


    private void checkSumOfLuhnRequirement(int[] tab) {
        int checkSum = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            checkSum += tab[i];
        }

        System.out.println(checkSum);
    }

    private void checkDoesCardNumberExist() {
        if (!listOfAccountNumbers.contains(luhnCardNumber)) {
            listOfAccountNumbers.add(luhnCardNumber);
        } else {
            generateCardNumberLuhn();
        }
    }


}
