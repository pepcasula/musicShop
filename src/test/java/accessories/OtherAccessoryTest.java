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
                ItemCategory.STUDIO_EQUIPMENT
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
        assertEquals(ItemCategory.STUDIO_EQUIPMENT, otherAccessory.getItemCategory());
    }

    @Test
    public void canSetItemCategory(){
        otherAccessory.setItemCategory(ItemCategory.STAGE_EQUIPMENT);
        assertEquals(ItemCategory.STAGE_EQUIPMENT, otherAccessory.getItemCategory());
    }
}
