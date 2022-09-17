package sheet_music_and_books;

public class Book extends SheetMusicAndBooks {

    String author;
    BookGenre genre;

    public Book(String author, String title, BookGenre genre, String publisher, int pages, double wholesalePrice, double price) {
        super(title, publisher, pages, wholesalePrice, price);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookGenre getGenre() {
        return this.genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }
}
