package sheet_music_and_books;

public class SheetMusic extends SheetMusicAndBooks {

    String description;
    MusicGenre musicGenre;

    public SheetMusic(
            String title,
            String description,
            MusicGenre musicGenre,
            String publisher,
            int pages,
            double wholesalePrice,
            double price,
            int deliveryFactor,
            int setupFactor
    ) {
        super(
                title,
                publisher,
                pages,
                wholesalePrice,
                price,
                deliveryFactor,
                setupFactor
        );
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
