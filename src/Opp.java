    public class Opp {

        public static void main(String[] args) {

            Car myCar = new Car("Chevrollet", "Corvette", 2020, "black", 900000);

            //System.out.println(myCar);

            System.out.println(myCar.details());

            myCar.drive();
            myCar.brake();

        }
    }