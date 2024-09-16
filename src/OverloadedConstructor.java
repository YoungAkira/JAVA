public class OverloadedConstructor {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thic crust", "", "mozzarela");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
    }
}