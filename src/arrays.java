public class arrays {

    public static void main(String[] args) {

        String[] cars = new String[3];

        cars[0] = "Corvette";
        cars[1] = "Camaro";
        cars[2] = "Tesla";

        for(int i = 0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}