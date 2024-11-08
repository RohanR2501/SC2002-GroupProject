public class Pharmacist extends User {
    private String pharmacistID;
    private String name;

    public Pharmacist(String userID, String password, String pharmacistID, String name) {
        super(userID, password, "Pharmacist");
        this.pharmacistID = pharmacistID;
        this.name = name;
    }

    public Appointment viewAppointmentOutcomeRecord(String appointmentID) {
        // Logic to view appointment outcome for a specific appointment
        return new Appointment();
    }

    public void updatePrescriptionStatus(String prescriptionID, String status) {
        // Logic to update prescription status
    }

    public void submitReplenishmentRequest(String medicationID, int quantity) {
        // Logic to submit a replenishment request
    }

    @Override
    public void manageAppointments() {
        // No operation; pharmacists do not manage appointments
    }

    @Override
    public void updateMedicalRecords() {
        // No operation; pharmacists do not update medical records
    }
}
