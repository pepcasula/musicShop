package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SparePartTest {

    SparePart partSpare;

    @Before
    public void before(){
        partSpare = new SparePart(
                "22\" Bass Drumhead PTH-22PL",
                "Pearl",
                38.90,
                47.90,
                SparePartType.DRUMS_PART,
                2,
                0
        );
    }
    
    @Test
    public void canGetMarkup(){
        assertEquals(9.00, partSpare.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("22\" Bass Drumhead PTH-22PL", partSpare.getDescription());
    }

    @Test
    public void canSetDescription(){
        partSpare.setDescription("Digital Piano Triple Pedal Unit RPU-3");
        assertEquals("Digital Piano Triple Pedal Unit RPU-3", partSpare.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Pearl", partSpare.getBrand());
    }

    @Test
    public void canSetBrand(){
        partSpare.setBrand("Roland");
        assertEquals("Roland", partSpare.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(38.90, partSpare.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        partSpare.setWholesalePrice(40.90);
        assertEquals(40.90, partSpare.getWholesalePrice(), 0.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(47.90, partSpare.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        partSpare.setPrice(55.90);
        assertEquals(55.90, partSpare.getPrice(), 0.0);
    }

    @Test
    public void canGetSparePartType(){
        assertEquals(SparePartType.DRUMS_PART, partSpare.getSparePartType());
    }

    @Test
    public void canSetSparePartType(){
        partSpare.setSparePartType(SparePartType.PIANO_PART);
        assertEquals(SparePartType.PIANO_PART, partSpare.getSparePartType());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(2, partSpare.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        partSpare.setDeliveryFactor(0);
        assertEquals(0, partSpare.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(0, partSpare.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        partSpare.setSetupFactor(3);
        assertEquals(3, partSpare.getSetupFactor());
    }

    @Test
    public void canGetInsuranceFactor(){
        assertEquals(1, partSpare.getInsuranceFactor());
    }
}
