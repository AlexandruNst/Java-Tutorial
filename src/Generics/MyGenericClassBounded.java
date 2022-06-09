package Generics;

public class MyGenericClassBounded<Thing extends Number> {
    Thing x;

    MyGenericClassBounded(Thing x){ this.x = x; }

    public Thing getValue(){
        return x;
    }
}
