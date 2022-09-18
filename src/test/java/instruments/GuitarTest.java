package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(
                "Bass Guitar SR600E",
                "Ibanez",
                665.00,
                790.00,
                "Ash",
                "Antique brown stain burst",
                4,
                GuitarType.ELECTRIC_BASS,
                4,
                2
        );
    }

    @Test
    public void canPlay(){
        assertEquals("twang twang strum wah wah", guitar.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(125.00, guitar.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Bass Guitar SR600E", guitar.getDescription());
    }

    @Test
    public void canSetDescription(){
        guitar.setDescription("Bass Guitar SR5005-OL Prestige");
        assertEquals("Bass Guitar SR5005-OL Prestige", guitar.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Ibanez", guitar.getBrand());
    }

    @Test
    public void canSetBrand(){
        guitar.setBrand("Fender");
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(665.00, guitar.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        guitar.setWholesalePrice(1250.00);
        assertEquals(1250.00, guitar.getWholesalePrice(), 0.0);
    }
    @Test
    public void canGetPrice(){
        assertEquals(790.00, guitar.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        guitar.setPrice(1579.00);
        assertEquals(1579.00, guitar.getPrice(), 0.0);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Ash", guitar.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        guitar.setMaterial("Mahogany");
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Antique brown stain burst", guitar.getColour());
    }

    @Test
    public void canSetColour(){
        guitar.setColour("Black");
        assertEquals("Black", guitar.getColour());
    }

    @Test
    public void canGetStrings(){
        assertEquals(4, guitar.getStrings());
    }

    @Test
    public void canSetStrings(){
        guitar.setStrings(6);
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void canGetType(){
        assertEquals(GuitarType.ELECTRIC_BASS, guitar.getType());
    }

    @Test
    public void canSetType(){
        guitar.setType(GuitarType.ACOUSTIC_BASS);
        assertEquals(GuitarType.ACOUSTIC_BASS, guitar.getType());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(4, guitar.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        guitar.setDeliveryFactor(3);
        assertEquals(3, guitar.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(2, guitar.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        guitar.setSetupFactor(1);
        assertEquals(1, guitar.getSetupFactor());
    }

    @Test
    public void canGetInsuranceFactor(){
        assertEquals(32, guitar.getInsuranceFactor());
    }

}
