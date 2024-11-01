public class Administrator extends User {
    private String adminID;
    private String name;

    public Administrator(String userID, String password, String adminID, String name) {
        super(userID, password, "Administrator");
        this.adminID = adminID;
        this.name = name;
    }

    public void manageStaff(User staff) {
        // Logic to manage hospital staff
    }

    public void manageInventory(Medication medication) {
        // Logic to manage medication inventory
    }

    public void approveReplenishmentRequest(String requestID) {
        // Logic to approve replenishment requests
    }

    @Override
    public void manageAppointments() {
        // Administrator-specific appointment management logic
    }

    @Override
    public void updateMedicalRecords() {
        // No operation; administrators do not update medical records
    }
}

