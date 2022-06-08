package Polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
            Polymorphism = The ability of an object to identify as more than one type
         */

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        //        car.go();
        //        bicycle.go();
        //        boat.go();

        for(Vehicle x : racers){
            x.go();
        }
    }
}
