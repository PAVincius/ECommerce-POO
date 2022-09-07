package com.poo.ecommerce;

public class Item {

    Dimension dimension;
    
    int idItem;
    String category;
    String description;
    int price;

    private double weight;

    public Item(int idItem, String  category, String description, int price) {
        this.idItem = idItem;
        this.category = category;
        this.description = description;
        this.price = price;
    }
    public Item(int idItem, String  category, String description, int price, Dimension dimension) {
        this.idItem = idItem;
        this.category = category;
        this.description = description;
        this.price = price;
        this.dimension = dimension;
    }

    public Item(int idItem, String  category, String description, int price, Dimension dimension, int weight) {
        this.idItem = idItem;
        this.category = category;
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.dimension = dimension;
    }

    public double getVolume(){
        if (this.dimension != null) {
            return this.dimension.getVolume();
        }
		return 0;
    }
    public double getDensity() {
        if (this.dimension != null){
			return weight / dimension.getVolume();
		} else {
			return 0.0;
		}
    }
}
