package com.poo.ecommerce;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {

    @Test
    void shouldCreateOrder () {
        Order order = new Order("73634135417");
        assertEquals(0,order.getTotal());
    }

    @Test
    void shouldCreateOrderWith3Items () {
        Order order = new Order("73634135417");
        order.addItem(new Item(1, "Notebook", "Asus Zephyrus G14", 10000),1);
        order.addItem(new Item(2, "GPU", "RTX 3090 Zotac", 8999),1);
        order.addItem(new Item(3, "Memoria RAM", "G. Skill trident z royal series", 4800),2);
        int total = order.getTotal();
        assertEquals(28599, total);
    }

}
