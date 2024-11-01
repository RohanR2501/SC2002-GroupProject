public class Medication {
    private String medicationID;
    private String name;
    private int stock;
    private int lowStockAlert;

    public void updateStock(int newStock) {
        this.stock = newStock;
    }

    public void updateLowStockAlert(int newAlert) {
        this.lowStockAlert = newAlert;
    }
}
