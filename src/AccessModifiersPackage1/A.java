package AccessModifiersPackage1;
import AccessModifiersPackage2.*;

public class A {
    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
