package fromCollege.composition;

public class Car {
    private String model;
    private String manufacturer;
    private int kilometers;
    private Consumption consumption;
    private int price;
    private Fuel fuel;

    public Car (String model, String manufacturer, int kilometers, Consumption consumption, int price, Fuel fuel) {
        this.setModel(model);
        this.setManufacturer(manufacturer);
        this.setKilometers(kilometers);
        this.setConsumption(consumption);
        this.setPrice(price);
        this.setFuel(fuel);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Consumption getConsumption() {
        return consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }
}
