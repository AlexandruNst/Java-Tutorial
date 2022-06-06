public class StaticTut {
    public static void main(String[] args) {
        // static means the class "owns" the variable, so each instance of the class (i.e. every object) will have that variable
        System.out.println(Friend.numberOfFriends);

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");

        System.out.println(Friend.numberOfFriends);

        Friend friend32 = new Friend("Squidward");

        System.out.println(Friend.numberOfFriends);
        System.out.println(friend1.numberOfFriends); //works but NOT GOOD PRACTICE

        Friend.displayFriends();

    }
}
