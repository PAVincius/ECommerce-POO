package com.poo.ecommerce;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DimensionTest {
    
    @Test
    void shouldCreateDimentions(){
        Dimension dimension = new Dimension(100,30,10);
        double volume = dimension.getVolume();
        assertEquals(0.03,volume);
    }
}
