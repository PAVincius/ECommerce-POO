package com.poo.ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FreightTest {

    @Test
    void shouldCalculateOneItemFreight () {
        Item item = new Item(4, "Monitor", "ASUS ROG 21' IPS Ultrawide" , 3000, new Dimension(100,30,10),3);
        Freight freight = new Freight(0);
        freight.addItem(item,1);
        double total = freight.getTotal(1);
        assertEquals(30, total);
    }

}
