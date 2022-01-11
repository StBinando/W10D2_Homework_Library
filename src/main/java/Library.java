//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private int capacity;
    private ArrayList<Volume> stock;
    private HashMap<String, Integer> totByGenre;

    public Library(int capacity) {
        this.capacity = capacity;
        this.stock = new ArrayList<Volume>();
        this.totByGenre = new HashMap<String, Integer>();
    }

    public int getCount() {
        return stock.size();
    }

    public void addBook(Volume volume) {
        if (getCount()<capacity) {
            stock.add(volume);
            if(totByGenre.containsKey(volume.getGenre())){
                totByGenre.put(volume.getGenre(),(totByGenre.get(volume.getGenre())+1));
            }
            else {
            totByGenre.put(volume.getGenre(),1);

            }
        }
    }

    public Volume removeBook() {
        if(getCount()>0) {
            totByGenre.put(volume.getGenre(),(totByGenre.get(volume.getGenre())+1));
            return stock.remove(0);


        }
        return null;
    }

    public int getTotByGenre(String genre) {
        return totByGenre.get(genre);
    }
}
