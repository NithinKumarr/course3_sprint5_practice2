public class Bike extends VehicleManufacturer implements Vehicle {
    private int maxSpeed;


    Bike(String vehicleName,String vehicleModelName,String vehicleType,int maxSpeed) {
        super(vehicleName,vehicleModelName,vehicleType);
        this.maxSpeed=maxSpeed;

    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public   String getManufacturerInformation(){
        return "Bike{}  " +super.toString();
    }
    public   int maxSpeed(String vehicleType){
        if(vehicleType.equals("SportsBike")){
            return 250;
        }else if (vehicleType.equals("Cruiser")){
            return 170;
        }
        return maxSpeed;
    }


}