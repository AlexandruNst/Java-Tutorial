public class Scanner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello 2 :)");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); //to flush the scanner!

        System.out.println("You are " + age + " years old.");

        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("You like " + food);
    }
}
