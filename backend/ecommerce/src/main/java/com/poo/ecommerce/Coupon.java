package com.poo.ecommerce;
import java.util.Date;

public class Coupon {

    String code;
    int percentage;
    Date expiredDate = new Date();

    

    public Coupon(String code, int percentage, Date expiredDate) {
        this.percentage = percentage;
        this.code = code;
        this.expiredDate = expiredDate;
    }
    //override as "optional" parameter
    public Coupon(String code, int percentage) {
    }
    public boolean isExpired() {
        if(expiredDate ==  null) return false;
        Date today = new Date();
        return expiredDate.getTime() < today.getTime();
    }

    public double calculateDiscount(double total) {
        return (total / 100) * percentage;
    }
}
