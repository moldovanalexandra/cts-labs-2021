package ro.ase.acs.builder;

import java.util.Date;

public class Product {
    private String name;
    private float price;
    private long barCode;
    private int quantity;
    private Date expireDate;
    private float discount;
    private boolean isVeganFriendly;
    private boolean isVegeterianFriendly;
    private boolean isGlutenFree;


    public Product(String name, float price, long barCode, int quantity, Date expireDate, float discount, boolean isVeganFriendly, boolean isVegeterianFriendly, boolean isGlutenFree) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.discount = discount;
        this.isVeganFriendly = isVeganFriendly;
        this.isVegeterianFriendly = isVegeterianFriendly;
        this.isGlutenFree = isGlutenFree;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public int getQuantity() {
        return quantity;
    }

//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public Date getExpireDate() {
//        return expireDate;
//    }
//
//    public void setExpireDate(Date expireDate) {
//        this.expireDate = expireDate;
//    }
//
//    public float getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(float discount) {
//        this.discount = discount;
//    }
//
//    public boolean isVeganFriendly() {
//        return isVeganFriendly;
//    }
//
//    public void setVeganFriendly(boolean veganFriendly) {
//        isVeganFriendly = veganFriendly;
//    }
//
//    public boolean isVegeterianFriendly() {
//        return isVegeterianFriendly;
//    }
//
//    public void setVegeterianFriendly(boolean vegeterianFriendly) {
//        isVegeterianFriendly = vegeterianFriendly;
//    }
//
//    public boolean isGlutenFree() {
//        return isGlutenFree;
//    }
//
//    public void setGlutenFree(boolean glutenFree) {
//        isGlutenFree = glutenFree;
//    }

    //proprietate java: pot crea 2 clase in aceeasi fila cu conditia ca cea NESTED sa fie statica

    public static class ProductBuilder{
        private Product product;

        public ProductBuilder(){
            //putem sa fac product() in clasa de baza
          this.product = new Product(null, 0);
        }

        public ProductBuilder addName(String name){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.name = name;
            return this;
        }

        public ProductBuilder addPrice(float price){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.price = price;
            return this;
        }

        public ProductBuilder addBarCode(long barCode){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.barCode = barCode;
            return this;
        }

        public ProductBuilder addQuantity(int quantity){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.quantity = quantity;
            return this;
        }

        public ProductBuilder addExpireDate(Date expireDate){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.expireDate = expireDate;
            return this;
        }

        public ProductBuilder addDiscount(float discount){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.discount=discount;
            return this;
        }

        public ProductBuilder addIsVeganFriendly(boolean isVeganFriendly){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.isVeganFriendly = isVeganFriendly;
            return this;
        }

        public ProductBuilder addIsVegeterianFriendly(boolean isVegeterianFriendly){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.isVegeterianFriendly =isVegeterianFriendly;
            return this;
        }

        public ProductBuilder addIsGlutenFree(boolean isGlutenFree){
            //facem clasa in clasa pentru a accesa campurile private
            this.product.isGlutenFree = isGlutenFree;
            return this;
        }

        public Product build(){
            return product;
        }


    }

}
