import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;
    private Volume volume;

    @Before
    public void before() {
        library = new Library(3);
        volume = new Volume("1984", "George Orwell", "Science Fiction");
    }

    @Test
    public void getNumberOfBooks(){
        assertEquals(0, library.getCount());
    }

    @Test
    public void addBookToStock(){
        library.addBook(volume);
        assertEquals(1, library.getCount());
        library.addBook(volume);
        assertEquals(2, library.getCount());
    }

    @Test
    public void removeBookFromStock(){
        library.addBook(volume);
        assertEquals(1, library.getCount());
        library.removeBook();
        assertEquals(0, library.getCount());
    }

    @Test
    public void adds1toGenreWhenAddingABook(){
        library.addBook(volume);
//        library.addBook(volume);

        assertEquals(1, library.getTotByGenre(volume.getGenre()));

        library.addBook(volume);
        assertEquals(2, library.getTotByGenre(volume.getGenre()));
    }
}
