import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTut {
    public static void main(String[] args) {
        // exception = unexpected events that occur and stop the program
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        } catch(ArithmeticException e){
            System.out.println("You can't divide by zero!");
        } catch(InputMismatchException e){
            System.out.println("Please enter a number");
        } catch(Exception e){
            System.out.println("Something I have no clue about went wrong!"); //kinda like a default
            // can do just the catch(Exception e) but it's lazy. Better practice to catch individual exceptions and deal with them separately
        } finally {
            System.out.println("This will always print");
            // this will ALWAYS execute, even if we catch an exception or not.
            // good to close scanners or files
            scanner.close();
        }
    }
}
