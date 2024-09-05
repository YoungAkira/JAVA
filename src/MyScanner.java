import java.util.Scanner;

public class MyScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What's your favorite food?");
        String favorite = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.print("So you have "+age);
        System.out.println(" yers old!");
        System.out.println("You like "+favorite);

    }
}