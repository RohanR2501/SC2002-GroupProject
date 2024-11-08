package user.menu;
import java.util.Scanner;

import MedicalRecord.MedicalRecord;
import user.patient;


public class patientMenu {
    private patient patient;
    private MedicalRecord medicalRecord;

    public patient getPatient() {
        return patient;
    }

    public patientMenu(user.patient patient) {
        this.patient = patient;
        this.medicalRecord = new MedicalRecord(patient);
    }

public void PatientDisplayMenu(){

    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
    System.out.println("1. View Medical Record");
    System.out.println("2. Update Personal Information");
    System.out.println("3. View Available Appointment Slots");
    System.out.println("4. Schedule an Appointment");
    System.out.println("5. Reschedule an Appointment");
    System.out.println("6. Cancel an Appointment");
    System.out.println("7. View Scheduled Appointments");
    System.out.println("8. View Past Appointment Outcome Records");
    System.out.println("9. Logout");

    choice = scanner.nextInt();
    scanner.nextLine(); 

    switch (choice) {
        case 1:
           medicalRecord.viewMedicalRecord();
          break;
        case 2:
        System.out.print("Enter new contact information: ");
        String newContactInfo = scanner.nextLine();
        patient.updateContactInfo(newContactInfo);
          
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          break;
        case 6:
          break;
        case 7:
          break;
        case 8:
          break;
        case 9:
          System.out.println("Logging out...");
          break; 
        default:
          System.out.println("Invalid choice. Please try again.");  

    }


   }while(choice !=9);


}
}

