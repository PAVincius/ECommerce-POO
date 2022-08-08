package com.poo.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CpfTests {
    @Test
    void ShouldTestValidCpf(){
        Cpf cpf = new Cpf("73634135417");
        assertEquals("73634135417", cpf.getCpf());
    }
}
