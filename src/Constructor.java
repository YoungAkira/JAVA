public class Constructor {

    public static void main(String[] args) {

        Human human1 = new Human("Roronoa Zoro", 20, 82);
        Human human2 = new Human("Luffy", 19, 72);

        //System.out.println(human1.name);
        //System.out.println(human2.name);

        human1.sleep();
        human2.eat();
    }
        
}
