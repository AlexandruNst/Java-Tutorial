package Generics;

public class BoundedTypes {
    public static void main(String[] args) {
        // bounded types = you can create object of a generic class to have data of specific derived types e.g. Number

        MyGenericClassBounded<Integer> myInt = new MyGenericClassBounded<>(1);
        MyGenericClassBounded<Double> myDouble = new MyGenericClassBounded<>(3.14);
        //MyGenericClassBounded<String> myString = new MyGenericClassBounded<>("Hello");
        // NOT allowed, because String is not a subclass of Number, unlike Integer and Double
    }
}
