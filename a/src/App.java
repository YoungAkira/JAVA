public class SwapVariables {

    public static void main(String[] args) {

        String x = "water";
        String y = "Juice";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("X: "+x);
        System.out.println("Y: "+y);
        System.out.println("temp: "+temp);

    }
}