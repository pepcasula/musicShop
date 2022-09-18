package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OtherAccessoryTest {

    OtherAccessory otherAccessory;

    @Before
    public void before(){
        otherAccessory = new OtherAccessory(
                "Monitoring Headphones HD25 Plus",
                "Sennheiser",
                125.90,
                169.90,
                OtherCategory.STUDIO_EQUIPMENT,
                1,
                0
        );
    }

    @Test
    public void canGetMarkup(){
        assertEquals(44.00, otherAccessory.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Monitoring Headphones HD25 Plus", otherAccessory.getDescription());
    }

    @Test
    public void canSetDescription(){
        otherAccessory.setDescription("Monitoring Headphones DT990 Pro");
        assertEquals("Monitoring Headphones DT990 Pro", otherAccessory.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Sennheiser", otherAccessory.getBrand());
    }

    @Test
    public void canSetBrand(){
        otherAccessory.setBrand("Beyerdynamic");
        assertEquals("Beyerdynamic", otherAccessory.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(125.90, otherAccessory.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        otherAccessory.setWholesalePrice(102.50);
        assertEquals(102.50, otherAccessory.getWholesalePrice(), 0.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(169.90, otherAccessory.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        otherAccessory.setPrice(150.00);
        assertEquals(150.00, otherAccessory.getPrice(), 0.0);
    }

    @Test
    public void canGetItemCategory(){
        assertEquals(OtherCategory.STUDIO_EQUIPMENT, otherAccessory.getType());
    }

    @Test
    public void canSetItemCategory(){
        otherAccessory.setType(OtherCategory.STAGE_EQUIPMENT);
        assertEquals(OtherCategory.STAGE_EQUIPMENT, otherAccessory.getType());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(1, otherAccessory.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        otherAccessory.setDeliveryFactor(0);
        assertEquals(0, otherAccessory.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(0, otherAccessory.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        otherAccessory.setSetupFactor(3);
        assertEquals(3, otherAccessory.getSetupFactor());
    }

    @Test
    public void canGetInsuranceFactor(){
        assertEquals(6, otherAccessory.getInsuranceFactor());
    }
}
