import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Pizza basePizza = new Pizza(true);
        basePizza.addExtraCheese();
        basePizza.addExtraTopping();
        basePizza.takeAway();
        basePizza.getBill();

        DeluxPizza deluxPizza = new DeluxPizza(false);
        deluxPizza.addExtraCheese();
        deluxPizza.addExtraTopping();
        deluxPizza.takeAway();
        deluxPizza.getBill();
    }
}
