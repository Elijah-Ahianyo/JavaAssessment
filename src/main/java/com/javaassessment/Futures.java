package com.javaassessment;

public class Futures extends Product {
    private String exchange;
    private String contactCode;
    private int month;
    private int year;
    private double price;

    public Futures(String exchange, String contactCode, int month, int year){
        this.exchange = exchange;
        this.contactCode = contactCode;
        this.month = month;
        this.year = year;
    }
    public double getCurrentPrice() {
        return this.price;
    }
    @Override
    public void setCurrentPrice(ProductPricingService productPricingService) {
        this.price = productPricingService.price(this.exchange,this.contactCode,this.month,this.year);
    }
}
