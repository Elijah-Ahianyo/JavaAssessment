package com.javaassessment;

public class Stocks extends Product{
    private String ticker;
    private String exchange;
    private double currentPrice;


    public Stocks(String exchange, String ticker){
        this.exchange = exchange;
        this.ticker = ticker;
    }
    public double getCurrentPrice() {
        return this.currentPrice;
    }

    @Override
    public void setCurrentPrice(ProductPricingService productPricingService) {
        this.currentPrice = productPricingService.price(this.exchange,this.ticker);
    }
}
