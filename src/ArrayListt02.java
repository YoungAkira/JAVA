import java.util.ArrayList;

public class ArrayListt02 {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<String>();

        //add this way to more praticality 
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add(" bird");

        for(String i : animals) {

            System.out.println(i);
        }
    }
}