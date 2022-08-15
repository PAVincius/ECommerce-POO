package com.poo.ecommerce;
import java.util.ArrayList;

public class Order{
    Cpf cpf;
    ArrayList<OrderItem> orderItem;

    public Order(String cpf) {
        this.cpf = new Cpf(cpf);
        ArrayList<OrderItem> orderItems = new ArrayList<>();
        this.orderItem = orderItems;

    }

    public int getTotal(){
        return 0;
    }

    public void addItem(Item item, int quantity){
        this.orderItem.add(new OrderItem(item.idItem,item.price, quantity));
    }
    
}
