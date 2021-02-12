package com.javaassessment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoldMontrealTradedProduct implements MontrealTradedProducts {
    private List<Product> productList = new ArrayList<>();
    private Map<String, Integer> productQuantityMap = new HashMap<>();

    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

        boolean productExists= productList.stream()
                    .anyMatch(product1 -> product1.getProductID().equals(product.getProductID()));
        if (productExists)
            throw new ProductAlreadyRegisteredException();
        this.productList.add(product);
    }

    @Override
    public void trade(Product product, int quantity) {
        boolean productExists= productList.stream()
                .anyMatch(product1 -> product1.getProductID().equals(product.getProductID()));
        if(!productExists)
            productQuantityMap.put(product.getProductID(),0);
        productQuantityMap.put(product.getProductID(),quantity);

    }

    @Override
    public int totalTradeQuantityForDay() {
        int totalQuantity = productQuantityMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum();

        return totalQuantity;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        int totalQuantity = productQuantityMap.values().stream()
                .mapToInt(Integer::intValue)
                .sum();

        return totalQuantity;
    }
}
