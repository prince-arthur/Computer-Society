import java.util.Scanner;

public class FactorialOfANumber {

    public static void factorialOfANumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        boolean isInt = input.hasNextInt();
        if(isInt) {
            int factOfNumber = input.nextInt();
            int count = factOfNumber;
            factOfNumber = 1;
            while (count > 0) {
                factOfNumber *= count;
                count--;
            }
            System.out.println("Factorial of the given number: " + factOfNumber);
        } else
            System.out.println("Error! Wrong input");
        input.close();
    }
}
