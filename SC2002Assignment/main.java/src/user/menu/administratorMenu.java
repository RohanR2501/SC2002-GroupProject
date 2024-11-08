package user.menu;
import java.util.Scanner;


public class administratorMenu {

   public void AdministratorDisplayMenu(){

    Scanner scanner = new Scanner(System.in);

    System.out.println("1. View and Manage Hospital Staff");
    System.out.println("2. View Appointments details");
    System.out.println("3. View and Manage Medication Inventory ");
    System.out.println("4. Approve Replenishment Requests ");
    System.out.println("5. Logout");
    
    int choice = scanner.nextInt();
   }
}
