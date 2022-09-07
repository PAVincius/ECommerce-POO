package com.poo.ecommerce;

import com.poo.ecommerce.Dimension;
import com.poo.ecommerce.Freight;
import com.poo.ecommerce.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FreightCalculatorTest {

    @Test
    void shouldCalculateOneItemFreight () {
        Item item = new Item(4, "Monitor", "ASUS ROG 21' IPS Ultrawide" , 3000, new Dimension(100,30,10),3);
        FreightCalculator freight = new FreightCalculator(item, 2);
        double total = freight.calculate(item, 2);
        assertEquals(60, total);
    }

}