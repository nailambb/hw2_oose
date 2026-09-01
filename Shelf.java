import java.util.LinkedHashSet;
import java.util.Set;

/* LinkedHashSet behaves like a shelf where there cannot be 
   duplicates (can't have on item on shelf exist multiple times 
   (unless you own duplicates), and the order you put items on a 
   shelf are preserved. 
*/
public class Shelf {
    private Set<Item> items;

    public Shelf() {
        items = new LinkedHashSet<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
