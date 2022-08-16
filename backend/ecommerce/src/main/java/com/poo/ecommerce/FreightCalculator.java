package com.poo.ecommerce;

public class FreightCalculator {
    Item item;
    int quantity;

    public FreightCalculator(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double calculateFreight(Item item, int quantity) {
        return (item.getVolume() * 1000 * (item.getDensity()/100)) * quantity;
    }
}
