package ro.ase.acs.main;

import ro.ase.acs.builder.Product;
import ro.ase.acs.builder.ProductBuilderV2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("milk", 10, 12345,23,null,0,false, true, true);
        Product product2 = new Product("chocolate",7);
        //product2.setQuantity(10);
        //product2.setBarCode(123123);
        //...
        //product2.setExpireDate(new Date());

        Product product3 = new Product.ProductBuilder()
                .addName("milk")
                .addBarCode(12345)
                .addQuantity(23)
                .addIsVegeterianFriendly(true)
                .addIsGlutenFree(true)
                .build();

        ProductBuilderV2 builder = new ProductBuilderV2();
        builder.addName("chocolate");
        builder.addPrice(7);
        builder.addQuantity(10);
        builder.addBarCode(123123);
        Product product4 = builder.build();
    }
}
