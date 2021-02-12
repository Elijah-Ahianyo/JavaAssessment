package com.javaassessment;

import junit.framework.TestCase;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class FuturesTest extends TestCase {
    Futures futures;
    ProductPricingService productPricingService = Mockito.mock(ProductPricingService.class);

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Mockito.when(productPricingService.price(Mockito.anyString(),Mockito.anyString(),Mockito.anyInt(),Mockito.anyInt()))
                .thenReturn(1200.50);

        this.futures = new Futures("dollar", "32",12,2021);
        this.futures.setCurrentPrice(productPricingService);
    }

    public void testPriceValue(){
        assertEquals(1200.50, this.futures.getCurrentPrice());
    }

}