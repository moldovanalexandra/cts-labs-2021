package ro.ase.acs.builder;

import java.util.Date;

public class ProductBuilderV2 {
    private String name;
    private float price;
    private long barCode;
    private int quantity;
    private Date expireDate;
    private float discount;
    private boolean isVeganFriendly;
    private boolean isVegeterianFriendly;
    private boolean isGlutenFree;

    public ProductBuilderV2 addName(String name){
        //facem clasa in clasa pentru a accesa campurile private
        this.name = name;
        return this;
    }

    public ProductBuilderV2 addPrice(float price){
        //facem clasa in clasa pentru a accesa campurile private
        this.price = price;
        return this;
    }

    public ProductBuilderV2 addBarCode(long barCode){
        //facem clasa in clasa pentru a accesa campurile private
        this.barCode = barCode;
        return this;
    }

    public ProductBuilderV2 addQuantity(int quantity){
        //facem clasa in clasa pentru a accesa campurile private
        this.quantity = quantity;
        return this;
    }

    public ProductBuilderV2 addExpireDate(Date expireDate){
        //facem clasa in clasa pentru a accesa campurile private
        this.expireDate = expireDate;
        return this;
    }

    public ProductBuilderV2 addDiscount(float discount){
        //facem clasa in clasa pentru a accesa campurile private
        this.discount=discount;
        return this;
    }

    public ProductBuilderV2 addIsVeganFriendly(boolean isVeganFriendly){
        //facem clasa in clasa pentru a accesa campurile private
        this.isVeganFriendly = isVeganFriendly;
        return this;
    }

    public ProductBuilderV2 addIsVegeterianFriendly(boolean isVegeterianFriendly){
        //facem clasa in clasa pentru a accesa campurile private
        this.isVegeterianFriendly =isVegeterianFriendly;
        return this;
    }

    public ProductBuilderV2 addIsGlutenFree(boolean isGlutenFree) {
        //facem clasa in clasa pentru a accesa campurile private
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public Product build() {
        return new Product(name,price,barCode,quantity,expireDate,discount,isVeganFriendly,isVegeterianFriendly,isGlutenFree);
    }


}
