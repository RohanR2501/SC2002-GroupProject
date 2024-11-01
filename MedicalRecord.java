import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private String recordID;
    private String patientID;
    private List<String> diagnoses = new ArrayList<>();
    private List<String> treatments = new ArrayList<>();
    private List<Prescription> prescriptions = new ArrayList<>();

    public void addDiagnosis(String diagnosis) {
        diagnoses.add(diagnosis);
    }

    public void addTreatment(String treatment) {
        treatments.add(treatment);
    }

    public void addPrescription(Prescription prescription) {
        prescriptions.add(prescription);
    }
}
