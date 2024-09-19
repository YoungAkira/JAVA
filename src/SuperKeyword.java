public class SuperKeyword {

    public static void main() {

        Hero hero1 = new Hero("Flash", 25, "Speed Force");
        Hero hero2 = new Hero("Batman", 26, "$$$");

        System.out.println(hero1.toString());
        System.out.println("--------------");
        System.out.println(hero2.toString());
    }
}