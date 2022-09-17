package sheet_music_and_books;

public class SheetMusic extends SheetMusicAndBooks {

    String description;
    MusicGenre musicGenre;

    public SheetMusic(String title, String description, MusicGenre musicGenre, String publisher, int pages, double wholesalePrice, double price) {
        super(title, publisher, pages, wholesalePrice, price);
        this.description = description;
        this.musicGenre = musicGenre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MusicGenre getGenre() {
        return musicGenre;
    }

    public void setGenre(MusicGenre genre) {
        this.musicGenre = genre;
    }
}
