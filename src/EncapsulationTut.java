public class EncapsulationTut {
    public static void main(String[] args) {
        //Encapsulation = attributes of a class are private
        //                can be accessed through getters and setters
        //                by default, make all attributes private, unless specifically not having to

        CarEncapsulation car = new CarEncapsulation("Chevrolet", 2021);
        //System.out.println(car.make); // can't do this, because it's private
        System.out.println(car.getMake());
        car.setYear(2022);
        System.out.println(car.getYear());
    }
}
