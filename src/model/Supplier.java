package model;

/**
 * The Supplier class represents a supplier in the inventory management system.
 * It extends the Item class with additional supplier-specific attributes.
 */
public class Supplier extends Item {
    private String address;
    private String phone;
    private String email;

    /**
     * Constructor for the Supplier class.
     *
     * @param id      The unique identifier for the supplier.
     * @param name    The name of the supplier.
     * @param address The address of the supplier.
     * @param phone   The phone number of the supplier.
     * @param email   The email address of the supplier.
     */
    public Supplier(int id, String name, String address, String phone, String email) {
        super(id, name); // Call the constructor of the superclass (Item)
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Gets the supplier's address.
     *
     * @return A string representing the supplier's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the supplier's address.
     *
     * @param address A string containing the new address of the supplier.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the supplier's phone number.
     *
     * @return A string representing the supplier's phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the supplier's phone number.
     *
     * @param phone A string containing the new phone number of the supplier.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the supplier's email address.
     *
     * @return A string representing the supplier's email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the supplier's email address.
     *
     * @param email A string containing the new email address of the supplier.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string representation of the Supplier object, which includes all the details of the supplier.
     *
     * @return A string representation of the Supplier object.
     */
    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
