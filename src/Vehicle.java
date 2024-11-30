public class Vehicle {
    int id;
    String vehNumber;
    VehicleType vehicleType;
    String companyName;
    String model;
    String color;

    public Vehicle(int id, String vehNumber, VehicleType vehicleType, String companyName, String model, String color) {
        this.id = id;
        this.vehNumber = vehNumber;
        this.vehicleType = vehicleType;
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }

    public void displayVehicle() {
        System.out.println("Vehicle ID: " + id);
        System.out.println("Vehicle Number: " + vehNumber);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Company Name: " + companyName);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVehNumber() {
        return vehNumber;
    }

    public void setVehNumber(String vehNumber) {
        this.vehNumber = vehNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
