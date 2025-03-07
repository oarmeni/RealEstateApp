/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package realestateapp;

/**
 *
 * @author ouran
 */
import realestateapp.models.Property;
import java.util.ArrayList;
import java.util.List;

public class PropertyManager {
    private static List<Property> properties = new ArrayList<>();

    public static void addProperty(Property property) {
        properties.add(property);
    }

    public static List<Property> getProperties() {
        return properties;
    }

    public static List<Property> getAvailableProperties(String loggedUsername) {
        List<Property> availableProperties = new ArrayList<>();
        for (Property property : properties) 
        {
            if (property.getBuyer() == null && !property.getOwnerUsername().equals(loggedUsername)) 
            {
                availableProperties.add(property);
            }
        }
        return availableProperties;
    }
}
