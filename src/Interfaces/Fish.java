package Interfaces;

public class Fish implements Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("Fish hunts!");
    }

    @Override
    public void flee() {
        System.out.println("Fish flees!");
    }
}
