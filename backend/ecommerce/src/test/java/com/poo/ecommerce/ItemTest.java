package com.poo.ecommerce;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



public class ItemTest {
    
    @Test
    public void shouldCreateItemWithDimentions(){
        Item item = new Item(1, "Notebook", "Asus Zephyrus G14", 1000, new Dimension(100, 30, 10));
        double volume = item.getVolume();
        assertEquals(0.03, volume);
    }

    @Test
    public void shouldCreateItemWithDimentionsAndCalculateDensity(){
        Item item = new Item(1, "Notebook", "Asus Zephyrus G14", 1000, new Dimension(100, 30, 10), 3);
        double density = item.getDensity();
        assertEquals(100, density);
    }
}
