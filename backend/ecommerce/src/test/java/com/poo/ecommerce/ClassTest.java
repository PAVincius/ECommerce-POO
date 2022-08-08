package com.poo.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class ClassTest {

    @Test
    void twoPlusTwoEqualsFour(){
        var calculator = new Class();
        assertEquals(4, calculator.add(2,2));
    }
}
