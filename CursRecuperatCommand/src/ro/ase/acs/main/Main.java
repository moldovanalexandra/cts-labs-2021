package ro.ase.acs.main;
import ro.ase.acs.classes.*;

//decuplarea apelatorului de apelant :D

public class Main {
    public static void main(String[] args){
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        FoodOrder order1 = new BurgerOrder(chef);
        waiter.addOrder(order1);

        FoodOrder order2 = new PizzaOrder(chef);
        waiter.addOrder(order2);

        FoodOrder order3 = new BurgerOrder(chef);
        waiter.addOrder(order3);

        waiter.sendOrdersToKitchen();
    }
}
