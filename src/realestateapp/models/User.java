package realestateapp.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

// Κλάση User - Αντιπροσωπεύει έναν χρήστη στην εφαρμογή
public class User {
    // Μεταβλητές πεδία της κλάσης
    private String firstName;// Όνομα χρήστη
    private String lastName;// Επώνυμο χρήστη
    private String username;// Όνομα χρήστη (username)
    private double initialPrice;// Αρχική τιμή ενός ακινήτου που σχετίζεται με τον χρήστη
    private double finalPrice;// Τελική τιμή του ακινήτου (με ΦΠΑ)
    private String imagePath;// Διαδρομή αρχείου εικόνας του ακινήτου
    private ImageIcon imageIcon; // Αντικείμενο εικόνας του ακινήτου
    private boolean isAdmin; // Boolean μεταβλητή που δείχνει αν ο χρήστης είναι admin
    private List<Property> properties = new ArrayList<>();// Λίστα με τα ακίνητα που ανήκουν στον χρήστη
    private List<Property> assignedProperties = new ArrayList<>();// Λίστα με ακίνητα που έχουν ανατεθεί στον χρήστη
    private String email;// Email του χρήστη
    private String accessCode;// Κωδικός πρόσβασης (UUID) για τον χρήστη
    // Constructor της κλάσης User
    public User(String firstName, String lastName, String username, double initialPrice, double finalPrice, String imagePath, ImageIcon imageIcon, boolean isAdmin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.initialPrice = initialPrice;
        this.finalPrice = finalPrice;
        this.imagePath = imagePath;
        this.imageIcon = imageIcon;
        this.isAdmin = isAdmin;
    }
    // Μέθοδοι ανάκτησης δεδομένων (Getters)
    public String getUsername() {
        return username;// Επιστρέφει το username του χρήστη
    }

    public double getInitialPrice() {
        return initialPrice;// Επιστρέφει την αρχική τιμή του ακινήτου
    }

    public double getFinalPrice() {
        return finalPrice;// Επιστρέφει την τελική τιμή του ακινήτου (με ΦΠΑ)
    }

    public String getImagePath() {
        return imagePath;// Επιστρέφει τη διαδρομή εικόνας του ακινήτου
    }
    
    public String getEmail() {
        return this.email;// Επιστρέφει το email του χρήστη
    }
    
    public String getAccessCode() {
        return this.accessCode; // Επιστρέφει τον κωδικό πρόσβασης του χρήστη
    }
    // Μέθοδοι ενημέρωσης δεδομένων (Setters)
    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;// Ορισμός νέας αρχικής τιμής του ακινήτου
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;// Ορισμός νέας τελικής τιμής του ακινήτου
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;// Ορισμός νέας διαδρομής εικόνας
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;// Ορισμός νέας εικόνας για το ακίνητο
    }

    public ImageIcon getImageIcon() {
        return this.imageIcon;// Επιστρέφει το αντικείμενο εικόνας του ακινήτου
    }
    // Μέθοδος που επιστρέφει αν ο χρήστης είναι διαχειριστής
    public boolean isAdmin() { 
        return isAdmin;
    }
    // Μέθοδος που ορίζει αν ο χρήστης είναι διαχειριστής ή όχι
    public void setAdmin(boolean isAdmin) { // ✅ Επιτρέπει αλλαγή admin κατάστασης
        this.isAdmin = isAdmin;
    }
    // Μέθοδος προσθήκης ακινήτου στη λίστα των ακινήτων του χρήστη
    public void addProperty(Property property) {
        properties.add(property);
    }
    // Μέθοδος επιστροφής της λίστας με τα ακίνητα του χρήστη
    public List<Property> getProperties() {
        return properties;
    }
    // Μέθοδος επιστροφής της λίστας με τα ακίνητα που έχουν ανατεθεί στον χρήστη
    public List<Property> getAssignedProperties() {
        return assignedProperties;
    }
    // Μέθοδος που αναθέτει ένα ακίνητο στον χρήστη
    public void assignProperty(Property property) {
        assignedProperties.add(property);
    }
    // Μέθοδος που επιστρέφει μια συμβολοσειρά με τις πληροφορίες του χρήστη
    @Override
    public String toString() {
        return username + " (" + firstName + " " + lastName + ")";
    }
    // Μέθοδος που ορίζει τον μοναδικό κωδικό πρόσβασης του χρήστη
    public void setAccessCode(String uniqueCode) {
        this.accessCode = uniqueCode;
    }
}


