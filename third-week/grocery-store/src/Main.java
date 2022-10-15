import java.util.Scanner;

public class Main extends Fruits {
    public static void main(String[] args) {
        //Fruits fruits = new Fruits();
        /*Pear pear = new Pear();
        System.out.println(pear.getFruitName());*/

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.print("Select the fruit you want to buy: ");
            String fruit = input.next();
            System.out.print("How many kg of "+fruit+ " would you like to buy?: ");
            int kg = input.nextInt();
            if (kg>100){
                System.out.println("There is not enough fruit.");
            }
           //..
        }


    }
}