public abstract class User {
    private String userID;
    private String password;
    private String role;

    public User(String userID, String password, String role) {
        this.userID = userID;
        this.password = password;
        this.role = role;
    }

    public boolean login(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    // Abstract methods to support extensibility
    public abstract void manageAppointments();
    public abstract void updateMedicalRecords();

    // Getter and Setter for userID
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
//bonjour