import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> car;
    
    public VehicleRegistry(){
        this.car = new HashMap<>();
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
       if(this.car.containsKey(licensePlate)){
           return false;
            
       }
       this.car.put(licensePlate, owner);
       return true;
    }
    
    public String get(LicensePlate licensePlate){
        return this.car.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if(this.car.containsKey(licensePlate)){
            this.car.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plates: this.car.keySet()){
            System.out.println(plates);
        }
    }
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(LicensePlate owners: this.car.keySet()){
            if(!names.contains(this.car.get(owners))){
              names.add(this.car.get(owners));  
            }
            
        }
        for(String name:names){
            System.out.println(name);
        }
    }
}
