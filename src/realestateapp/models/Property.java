/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateapp.models;

// Κλάση Property - Αντιπροσωπεύει ένα ακίνητο στην εφαρμογή
public class Property {
    // Μεταβλητές πεδία της κλάσης
    private double initialPrice;// Αρχική τιμή του ακινήτου
    private double finalPrice;// Τελική τιμή μετά ΦΠΑ
    private String imagePath;// Διαδρομή της εικόνας του ακινήτου
    private String description;// Περιγραφή του ακινήτου
    private User buyer;// Ο αγοραστής του ακινήτου (αν υπάρχει)
    private String accessCode;// Μοναδικός κωδικός πρόσβασης για το ακίνητο
    private User owner;// Ο ιδιοκτήτης του ακινήτου
    private String ownerUsername;// Το username του ιδιοκτήτη
    // Constructor της κλάσης που δέχεται όλες τις βασικές πληροφορίες
    public Property(double initialPrice, double finalPrice, String imagePath, String description, String ownerUsername) {
        this.initialPrice = initialPrice;
        this.finalPrice = finalPrice;
        this.imagePath = imagePath;
        this.description = description;
        this.ownerUsername = ownerUsername;
    }
    // Εναλλακτικός constructor για περιπτώσεις όπου δεν υπάρχει περιγραφή και ιδιοκτήτης
    public Property(double initialPrice, double finalPrice, String imagePath) {
        this.initialPrice = initialPrice;
        this.finalPrice = finalPrice;
        this.imagePath = imagePath;
        this.description = "";
    }
    // Μέθοδοι getter για επιστροφή των τιμών των ιδιοτήτων
    public double getInitialPrice() { return initialPrice; }
    public double getFinalPrice() { return finalPrice; }
    public String getImage() { return imagePath; }
    // Μέθοδος επιστροφής περιγραφής του ακινήτου σε μορφή String
    @Override
    public String toString() {
        return "Τιμή: " + finalPrice + "€";
    }
    // Επιστρέφει το username του ιδιοκτήτη
    public String getOwnerUsername() {
        return ownerUsername;
    }
    // Ορίζει νέο username για τον ιδιοκτήτη
    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }
    // Ορίζει νέα τελική τιμή
    public void setFinalPrice(double newFinalPrice) {
        this.finalPrice = newFinalPrice;
    }
    // Ορίζει νέα αρχική τιμή
    public void setInitialPrice(double newInitialPrice) {
        this.initialPrice = newInitialPrice; 
    }
    // Επιστρέφει τη διαδρομή της εικόνας του ακινήτου, εάν δεν υπάρχει επιστρέφει default
    public String getImagePath() {
        if(this.imagePath == null || this.imagePath.isEmpty())
        {
            return "default.png";
        }
        return this.imagePath;
    }
    // Επιστρέφει τον αγοραστή του ακινήτου
    public User getBuyer() {
        return buyer;
    }
    // Ορίζει τον αγοραστή του ακινήτου
    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }
    // Επιστρέφει τον μοναδικό κωδικό πρόσβασης του ακινήτου
    public String getAccessCode() {
        return accessCode;
    }
    // Ορίζει τον μοναδικό κωδικό πρόσβασης του ακινήτου
    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
    // Επιστρέφει την περιγραφή του ακινήτου
    public String getDescription() {
        return description;
    }   
    // Ορίζει τη διαδρομή της εικόνας του ακινήτου
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    // Ορίζει νέα περιγραφή για το ακίνητο
    public void setDescription(String description) {
        this.description = description;
    }
    // Επιστρέφει τον ιδιοκτήτη του ακινήτου ως αντικείμενο User
    public User getOwner() {
        return owner;
    }
    // Ορίζει τον ιδιοκτήτη του ακινήτου
    public void setOwner(User owner) {
    this.owner = owner;
    }
}

