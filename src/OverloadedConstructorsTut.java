public class OverloadedConstructorsTut {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("here's your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza pizza2 = new Pizza("thicc crust", "tomato");
        System.out.println("here's your pizza");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);
    }
}
