package com.poo.ecommerce;
import java.util.ArrayList;
import java.util.Date;

public class Order{
    Cpf cpf;
    Date issueDate;
    private ArrayList<OrderItem> orderItems;
    Coupon coupon; //can be undefined

    public Order(String cpf, Date issueDate) {
        this.issueDate = issueDate;
        this.cpf = new Cpf(cpf);
        this.orderItems = new ArrayList<>();
    }

    public void addItem(Item item, int quantity){
        this.orderItems.add(new OrderItem(item.idItem,item.price, quantity));
    }

    public void addCoupon(Coupon coupon){
        if(!coupon.isExpired()){
            this.coupon = coupon;
        } 
    }

    public int getTotal(){
        /*int total = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            total += orderItems.getTotalOrder();
            total = 0;
        }
        if(coupon != null){
            total += this.coupon.calculateDiscount(total);
        }*/
        return 0; //just until now
    }   
}
