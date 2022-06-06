public class ToStringTut {
    public static void main(String[] args) {
        //all objects have the toString();

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        System.out.println(car); //this prints the address in memory of the string // IMPLICITly using toString
        System.out.println(car.toString()); //by default, the same. We OVERRIDE it to have it do something else //EXPLICITly using toString
    }
}
