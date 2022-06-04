public class SwitchTut {
    public static void main(String[] args) {

        String day = "Sunday";

        switch(day){
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
