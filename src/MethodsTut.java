public class MethodsTut {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        System.out.println(sum(x, y));

    }

    static void hello(String name, int age){
        System.out.println("Hello, " + name + "! :). You are " + age + " years old.");
    }

    static int sum(int x, int y){
        return x + y;
    }
}
