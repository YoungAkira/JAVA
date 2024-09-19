public class Encapsulation {

    public static void main(String[] args) {

        CarEncapsulation car = new CarEncapsulation("Toyota", "Supra", 2005);

        car.setYear(2003);


        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}