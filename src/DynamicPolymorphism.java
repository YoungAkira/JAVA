import java.util.Scanner;

public class DynamicPolymorphism {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        //input to
        System.out.println("What animal do you want?");
        System.out.print("(1=dog) or (2=cat)");
        int choice = scanner.nextInt();

        if(choice == 1) {
           animal = new Dog02();
           
           animal.speak();
        }
        else if(choice == 2) {
            animal = new Cat();

            animal.speak();
        }else {
            animal = new Animal();

            System.out.println();
            System.out.println("That choice was invalid");

            animal.speak();
        }
    }
}
