public class Car extends VehicleManufacturer implements Vehicle {
    int maxSpeed;
    Car(String vehicleName,String vehicleModelName,String vehicleType,int maxSpeed){
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
        return "Car{}   " +super.toString();
    }
    public   int maxSpeed(String vehicleType){
        if(vehicleType.equals("SportsCar")){
            return 250;
        }else if (vehicleType.equals("Sedan")){
            return 170;
        }
        return maxSpeed;
    }


}
