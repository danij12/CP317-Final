package model;

/**
 * Abstract class Item to be used as a base for item-related entities.
 * Also Think of it as a componet
 */
public abstract class Item {
    // Common attributes for all items
    protected int id;
    protected String name;

    /**
     * Constructor for the Item class.
     *
     * @param id   The unique identifier for the item.
     * @param name The name of the item.
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the item's ID.
     *
     * @return An integer representing the item's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the item's ID.
     *
     * @param id An integer containing the new ID of the item.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the item's name.
     *
     * @return A string representing the item's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the item's name.
     *
     * @param name A string containing the new name of the item.
     */
    public void setName(String name) {
        this.name = name;
    }
}
