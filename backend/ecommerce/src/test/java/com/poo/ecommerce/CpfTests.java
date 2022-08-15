package com.poo.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CpfTests {
    @Test
    void ShouldTestValidCpf(){
        Cpf cpf = new Cpf("73634135417");
        assertEquals("73634135417", cpf.getCpf());
    }
    @Test
    public void ShouldTestInvalidCpf() {

        Throwable exception = assertThrows(
            IllegalArgumentException.class, () -> {
                Cpf cpf = new Cpf("12312312312");
            }
        ); 
    assertEquals("Invalid Cpf", exception.getMessage()); 
    }
}
