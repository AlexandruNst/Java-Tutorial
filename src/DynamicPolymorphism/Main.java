package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Polymorphism = The ability of an object to identify as more than one type
            Dynamic = after compilation (i.e. during runtime)
         */

        Animal animal;

        System.out.println("Do you want a dog or a cat? 1 = dog, 2 = cat");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2){
            animal = new Cat();
            animal.speak();
        } else {
            System.out.println("That choice is invalid");
            animal = new Animal();
            animal.speak();
        }
    }
}
