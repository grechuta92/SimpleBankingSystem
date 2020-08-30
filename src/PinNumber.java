import java.util.Arrays;
import java.util.Random;

public class PinNumber {
    private int[] pinNumberTable;
    private String pinNumber;
    Random random = new Random();

    public PinNumber() {
        this.pinNumberTable = new int[4];
        createPinNumber();
    }

    private void createPinNumber() {
        for (int i = 0; i < pinNumberTable.length; i++) {
            pinNumberTable[i] = random.nextInt(10);
        }
        this.pinNumber = Arrays.toString(this.pinNumberTable).replace(", ", "").replace("[", "").replace("]", "");
    }

    public void getPinNumber() {
        System.out.println(this.pinNumber);
    }

    public String getStringPinNumber() {
        return this.pinNumber;
    }

}
