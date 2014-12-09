package model;

/**
 * @author Team 1 IS106 ZoekJeKoffer
 *
 */
public class Luggage {

    // Implementeer eigenschappen (Brand, weight etc)
    private String weight; 
    private String brand;
    private String description; 
    private String status;
    
    public Luggage(){
        
    }
    
    public Luggage(String weight, String brand, String description, 
            String status){
        
        this.weight = weight;
        this.brand = brand;
        this.description = description;
        this.status = status;
        
    }
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}