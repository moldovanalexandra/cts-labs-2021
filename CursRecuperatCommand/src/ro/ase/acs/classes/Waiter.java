package ro.ase.acs.classes;

import java.util.ArrayList;
import java.util.List;

//executant
public class Waiter {

    private List<FoodOrder> orders = new ArrayList<FoodOrder>();

    //private Chef chef = new Chef();
    //daca faceam asa trebuia sa merg cu setteri in BurgerOrder si PizzaOrder

    public void addOrder(FoodOrder order){
        orders.add(order);
    }

    public void sendOrdersToKitchen(){
        for(FoodOrder order : orders){
            order.cook();
        }
        orders.clear();
        //daca le las in lista data viitoare le trimite din nou
    }
}
