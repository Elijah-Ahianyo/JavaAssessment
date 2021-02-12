package com.javaassessment;

public abstract class Product {
    private String productID;
    private double currentPrice;

    public double getCurrentPrice() {
        return currentPrice;
    }

    public abstract void setCurrentPrice(ProductPricingService productPricingService);

    public  void setProductID(String productID){
        this.productID = productID;
    }

    public String getProductID(){
        return productID;
    }
}
