import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryStackDriver {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        BinaryStack stack;
        try {
            int decimalValue, temporaryDecimalValue, remainder, originalValue, sizeOfStack = 0;
            System.out.print("Input Decimal Value: ");
            decimalValue = stdIn.nextInt();
            temporaryDecimalValue = decimalValue;
            originalValue = decimalValue;

            while (temporaryDecimalValue > 0) {
                sizeOfStack++;
                temporaryDecimalValue /= 2;
            }

            stack = new BinaryStack(sizeOfStack);

            while (decimalValue > 0) {
                remainder = (decimalValue % 2);
                stack.push(remainder);
                decimalValue /= 2;
            }
            System.out.println("Original Value: " + originalValue + "\nBinary Sequence: ");
            stack.print();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid data type.");
            System.exit(1);
        }
    }
}