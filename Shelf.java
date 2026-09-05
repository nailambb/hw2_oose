import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Represents a shelf that stores a collection of items (such as DVDs or Books).
 *
 * A LinkedHashSet was used so that the items will remain in the order
 * they were added and duplicate Item objects are not allowed. 
 * The order of the items is important for the display of the shelf.
 */
public class Shelf {
    private Set<Item> items;

    /**
     * Empty shelf construtor.
     */
    public Shelf() {
        items = new LinkedHashSet<>();
    }

    /**
     * Adds an item to the shelf, by UML design a book or 
     * DVD object can be added to the shelf.
     *
     * @param item the item to add to the shelf
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Removes an item from the shelf.
     *
     * @param item the item to remove from the shelf, usually a 
     * book or DVD object
     */
    public void removeItem(Item item) {
        items.remove(item);
    }
}
