public class PrintfTut {
    public static void main(String[] args) {
        System.out.printf("This is a format string %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 10.5;

        //[conversion-character]
        System.out.printf("This is a format string %b", myBoolean);
        System.out.printf("This is a format string %c", myChar);
        System.out.printf("This is a format string %s", myString);
        System.out.printf("This is a format string %d", myInt);
        System.out.printf("This is a format string %f", myDouble); //floats AND doubles

        System.out.println("/////");
        //[width]
        System.out.printf("Hello %10s", myString); //right justified
        System.out.printf("Hello %-10s", myString); //left justified

        System.out.println("/////");
        //[precision]
        System.out.printf("This is money %.2f", myDouble); //floats AND doubles

        System.out.println("/////");
        //[flags]
        /*
        - : left justify
        + : right justify
        0 : zero-pad numeric values
        , : comma grouping separators for thousands
         */
        myDouble = 10000.34;
        System.out.printf("This is money %-20f", myDouble); //floats AND doubles
        System.out.printf("This is money %20f",  myDouble); //floats AND doubles
        System.out.printf("This is money %020f", myDouble); //floats AND doubles
        System.out.printf("This is money %,f",   myDouble); //floats AND doubles




    }
}
