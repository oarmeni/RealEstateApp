/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateapp;

import realestateapp.models.User;
import realestateapp.models.Property;
import java.util.ArrayList;
import java.util.List;
// Κλάση Database - Προσομοιώνει τη διαχείριση δεδομένων για χρήστες και ακίνητα
public class Database {
    // Λίστα που περιέχει όλους τους χρήστες της εφαρμογής
    public static List<User> users = new ArrayList<>();
    // Λίστα που περιέχει όλα τα ακίνητα της εφαρμογής
    public static List<Property> properties = new ArrayList<>();
    // Μέθοδος που επιστρέφει έναν χρήστη βάσει του username
    public static User getUserByUsername(String username) {
        for (User user : users) 
        {
            if (user.getUsername().equals(username)) 
            {
                return user;// Επιστρέφει τον χρήστη αν το username ταιριάζει
            }
        }
        return null;// Επιστρέφει null αν δεν βρεθεί ο χρήστης
    }
    // Μέθοδος που αναθέτει ένα ακίνητο σε έναν χρήστη
    public static void assignPropertyToUser(User user, Property property) {
        if (user != null && property != null) 
        {
            user.addProperty(property); // Προσθήκη του ακινήτου στη λίστα του χρήστη
            properties.add(property);// Προσθέτει το ακίνητο στη γενική λίστα ακινήτων
        }
    }
}

