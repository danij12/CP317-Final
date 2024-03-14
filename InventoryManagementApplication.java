import controller.DataManager;

public class InventoryManagementApplication {

    public static void main(String[] args) {
        DataManager dataManager = new DataManager();

        try {
            // Load suppliers and products from the data files
            System.out.println("Loading suppliers...");
            dataManager.loadSuppliers("SupplierFile.txt");
            System.out.println("Loading products...");
            dataManager.loadProducts("ProductFile.txt");

            // Generate the inventory based on loaded data
            System.out.println("Generating inventory...");
            dataManager.generateInventory();

            // Write the inventory to an output file
            String inventoryOutputFilename = "inventory_output.txt";
            System.out.println("Writing inventory to " + inventoryOutputFilename + "...");
            dataManager.writeInventory(inventoryOutputFilename);

            System.out.println("Inventory management process completed successfully.");
        } catch (Exception e) {
            System.err.println("An error occurred during the inventory management process: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

