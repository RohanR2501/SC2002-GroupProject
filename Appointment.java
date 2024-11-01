import java.util.Date;

public class Appointment {
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private Date date;
    private String time;
    private String status;
    private String outcome;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void updateOutcome(String newOutcome) {
        this.outcome = newOutcome;
    }
}
