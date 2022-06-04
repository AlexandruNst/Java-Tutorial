public class ArrayTut {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvett", "Tesla", "BMW"};

        cars[0] = "Mustang";

        System.out.println(cars[3]);

        String[] newCars = new String[3];
        newCars[0] = "Camaro";
        newCars[1] = "Corvett";
        newCars[2] = "Tesla";

        System.out.println(newCars[1]);

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        for(String car : cars){
            System.out.println(car);
        }

        //Multi-dimensional arrays

        String[][] otherCars = new String[3][3];

        otherCars[0][0] = "Camaro";
        otherCars[0][1] = "Corvette";
        otherCars[0][2] = "Silverado";
        otherCars[1][0] = "Mustang";
        otherCars[1][1] = "Ranger";
        otherCars[1][2] = "F-150";
        otherCars[2][0] = "Ferrari";
        otherCars[2][1] = "Lambo";
        otherCars[2][2] = "Tesla";

        for(int i = 0 ; i < otherCars.length; i++){
            System.out.println();
            for(int j = 0; j < otherCars[i].length; j++){
                System.out.print(otherCars[i][j] + " ");
            }
        }

        //other way to initialise
        String[][] otherOtherCars = {{"Camaro",  "Corvett",  "Tesla"},
                                     {"Camaro2", "Corvett2", "Tesla2"}};

    }
}
