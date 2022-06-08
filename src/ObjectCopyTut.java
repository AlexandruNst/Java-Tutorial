public class ObjectCopyTut {
    public static void main(String[] args) {
        CarEncapsulation car1 = new CarEncapsulation("Chevrolet", 2001);
        CarEncapsulation car2 = new CarEncapsulation("Tesla", 2021);

        car2.copy(car1); //copy the attributes from car1 over to car2

        //also,
        CarEncapsulation car3 = new CarEncapsulation(car1);// use a copy constructor
    }
}
