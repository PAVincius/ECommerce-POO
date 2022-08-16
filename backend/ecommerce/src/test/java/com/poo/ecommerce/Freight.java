package com.poo.ecommerce;

public class Freight {
    private int total = 0;
    private int distance = 1000;

    public Freight(int total) {
        
        this.total = total;
    }
   
    public void addItem(Item item, int quantity){
        this.total += (item.getVolume()*this.distance*(item.getDensity()/100)) * quantity;
    }
    
    public void getTotal(){
        this.total += (item.getVolume()*this.distance*(item.getDensity()/100)) * quantity;
    }

}
