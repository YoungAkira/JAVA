public class ObjectPassing {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car03 car1 = new Car03("BMW");
        Car03 car2 = new Car03("TESLA");

        garage.park(car1);
        garage.park(car2);
    }
}