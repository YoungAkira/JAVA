public class Polymorphism {

    public static void main(String[] args) {

        Boat boat = new Boat();
        Byke02 byke = new Byke02();
        Car05 car = new Car05();

        Vehicle02[] racers = {boat, byke, car};

        //Vehicle02 x: collect every iterating racers at x
        for(Vehicle02 x : racers) {
            x.go();
        }
    }
}