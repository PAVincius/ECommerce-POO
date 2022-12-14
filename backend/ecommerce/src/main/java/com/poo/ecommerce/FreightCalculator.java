package com.poo.ecommerce;

public class FreightCalculator {
    Item item;
    int quantity;

    public FreightCalculator(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    static public double calculate(Item item, int quantity) {
        return (item.getVolume() * 1000.0 * (item.getDensity()/100.0)) * quantity;
    }
}
