package controller;

import model.Supplier;
import model.Product;
import model.Inventory;
import model.Item;
import utils.FileHandler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DataManager to process data from text files into objects and vice versa.
 */
public class DataManager {

    private final FileHandler fileHandler;
    private final List<Supplier> suppliers;
    private final List<Product> products;
    private final List<Inventory> inventory;

    public DataManager() {
        // Provide the absolute path to the data directory
        String basePath = "C:\\Users\\danie\\Documents\\CP317 Final\\data";
        this.fileHandler = new FileHandler(basePath);
        this.suppliers = new ArrayList<>();
        this.products = new ArrayList<>();
        this.inventory = new ArrayList<>();
    }

    /**
     * Loads suppliers from the supplier file.
     *
     * @param filename The name of the supplier file.
     * @throws IOException If an I/O error occurs.
     */
    public void loadSuppliers(String filename) throws IOException {
        List<String> lines = fileHandler.readFile(filename);
        for (String line : lines) {
            String[] parts = line.split(", ");
            if (parts.length >= 5) {
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                String address = parts[2].trim();
                String phone = parts[3].trim();
                String email = parts[4].trim();
                suppliers.add(new Supplier(id, name, address, phone, email));
            }
        }
    }

    /**
     * Loads products from the product file.
     *
     * @param filename The name of the product file.
     * @throws IOException If an I/O error occurs.
     */
    public void loadProducts(String filename) throws IOException {
        List<String> lines = fileHandler.readFile(filename);
        for (String line : lines) {
            String[] parts = line.split(", ");
            if (parts.length >= 7) {
                int id = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                String description = parts[2].trim();
                double price = Double.parseDouble(parts[3].trim().substring(1)); // Assumes the price is prefixed with a currency symbol
                int quantity = Integer.parseInt(parts[4].trim());
                char status = parts[5].trim().charAt(0);
                int supplierId = Integer.parseInt(parts[6].trim());
                products.add(new Product(id, name, description, price, quantity, status, supplierId));
            }
        }
    }

    /**
     * Generates an inventory based on the products and suppliers loaded.
     */
    public void generateInventory() {
        Map<Integer, String> supplierNames = new HashMap<>();
        for (Supplier supplier : suppliers) {
            supplierNames.put(supplier.getId(), supplier.getName());
        }

        for (Product product : products) {
            String supplierName = supplierNames.getOrDefault(product.getSupplierId(), "Unknown");
            inventory.add(new Inventory(product.getId(), product.getName(), product.getQuantity(), product.getPrice(), product.getStatus(), supplierName));
        }
    }

    /**
     * Writes the inventory to a file.
     *
     * @param filename The name of the inventory output file.
     * @throws IOException If an I/O error occurs.
     */
    public void writeInventory(String filename) throws IOException {
        // Sort inventory by product ID
        inventory.sort(Comparator.comparingInt(Item::getId));

        // Add a header line
        String header = String.format("%-10s %-20s %-10s %-10s %-8s %-20s", "ID", "Name", "Quantity", "Price", "Status", "Supplier");
        List<String> lines = new ArrayList<>();
        lines.add(header);

        // Formatting each line to align columns
        for (Inventory item : inventory) {
            String line = String.format("%-10d %-20s %-10d %-10s %-8c %-20s",
                    item.getId(), 
                    item.getName(), 
                    item.getQuantity(), 
                    "$" + String.format("%.2f", item.getPrice()), 
                    item.getStatus(), 
                    item.getSupplierName());
            lines.add(line);
        }

        fileHandler.writeFile(filename, lines);
    }

}

