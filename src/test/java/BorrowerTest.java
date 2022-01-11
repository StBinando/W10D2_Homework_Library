import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BorrowerTest {
    private Borrower borrower;
    private Volume volume;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        volume = new Volume("1984", "George Orwell", "Science Fiction");
        library = new Library(1);
    }

    @Test
    public void getSizeOfCollection(){
        assertEquals(0, borrower.getCount());
    }

    @Test
    public void addBookToCollection(){
        borrower.addBook(volume);
        assertEquals(1, borrower.getCount());
    }

    @Test
    public void borrowBook(){
        library.addBook(volume);
        assertEquals(1, library.getCount());

        borrower.borrowBook(library);
        assertEquals(1, borrower.getCount());
        assertEquals(0, library.getCount());


    }

}
