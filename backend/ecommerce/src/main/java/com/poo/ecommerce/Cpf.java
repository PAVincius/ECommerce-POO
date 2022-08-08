package com.poo.ecommerce;

public class Cpf {
    String cpf;

    public String getCpf() {
        return cpf;
    }

    public Cpf(String cpf) {
        if(CpfValidator.isValidCPF(cpf) == true){
            this.cpf = cpf;
        }else{
            throw new IllegalArgumentException("Invalid Cpf");
        }
    } 
}