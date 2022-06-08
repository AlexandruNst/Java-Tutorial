public class AbstractTut {
    public static void main(String[] args) {
        //abstract = class cannot be instantiated, but can have a subclass
        //           method are declared without implementation

        // VehicleAbstract vehicleAbs = new VehicleAbstract(); // can't instantiate an abstract class
        CarAbstract car = new CarAbstract();
        car.go();
    }
}
