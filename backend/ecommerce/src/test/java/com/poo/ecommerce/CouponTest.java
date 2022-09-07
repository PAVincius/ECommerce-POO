package com.poo.ecommerce;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CouponTest {
    
    @Test
    void shouldCreateCoupon () {
        Coupon coupon = new Coupon("TEST10", 10, new Date());
        boolean isExpired = coupon.isExpired();
        assertEquals(false, isExpired);
    }

    @Test
    void shouldCreateCouponAndCalculateDiscount () {
        Coupon coupon = new Coupon("TEST10", 10, new Date());
        double discount = coupon.calculateDiscount(1000.0);
        assertEquals(100.0, discount);
    }

    @Test
    void shouldCreateCouponExpired () {
        Coupon coupon = new Coupon("TEST10", 10, new Date(1659364871));
        boolean isExpired = coupon.isExpired();
        assertEquals(true, isExpired);
    }

}
