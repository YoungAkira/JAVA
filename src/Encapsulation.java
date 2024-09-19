public class Encapsulation {

    public static void main(String[] args) {

        CarEncapsulation car1 = new CarEncapsulation("Toyota", "Supra", 2003);
        //CarEncapsulation car2 = new CarEncapsulation("Chevrolet", "Camaro", 2020);

        //copying info the car || car2.copy(car1);
        CarEncapsulation car2 = new CarEncapsulation(car1);

                          
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}
