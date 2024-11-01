import java.util.ArrayList;

public class Patient extends User {
    private String patientID;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String contactInfo;
    private String bloodType;
    private MedicalRecord medicalRecord;

    public Patient(String userID, String password, String patientID, String name, String dateOfBirth, String gender, String contactInfo, String bloodType) {
        super(userID, password, "Patient");
        this.patientID = patientID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.bloodType = bloodType;
        this.medicalRecord = new MedicalRecord(patientID);
    }

    public MedicalRecord viewMedicalRecord() {
        return medicalRecord;
    }

    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    public void scheduleAppointment(Appointment appointment) {
        // Logic to schedule an appointment
    }

    public List<Appointment> viewAvailableAppointmentSlots() {
        // Logic to return a list of available appointments
        return new ArrayList<>();
    }

    @Override
    public void manageAppointments() {
        // Patient-specific appointment management logic
    }

    @Override
    public void updateMedicalRecords() {
        // No operation; patients don’t update medical records
    }
}
