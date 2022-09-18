package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind woodwind;

    @Before
    public void before(){
        woodwind = new Woodwind(
                "Alto Saxophone SA80 Series II",
                "Selmer Paris",
                4240.00,
                4990.00,
                "Brass",
                "Gold",
                WoodwindType.SAXOPHONE,
                "Selmer S80 C",
                4,
                4
        );
    }

    @Test
    public void canPlay(){
        assertEquals("toot-wah toot-wah toot-waaaah", woodwind.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(750.00, woodwind.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Alto Saxophone SA80 Series II", woodwind.getDescription());
    }

    @Test
    public void canSetDescription(){
        woodwind.setDescription("Alto Saxophone YAS-875EXGP");
        assertEquals("Alto Saxophone YAS-875EXGP", woodwind.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Selmer Paris", woodwind.getBrand());
    }

    @Test
    public void canSetBrand(){
        woodwind.setBrand("Yamaha");
        assertEquals("Yamaha", woodwind.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(4240.00, woodwind.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        woodwind.setWholesalePrice(4500.00);
        assertEquals(4500.00, woodwind.getWholesalePrice(), 0.00);
    }

    @Test
    public void canGetPrice(){
        assertEquals(4990.00, woodwind.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        woodwind.setPrice(5790.00);
        assertEquals(5790.00, woodwind.getPrice(), 0.0);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", woodwind.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        woodwind.setMaterial("Silver");
        assertEquals("Silver", woodwind.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Gold", woodwind.getColour());
    }

    @Test
    public void canSetColour(){
        woodwind.setColour("Bronze");
        assertEquals("Bronze", woodwind.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(WoodwindType.SAXOPHONE, woodwind.getType());
    }

    @Test
    public void canSetType(){
        woodwind.setType(WoodwindType.BASSOON);
        assertEquals(WoodwindType.BASSOON, woodwind.getType());
    }

    @Test
    public void canGetMouthpiece(){
        assertEquals("Selmer S80 C", woodwind.getMouthpiece());
    }

    @Test
    public void canSetMouthpiece(){
        woodwind.setMouthpiece("Yamaha 4CM");
        assertEquals("Yamaha 4CM", woodwind.getMouthpiece());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(4, woodwind.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        woodwind.setDeliveryFactor(3);
        assertEquals(3, woodwind.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(4, woodwind.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        woodwind.setSetupFactor(5);
        assertEquals(5, woodwind.getSetupFactor());
    }

    @Test
    public void canGetInsuranceFactor(){
        assertEquals(200, woodwind.getInsuranceFactor());
    }
}
