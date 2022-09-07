package com.poo.ecommerce;

public class OrderItem {
    int idItem;
    int price;
    int quantity;

    public OrderItem(int idItem, int price, int quantity) {
        this.idItem = idItem;
        this.price = price;
        this.quantity = quantity;
    }


    public double getTotalOrder(){
       return price * quantity;
    }

}
