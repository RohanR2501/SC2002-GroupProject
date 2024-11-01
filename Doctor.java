public class Doctor extends User {
    private String doctorID;
    private String name;
    private String specialization;
    private List<Appointment> schedule;

    public Doctor(String userID, String password, String doctorID, String name, String specialization) {
        super(userID, password, "Doctor");
        this.doctorID = doctorID;
        this.name = name;
        this.specialization = specialization;
    }

    public MedicalRecord viewPatientMedicalRecords(String patientID) {
        // Logic to retrieve and view patient's medical records
        return new MedicalRecord(patientID);
    }

    public void updatePatientMedicalRecord(String patientID, MedicalRecord record) {
        // Logic to update a patient's medical record
    }

    public void setAvailability(List<TimeSlot> availability) {
        // Logic to set availability for appointments
    }

    public void recordAppointmentOutcome(String appointmentID, String outcome) {
        // Logic to record appointment outcome
    }

    @Override
    public void manageAppointments() {
        // Doctor-specific appointment management logic
    }

    @Override
    public void updateMedicalRecords() {
        // Doctor-specific logic to update medical records
    }
}
