public class Prescription {
    private String prescriptionID;
    private String medicationName;
    private String status;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}
