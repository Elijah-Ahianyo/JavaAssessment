package com.javaassessment;
import junit.framework.TestCase;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class StocksTest extends TestCase {
    Stocks stocks;
    ProductPricingService productPricingService = Mockito.mock(ProductPricingService.class);

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Mockito.when(productPricingService.price(Mockito.anyString(),Mockito.anyString()))
                .thenReturn(1200.50);

        this.stocks = new Stocks("dollar", "32");
        this.stocks.setCurrentPrice(productPricingService);
    }

    public void testPriceValue(){
        assertEquals(1200.50, this.stocks.getCurrentPrice());
    }
}