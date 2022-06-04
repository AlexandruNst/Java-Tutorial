import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Bro";

        boolean result = name.equals("Bro");
        System.out.println(result);

        boolean result2 = name.equalsIgnoreCase("bro");
        System.out.println(result2);

        int len = name.length();
        char res = name.charAt(0);
        int ind = name.indexOf("B");
        boolean em = name.isEmpty();
        String up = name.toUpperCase();
        String lo = name.toLowerCase();
        String tr = name.trim();
        String rep = name.replace('o', 'a');
    }
}
