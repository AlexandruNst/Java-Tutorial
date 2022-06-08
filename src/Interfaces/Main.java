package Interfaces;

public class Main {
    public static void main(String[] args) {
        /*
            Interface = a template that can be applied to a class
                         similar to inheritance, but specifies what a class has and must do
                         classes can apply more than one interface, but interface is limited to 1 super
         */

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
