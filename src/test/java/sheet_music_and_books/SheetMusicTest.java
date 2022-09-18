package sheet_music_and_books;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(
                "The Jazz Sax Collection",
                "For saxophone and piano, arranged by Ned Bennett",
                MusicGenre.JAZZ,
                "Faber Music",
                27,
                9.50,
                13.00,
                1,
                0
        );
    }

    @Test
    public void canGetMarkup(){
        assertEquals(3.50, sheetMusic.calculateMarkup(), 0.0);
    }

    @Test
    public void canGetWholesalePrice(){
        assertEquals(9.50, sheetMusic.getWholesalePrice(), 0.0);
    }

    @Test
    public void canSetWholesalePrice(){
        sheetMusic.setWholesalePrice(9.90);
        assertEquals(9.90, sheetMusic.getWholesalePrice(), 0.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(13.00, sheetMusic.getPrice(), 0.0);
    }

    @Test
    public void canSetPrice(){
        sheetMusic.setPrice(14.90);
        assertEquals(14.90, sheetMusic.getPrice(), 0.0);
    }

    @Test
    public void canGetTitle(){
        assertEquals("The Jazz Sax Collection", sheetMusic.getTitle());
    }

    @Test
    public void canSetTitle(){
        sheetMusic.setTitle("25 Top Rock Bass songs");
        assertEquals("25 Top Rock Bass songs", sheetMusic.getTitle());
    }

    @Test
    public void canGetDescription(){
        assertEquals("For saxophone and piano, arranged by Ned Bennett", sheetMusic.getDescription());
    }

    @Test
    public void canSetDescription(){
        sheetMusic.setDescription("For baritone saxophone, arranged by Anonymous");
        assertEquals("For baritone saxophone, arranged by Anonymous", sheetMusic.getDescription());
    }

    @Test
    public void canGetGenre(){
        assertEquals(MusicGenre.JAZZ, sheetMusic.getGenre());
    }

    @Test
    public void canSetGenre(){
        sheetMusic.setGenre(MusicGenre.OPERA);
        assertEquals(MusicGenre.OPERA, sheetMusic.getGenre());
    }



    @Test
    public void canGetPublisher(){
        assertEquals("Faber Music", sheetMusic.getPublisher());
    }

    @Test
    public void canSetPublisher(){
        sheetMusic.setPublisher("Hal Leonard");
        assertEquals("Hal Leonard", sheetMusic.getPublisher());
    }

    @Test
    public void canGetPages(){
        assertEquals(27, sheetMusic.getPages());
    }

    @Test
    public void canSetPages(){
        sheetMusic.setPages(32);
        assertEquals(32, sheetMusic.getPages());
    }

    @Test
    public void canGetDeliveryFactor(){
        assertEquals(1, sheetMusic.getDeliveryFactor());
    }

    @Test
    public void canSetDeliveryFactor(){
        sheetMusic.setDeliveryFactor(3);
        assertEquals(3, sheetMusic.getDeliveryFactor());
    }

    @Test
    public void canGetSetupFactor(){
        assertEquals(0, sheetMusic.getSetupFactor());
    }

    @Test
    public void canSetSetupFactor(){
        sheetMusic.setSetupFactor(1);
        assertEquals(1, sheetMusic.getSetupFactor());
    }

    @Test
    public void hasZeroInsuranceFactor(){
        sheetMusic.setPrice(20000.00);
        assertEquals(0, sheetMusic.getInsuranceFactor());
    }
}
