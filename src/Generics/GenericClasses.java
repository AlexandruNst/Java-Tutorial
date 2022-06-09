package Generics;

public class GenericClasses {
    public static void main(String[] args) {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        //            --- vs ---

        MyGenericClass<Integer> myInt2 = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble2 = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar2 = new MyGenericClass<>('@');
        MyGenericClass<String> myString2 = new MyGenericClass<>("Hello");

        System.out.println(myInt2.getValue());
        System.out.println(myDouble2.getValue());
        System.out.println(myChar2.getValue());
        System.out.println(myString2.getValue());

        // ------

        MyGenericClassTwo<String, Double> myNewGenericTwo = new MyGenericClassTwo<>("Hello", 3.14);
        System.out.println(myNewGenericTwo.getFirstValue());
        System.out.println(myNewGenericTwo.getSecondValue());
    }
}
