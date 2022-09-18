package instruments;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(
                "Grand Piano GB1K",
                "Yamaha",
                10750.00,
                12200.00,
                "Wood",
                "Ebony",
                88,
                PianoType.GRAND,
                10,
                10
                );
    }

    @Test
    public void canPlay(){
        assertEquals("plink-a-plink-a-plink-a-plink", piano.play());
    }
    @Test
    public void canGetMarkup(){
        assertEquals(1450.00, piano.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Grand Piano GB1K", piano.getDescription());
    }

    @Test
    public void canSetDescription(){
        piano.setDescription("Roland Digital Piano LX706");
        assertEquals("Roland Digital Piano LX706", piano.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Yamaha", piano.getBrand());
    }

    @Test
    public void canSetBrand(){
        piano.setBrand("Steinway");
        assertEquals("Steinway", piano.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(10750.00, piano.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        piano.setWholesalePrice(10500.00);
        assertEquals(10500.00, piano.getWholesalePrice(), 0.0);
    }
    @Test
    public void canGetPrice(){
        assertEquals(12200.00, piano.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        piano.setPrice(15790.00);
        assertEquals(15790.00, piano.getPrice(), 0.0);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        piano.setMaterial("Sugar Pine");
        assertEquals("Sugar Pine", piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("Ebony", piano.getColour());
    }

    @Test
    public void canSetColour(){
        piano.setColour("Walnut");
        assertEquals("Walnut", piano.getColour());
    }

    @Test
    public void canGetKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void canSetKeys(){
        piano.setKeys(190);
        assertEquals(190, piano.getKeys());
    }

    @Test
    public void canGetType(){
        assertEquals(PianoType.GRAND, piano.getType());
    }

    @Test
    public void canSetType(){
        piano.setType(PianoType.UPRIGHT_DIGITAL);
        assertEquals(PianoType.UPRIGHT_DIGITAL, piano.getType());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(10, piano.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        piano.setDeliveryFactor(8);
        assertEquals(8, piano.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(10, piano.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        piano.setSetupFactor(0);
        assertEquals(0, piano.getSetupFactor());
    }

    @Test
    public void canGetInsuranceFactor(){
        assertEquals(488, piano.getInsuranceFactor());
    }
}
