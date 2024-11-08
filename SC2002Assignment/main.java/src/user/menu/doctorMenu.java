package user.menu;
import java.util.Scanner;
import MedicalRecord.MedicalRecord;
import user.patient;
import user.staff;
import user.userIN.patientIN;


public class doctorMenu {
   private MedicalRecord medicalRecord;
   private staff doctor;
   public doctorMenu(staff doctor) {
      this.doctor = doctor;
   }
   private patientIN patientLoader;
   public doctorMenu(staff doctor, patientIN patientLoader) {
      this.doctor = doctor;
      this.patientLoader = patientLoader;  // Initialize patientLoader
  }

   public void DoctorDisplayMenu(){

    Scanner scanner = new Scanner(System.in);
    int choice;
 
    do{
    System.out.println("1. View Patient Medical Record");
    System.out.println("2. Update Patient Medical Records");
    System.out.println("3. View Personal Schedule");
    System.out.println("4. Set Availability for Appointments");
    System.out.println("5. Accept or Decline Appointment Requests ");
    System.out.println("6. View Upcoming Appointments ");
    System.out.println("7. Record Appointment Outcome");
    System.out.println("8. Logout ");
    

    choice = scanner.nextInt();
    scanner.nextLine();

    switch (choice) {
      case 1:
        System.out.println("Enter the Patient ID of the patient you want to view:");
        String id = scanner.nextLine();
        scanner.nextLine();
         boolean found = false;
         for (patient p : patientLoader.getPatientList()) {
            if (p.getPatientID().equals(id)) {
                MedicalRecord medicalRecord = new MedicalRecord(p); // 创建该患者的 MedicalRecord
                medicalRecord.viewMedicalRecord(); // 显示患者的病历
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No record found for Patient ID: " + id);
        }
             break;
      case 2:
      System.out.println("Enter the Patient ID of the patient you want to view:");
        String id2 = scanner.nextLine();
        scanner.nextLine();
         boolean found2 = false;
         for (patient p : patientLoader.getPatientList()) {
            if (p.getPatientID().equals(id2)) {
                MedicalRecord medicalRecord = new MedicalRecord(p); // 创建该患者的 MedicalRecord
                medicalRecord.updateMedicalRecord(); // 显示患者的病历
                found = true;
                break;
            }
        }

        if (!found2) {
            System.out.println("No record found for Patient ID: " + id2);
        }
        
      
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
   } while (choice != 9); 

}
}