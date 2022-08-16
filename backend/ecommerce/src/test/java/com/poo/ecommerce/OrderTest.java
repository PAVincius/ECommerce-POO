package com.poo.ecommerce;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OrderTest {

    @Test
    void shouldCreateOrder () {
        Order order = new Order("73634135417", new Date());
        assertEquals(0,order.getTotal());
    }

    @Test
    void shouldCreateOrderWith3Items () {
        Order order = new Order("73634135417", new Date(1661179271));
        order.addItem(new Item(1, "Notebook", "Asus Zephyrus G14", 10000),1);
        order.addItem(new Item(2, "GPU", "RTX 3090 Zotac", 8999),1);
        order.addItem(new Item(3, "Memoria RAM", "G. Skill trident z royal series", 4800),2);
        int total = order.getTotal();
        assertEquals(28599, total);
    }
    
    @Test
    void shouldCreateOrderWith3ItemsAndCupom () {
        Order order = new Order("73634135417", new Date(1661179271));
        order.addItem(new Item(1, "Notebook", "Asus Zephyrus G14", 10000),1);
        order.addItem(new Item(2, "GPU", "RTX 3090 Zotac", 8999),1);
        order.addItem(new Item(3, "Memoria RAM", "G. Skill trident z royal series", 4800),2);
        Coupon coupon = new Coupon("UPGRADE15", 15);
        order.addCoupon(coupon);
        double total = order.getTotal();
        assertEquals(22879.2, total);
    }
    @Test
    void shouldCreateOrderWith3ItemsAndExpiredCupom () {
        Order order = new Order("73634135417", new Date(1659364871));
        order.addItem(new Item(1, "Notebook", "Asus Zephyrus G14", 10000),1);
        order.addItem(new Item(2, "GPU", "RTX 3090 Zotac", 8999),1);
        order.addItem(new Item(3, "Memoria RAM", "G. Skill trident z royal series", 4800),2);
        Coupon coupon = new Coupon("UPGRADE15", 15);
        order.addCoupon(coupon);
        double total = order.getTotal();
        assertEquals(28599, total);
    }

}
