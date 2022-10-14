public class VehicleServices {
    public static void main(String[] args) {
        Bike bike=new Bike("R15","2022","SportsBike",250);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Bike Type is Sports Bike whose Speed is:- " +bike.maxSpeed("Sports")+ " Km/h");
        System.out.println(bike.getManufacturerInformation());
        System.out.println("---------------------------------------------------------------------------");
        Car car=new Car("Hyundai","Verna","Sedan",170);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Bike Type is Sports Bike whose Speed is:- " +car.maxSpeed("Sedan")+ " Km/h");
        System.out.println(car.getManufacturerInformation());
        System.out.println("---------------------------------------------------------------------------");



    }
}
