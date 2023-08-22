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

        // TODO: Omit the use of the 'System.exit()' and replace it with a better alternative.
        //  --
        //  Possible Alternative:
        //  1) Whenever the user inputs and invalid data type - return a message to the user and
        //      have the program loop back to the origin statement.
        //  2) If the user decides to want to exit the program, include the use of a sentinel value.
        //      or any other user-generated input that can safely exit the program at any moment during its runtime.
    }
}