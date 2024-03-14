package model;

/**
 * The Product class represents a product in the inventory management system.
 * It extends the Item class with additional product-specific attributes.
 */
public class Product extends Item {
    private String description;
    private double price;
    private int quantity;
    private char status;
    private int supplierId;

    /**
     * Constructor for the Product class.
     *
     * @param id          The unique identifier for the product.
     * @param name        The name of the product.
     * @param description A brief description of the product.
     * @param price       The price of the product.
     * @param quantity    The quantity of the product in stock.
     * @param status      The status of the product (e.g., A, B, C).
     * @param supplierId  The ID of the supplier for this product.
     */
    public Product(int id, String name, String description, double price, int quantity, char status, int supplierId) {
        super(id, name); // Call the constructor of the superclass (Item)
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.status = status;
        this.supplierId = supplierId;
    }

    /**
     * Gets the product's description.
     *
     * @return A string representing the product's description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product's description.
     *
     * @param description A string containing the new description of the product.
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Gets the ID of the supplier for this product.
     *
     * @return An integer representing the supplier's ID.
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the ID of the supplier for this product.
     *
     * @param supplierId An integer containing the new supplier's ID for this product.
     */
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * Returns a string representation of the Product object, which includes all the details of the product.
     *
     * @return A string representation of the Product object.
     */
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", status=" + status +
                ", supplierId=" + supplierId +
                '}';
    }
}
