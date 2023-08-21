import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryStackDriver {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        BinaryStack stack = new BinaryStack();

        try {
            int decimalValue, originalValue;
            System.out.print("Input Decimal Value: ");
            decimalValue = stdIn.nextInt();
            originalValue = decimalValue;
            stack.decimalToBinary(decimalValue);
            System.out.println("\nDecimal Value: \n" + originalValue + "\n\nIt's Binary Sequence: ");
            stack.print();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid data type.");
            System.exit(1);
        }
    }
}