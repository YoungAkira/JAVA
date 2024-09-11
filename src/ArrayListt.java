import java.util.ArrayList;

public class ArrayListt {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();        
        
        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("bread");
        bakeryList.add("milk");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomato");
        produceList.add("pasta");
        produceList.add("rice");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("coffee");
        drinksList.add("tea");
        drinksList.add("monster");


        //add object inside other object
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(2));

    }   
}