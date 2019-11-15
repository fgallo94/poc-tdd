package discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscountApplierTest {

    private DiscountApplier applier;

    @BeforeEach
    public void setUp() {
        applier = new DiscountApplier();
    }

    @Test
    public void discountForMacAndIphoneTogether() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("MACBOOK", 1000)
                .withItem("IPHONE", 800)
                .build();
        applier.apply(basket);
        double expected = (1000 + 800) * (1 - 0.15);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForNotebookAndWindowPhoneTogether() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("NOTEBOOK", 1000)
                .withItem("WINDOWS PHONE", 800)
                .build();
        applier.apply(basket);
        double expected = (1000 + 800) * (1 - 0.12);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForXbox() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("XBOX", 1100)
                .build();
        applier.apply(basket);
        double expected = (1100) * (1 - 0.7);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForLessThanTwoItemsLesserThanAThousand() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("TV", 100)
                .build();
        applier.apply(basket);
        double expected = (100) * (1 - 0.02);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForThreeOrFourProducts() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("TV", 1000)
                .withItem("ALEXA", 1000)
                .withItem("CHROMECAST", 1050)
                .build();
        applier.apply(basket);
        double expected = (1000 + 1000 + 1050) * (1 - 0.05);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

    @Test
    public void discountForFiveOrMoreProducts() {
        Basket basket = new Basket.BasketBuilder()
                .withItem("TV", 1000)
                .withItem("ALEXA", 1000)
                .withItem("CHROMECAST", 1050)
                .withItem("BIKE", 1050)
                .withItem("REFRIGERATOR", 1050)
                .build();
        applier.apply(basket);
        double expected = (1000 + 1000 + 1050 + 1050 + 1050) * (1 - 0.06);
        Assertions.assertEquals(expected, basket.getAmount(), 0.0001);
    }

}
