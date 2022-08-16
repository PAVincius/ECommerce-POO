package com.poo.ecommerce;

public class Dimension {
    int width;
    int height;
    int length;
    
    public Dimension(int width2, int height2, int lenght) {
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    
    public double getVolume() { 
        return this.width/100 + this.height/100 + this.length;
    }
    
}
