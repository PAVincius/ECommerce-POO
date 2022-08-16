package com.poo.ecommerce;
import java.util.Date;

public class Coupon {

    String code;
    int percentage;
    Date expiredDate = new Date();

    

    public Coupon(String code, int percentage, Date expiredDate) {
    }
    //override as "optional" parameter
    public Coupon(String code, int percentage) {
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public boolean isExpired() {
        if(expiredDate ==  null) return false;
        Date today = new Date();
        return expiredDate.getTime() < today.getTime();
    }

    public int calculateDiscount(int value) {
        return (value * this.percentage) / 100;
    }
}
