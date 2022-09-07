package com.poo.ecommerce;

public class Freight {
    int total;
    private final int distance = 1000;
    private Item item;

    public Freight(int total) {
        this.total = total;
    }
   
    public void addItem(Item item, int quantity){
        total += (item.getVolume() * distance * (item.getDensity()/100.0)) * quantity;
    }
    public double getTotal(int quantity){
       if (total > 0.0 && total <10.0){
           return 10.0;
       }
       return total;
    }
}
