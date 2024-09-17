
public class ArrayObjects {

    public static void main(String[] args) {

        //Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Sushi");
        Food food3 = new Food("Hamburguer");

        /*refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;*/

        Food[] refrigerator = {food1,food2,food3};

        //Acrossing array
        for(int i = 0; i < refrigerator.length; i++){
        System.out.println(refrigerator[i].toString());
      }
    }      
}    

