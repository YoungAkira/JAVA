public class Car{

    String make;
    String model;
    int year;
    String color;
    double price;

    public Car(String make, String model, int year, 
               String color, double price) {

                this.make = make;
                this.model = model;
                this.year = year;
                this.color = color;
                this.price = price;
    }

    void drive() {
        System.out.println("You drive the car.");
    }

    void brake() {
        System.out.println(" You step on the brake");
    }

    public String details() {

        return "MAKE: " + make + ", MODEL: " + model + ", YEAR: " + year +
            ", COLOR: " + color + ", PRICE: " + price;
    }
}