package realestateapp;

/**
 *
 * @author ouran
 */
// Κλάση LoggedUserInfo - Διαχειρίζεται τις πληροφορίες του συνδεδεμένου χρήστη
public class LoggedUserInfo {
    // Μεταβλητές πεδία της κλάσης
    private static String loggedUser;// Αποθηκεύει το ID του συνδεδεμένου χρήστη
    private static String loggedUsername;// Αποθηκεύει το username του συνδεδεμένου χρήστη
    private static boolean isLoggedUserAdmin;// Ελέγχει αν ο συνδεδεμένος χρήστης είναι admin

    // Ιδιωτικός constructor για να αποτρέψει τη δημιουργία αντικειμένων της κλάσης
    private LoggedUserInfo() {}

    // Μέθοδος που επιστρέφει το ID του συνδεδεμένου χρήστη
    public static String getLoggedUserID() {
        return loggedUser;
    }
    // Μέθοδος που επιστρέφει το username του συνδεδεμένου χρήστη
    public static String getLoggedUsername() {
        return loggedUsername;
    }
    // Μέθοδος που επιστρέφει αν ο χρήστης είναι διαχειριστής (admin)
    public static boolean isLoggedUserAdmin() { //Διορθωμένο όνομα μεθόδου
        return isLoggedUserAdmin;
    }

    // Μέθοδος που ορίζει τις πληροφορίες του συνδεδεμένου χρήστη
    public static void setLoggedUserInfo(String userID, String username, boolean isAdmin) {
        loggedUser = userID;
        loggedUsername = username;
        isLoggedUserAdmin = isAdmin;
    }
    // Μέθοδος που διαγράφει τις πληροφορίες του συνδεδεμένου χρήστη (π.χ. κατά την αποσύνδεση)
    public static void clearLoggedUserInfo() {
        loggedUser = null;
        loggedUsername = null;
        isLoggedUserAdmin = false;
    }
}

