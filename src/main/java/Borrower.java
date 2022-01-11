import java.util.ArrayList;

public class Borrower {
    private ArrayList<Volume> collection;

    public Borrower() {
        this.collection = new ArrayList<Volume>();
    }

    public int getCount() {
        return collection.size();
    }

    public void addBook(Volume volume) {
        collection.add(volume);
    }

    public void borrowBook(Library library) {
        collection.add(library.removeBook());
    }
}