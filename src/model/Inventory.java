package model;

/**
 * The Inventory class represents an inventory item in the inventory management system.
 * It extends the Item class with additional inventory-specific attributes.
 */
public class Inventory extends Item {
    private int quantity;
    private double price;
    private char status;
    private String supplierName;

    /**
     * Constructor for the Inventory class.
     *
     * @param id           The unique identifier for the inventory item.
     * @param name         The name of the product in the inventory.
     * @param quantity     The quantity of the product in stock.
     * @param price        The price of the product.
     * @param status       The status of the product (e.g., A, B, C).
     * @param supplierName The name of the supplier for this product.
     */
    public Inventory(int id, String name, int quantity, double price, char status, String supplierName) {
        super(id, name); // Call the constructor of the superclass (Item)
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.supplierName = supplierName;
    }

    /**
     * Gets the quantity of the product in stock.
     *
     * @return An integer representing the quantity of the product.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity of the product in stock.
     *
     * @param quantity An integer containing the new quantity of the product.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the product's price.
     *
     * @return A double representing the product's price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the product's price.
     *
     * @param price A double containing the new price of the product.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets the product's status.
     *
     * @return A character representing the product's status.
     */
    public char getStatus() {
        return status;
    }

    /**
     * Sets the product's status.
     *
     * @param status A character representing the new status of the product.
     */
    public void setStatus(char status) {
        this.status = status;
    }

    /**
     * Gets the supplier's name for this product.
     *
     * @return A string representing the supplier's name.
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the supplier's name for this product.
     *
     * @param supplierName A string containing the new supplier's name for this product.
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * Returns a string representation of the Inventory object, which includes all the details of the inventory item.
     *
     * @return A string representation of the Inventory object.
     */
    @Override
    public String toString() {
        return "Inventory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", status=" + status +
                ", supplierName='" + supplierName + '\'' +
                '}';
    }
}