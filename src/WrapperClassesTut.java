public class WrapperClassesTut {
    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // use . to see methods

        //autoboxing and unboxing
        // autoboxing = Java compiler automatic conversion primitive => wrapper
        // unboxing = wrapper => primitive

        if(a==true){ //unboxing
            System.out.println("True");
        }
    }
}
