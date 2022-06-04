import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        // Nested loops
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";

        System.out.println("Enter # of rows");
        rows = scanner.nextInt();

        System.out.println("Enter # of cols");
        columns = scanner.nextInt();

        System.out.println("Enter symbol");
        symbol = scanner.next();

        for(int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
