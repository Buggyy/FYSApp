package model;

import java.util.ArrayList;
import main.FYSApp;
import static main.FYSApp.*;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */
public class Luggage {

    /*
     private ArrayList<String> departureFrom;
     this.departureFrom  = FYSApp.getAirportsList();
    
     private ArrayList<String> foundAt;
     this.foundAt = FYSApp.getAirportsList();
    
     private static ArrayList<String> color;
     private static ArrayList<String> weight_class;
     private static ArrayList<String> departureFrom;
    
    private ArrayList<String> color;
     color.add("red");
     color.add("blue");
     color.add("yellow");
     color.add("pink");
     color.add("purple");
     color.add("green");
     color.add("black");
     color.add("white");
     color.add("orange");
     color.add("grey");
     color.add("brown");
     color.add("other..");
        
    private ArrayList<String> weight_class;
     weight_class.add("0kg - 5kg");
     weight_class.add("5kg - 10kg");
     weight_class.add("10kg - 15kg");
    
     weight_class.add("15kg - 20kg");
     weight_class.add("20kg+");
     */
    // Initializing attributes
    private String brand = NO_VALUE;
    private String lableCode = NO_VALUE;
    private String material = NO_VALUE;
    private String otherDetails = NO_VALUE;
    private String weightClass = NO_VALUE;
    private String status = NO_VALUE;
    private String color = NO_VALUE;
    private String whenFound = NO_VALUE;
    private String foundAt = NO_VALUE;
    private String departureFrom = NO_VALUE;

    /**
     *
     * @param brand of the luggage
     * @param lableCode that has the luggage
     * @param material that the luggage is made of
     * @param otherDetails to specify information
     * @param status of the luggage (found/lost)
     * @param color of the luggage item
     * @param weightClass the luggage is in
     * @param whenFound date when luggage is found
     * @param foundAt airport luggage is found
     * @param departureFrom
     */
    public Luggage(String brand, String lableCode,
            String material, String otherDetails, String status, String color,
            String weightClass, String whenFound, String foundAt,
            String departureFrom) {
        this.brand = brand;
        this.lableCode = lableCode;
        this.material = material;
        this.otherDetails = otherDetails;
        this.status = status;
        this.color = color;
        this.weightClass = weightClass;
        this.whenFound = whenFound;
        this.departureFrom = departureFrom;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLableCode(String lableCode) {
        this.lableCode = lableCode;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public void setStatus(String status) {
        this.status = status;
    }

        public void setWhenFound(String whenFound) {
        this.whenFound = whenFound;
    }

    public void setFoundAt(String foundAt) {
        this.foundAt = foundAt;
    }
    
    public String getWhenFound() {
        return whenFound;
    }

    public String getFoundAt() {
        return foundAt;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeightClass(String weightClass) {
        this.weightClass = weightClass;
    }

    public String getColor() {
        return color;
    }

    public String getWeightClass() {
        return weightClass;
    }

    public String getStatus() {
        return status;
    }

    public String getBrand() {
        return brand;
    }

    public String getLableCode() {
        return lableCode;
    }

    public String getMaterial() {
        return material;
    }

    public String getOtherDetails() {
        return otherDetails;
    }

}
