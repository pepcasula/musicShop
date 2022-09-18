package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseTest {

    Case1 case1;

    @Before
    public void before(){
        case1 = new Case1(
                "Bass Guitar Bag KPEB99",
                "Kinsman",
                42.90,
                54.90,
                CaseType.GUITAR_BAG,
                "Brown"
        );
    }

    @Test
    public void canGetMarkup(){
        assertEquals(12.00, case1.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetDescription(){
        assertEquals("Bass Guitar Bag KPEB99", case1.getDescription());
    }

    @Test
    public void canSetDescription(){
        case1.setDescription("Electric Guitar Gigbag Ultimate Series");
        assertEquals("Electric Guitar Gigbag Ultimate Series", case1.getDescription());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Kinsman", case1.getBrand());
    }

    @Test
    public void canSetBrand(){
        case1.setBrand("Gator");
        assertEquals("Gator", case1.getBrand());
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(42.90, case1.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        case1.setWholesalePrice(35.90);
        assertEquals(35.90, case1.getWholesalePrice(), 0.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(54.90, case1.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        case1.setPrice(46.90);
        assertEquals(46.90, case1.getPrice(), 0.0);
    }

    @Test
    public void canGetCaseType(){
        assertEquals(CaseType.GUITAR_BAG, case1.getCaseType());
    }

    @Test
    public void canSetCaseType(){
        case1.setCaseType(CaseType.STRING_CASE);
        assertEquals(CaseType.STRING_CASE, case1.getCaseType());
    }

    @Test
    public void canGetColour(){
        assertEquals("Brown", case1.getColour());
    }

    @Test
    public void canSetColour(){
        case1.setColour("Bronze");
        assertEquals("Bronze", case1.getColour());
    }
}
