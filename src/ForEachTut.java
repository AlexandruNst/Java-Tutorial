import java.util.ArrayList;

public class ForEachTut {
    public static void main(String[] args) {
        String[] animals = {"cat", "dog", "rat", "bird"};

        for(String animal : animals){
            System.out.println(animal);
        }

        ArrayList<String> animalsTwo = new ArrayList<>();
        animalsTwo.add("cat");
        animalsTwo.add("dog");
        animalsTwo.add("rat");
        animalsTwo.add("bird");

        for(String animal: animalsTwo){
            System.out.println(animal);
        }
    }
}
