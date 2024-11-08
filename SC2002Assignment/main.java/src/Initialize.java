
import java.util.Scanner;

import user.patient;
import user.staff;
import user.user;
import user.userIN.patientIN;
import user.userIN.staffIN;
import user.menu.administratorMenu;
import user.menu.doctorMenu;
import user.menu.patientMenu;
import user.menu.pharmacistMenu;



public class Initialize {
 
    private boolean isInitialized = false;
    private boolean Running = false;

   
    private patientIN patientLoader = new patientIN();
    private staffIN staffLoader = new staffIN();
    private user userSystem;
    private pharmacistMenu pharmacistMenu;
    private patientMenu patientMenu;
    private doctorMenu doctorMenu;
    private administratorMenu administratorMenu;
    
  public void initialize(){
    if (isInitialized) return;

    //add initialization code
    staffLoader.loadStaffList();
    System.out.println(staffLoader.getStaffList());
    patientLoader.loadPatientList();
    System.out.println(patientLoader.getPatientList());

    userSystem = new user(patientLoader.getPatientList(), staffLoader.getStaffList());
    pharmacistMenu = new pharmacistMenu();
    administratorMenu = new administratorMenu();

    isInitialized = true;
  }  
  
public void run() {
    if (!isInitialized){
        throw new IllegalStateException("HMS not initialized");
    }

    if (Running) return;

    Running = true;
    while (Running) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Please log in: ");
        System.out.println("Please enter your ID:");
        String userId = scanner.nextLine();
        
        System.out.println("Please enter your password:");
        String password = scanner.nextLine();
     
        if(userSystem.login(userId,password)){
            String userType = userSystem.getUserTypeMap().get(userId);
                
            switch (userType) {
                case "patient":
                   System.out.println("Opening Patient Menu...");
                   patient patientInstance = userSystem.getPatientById(userId);  // 获取对应的 patient 实例
                    patientMenu = new patientMenu(patientInstance);
                   patientMenu.PatientDisplayMenu();
                    break;
                case "staff":
                    // Logic to open specific staff menus based on user ID prefix
                    if (userId.startsWith("D")) {
                        System.out.println("Opening Doctor Menu...");
                        staff doctorInstance = userSystem.getStaffById(userId);
                        doctorMenu = new doctorMenu(doctorInstance,patientLoader);
                        doctorMenu.DoctorDisplayMenu();
                    } else if (userId.startsWith("P")) {
                        System.out.println("Opening Pharmacist Menu...");
                        pharmacistMenu.PharmacistDisplayMenu();
                    } else if (userId.startsWith("A")) {
                        System.out.println("Opening Administrator Menu...");
                        administratorMenu.AdministratorDisplayMenu();
                    } else {
                        System.out.println("Unknown staff type. Unable to open menu.");
                    }
                    break;
                default:
                    System.out.println("Unknown user type. Unable to open menu.");
                }          
    }else {
        System.out.println("Login failed. Please try again.");
    }
}
}

        }
        
  


