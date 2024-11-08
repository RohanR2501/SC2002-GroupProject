import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private String inventoryID;
    private List<Medication> medications = new ArrayList<>();

    public void addMedication(Medication medication) {
        medications.add(medication);
    }

    public void removeMedication(String medicationID) {
        // Logic to remove medication by ID
    }

    public void updateMedicationStock(String medicationID, int newStock) {
        // Logic to update medication stock
    }
}
