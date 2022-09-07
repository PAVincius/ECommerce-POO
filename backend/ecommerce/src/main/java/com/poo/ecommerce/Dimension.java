package com.poo.ecommerce;

public class Dimension {
    int width;
    int height;
    int length;
    
    public Dimension(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public double getVolume() { 
        return width/100.0 * height/100.0 * length/100.0;
    }
    
}
