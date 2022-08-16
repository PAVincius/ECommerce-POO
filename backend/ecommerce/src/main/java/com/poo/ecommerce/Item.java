package com.poo.ecommerce;

public class Item {

    Dimension dimension;
    
    int idItem;
    String category;
    String description;
    int price;
    int width;
    int height;
    int lenght;

    private double weight;

    public Item(int idItem, String  category, String description, int price, Dimension dimension, int weight) {
    }

    public double getVolume(){
        if (this.dimension != null) return this.dimension.getVolume();
		return 0;
    }
    public double getDensity() {
        if (this.weight && this.dimension != null){
			return this.weight / this.dimension.getVolume();
		} else {
			return 0.0;
		}
    }
}
