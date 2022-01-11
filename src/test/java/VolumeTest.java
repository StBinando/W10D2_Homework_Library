import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VolumeTest {
    private Volume volume;

    @Before
    public void before() {
        volume = new Volume("1984", "George Orwell", "Science Fiction");
    }

    @Test
    public void bookHasAttributes(){
        assertEquals("1984", volume.getTitle());
        assertEquals("George Orwell", volume.getAuthor());
        assertEquals("Science Fiction", volume.getGenre());
    }




}