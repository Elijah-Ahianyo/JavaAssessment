package com.javaassessment;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GoldMontrealTradedProductTest extends TestCase {
    MontrealTradedProducts goldMontrealTradedProduct;
    Product product;
    ProductPricingService productPricingService = Mockito.mock(ProductPricingService.class);

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Mockito.when(productPricingService.price(Mockito.anyString(),Mockito.anyString(),Mockito.anyInt(),Mockito.anyInt()))
                .thenReturn(1200.50);
        this.goldMontrealTradedProduct = new GoldMontrealTradedProduct();
//        this.product = new Futures(productPricingService)
    }


    @Test
    public void addNewProduct() {
        this.goldMontrealTradedProduct.addNewProduct();
    }

    @Test
    public void trade() {
    }

    @Test
    public void totalTradeQuantityForDay() {
    }

    @Test
    public void totalValueOfDaysTradedProducts() {
    }
}