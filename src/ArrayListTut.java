import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListTut {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hot dog");

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        System.out.println("//////////");

        food.set(0, "sushi");

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        System.out.println("//////////");

        food.remove(2);

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        System.out.println("//////////");

        food.clear();

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        // 2D ArrayList
        System.out.println("//////////");
        System.out.println("2D ArrayLists");

        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        for(int i = 0; i < bakeryList.size(); i++){
            System.out.println(bakeryList.get(i));
        }
        System.out.println("//////////");

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("soda");
        drinksList.add("coffee");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);

    }
}
