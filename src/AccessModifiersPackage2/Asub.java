package AccessModifiersPackage2;
import AccessModifiersPackage1.*;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}

// private is private to the class
// public is public
//default is package level
//protected is package level + other package ONLY IF the class in the other package is a subclass
