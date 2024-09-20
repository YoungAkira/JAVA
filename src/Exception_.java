import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divede by: ");
            int y = scanner.nextInt();

            int result = x/y;

            System.out.println("Result: " + result);
        } 
        catch(ArithmeticException e) {
            System.out.println("YOU CANT DIVIDE A NUMBER TO ZERO");
        }
        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!!!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        finally {
            scanner.close();
        }       
    }
}
