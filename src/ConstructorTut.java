public class ConstructorTut {
    public static void main(String[] args) {
        Human human1 =  new Human("Rick", 65, 70.4);
        Human human2 = new Human("Bro",  21, 54.7);

        System.out.println(human1.name);
        System.out.println(human2.name);
        human2.eat();
    }
}

