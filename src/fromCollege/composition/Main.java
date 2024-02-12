package fromCollege.composition;

public class Main {
    public static void main(String[] args) {
        CarDealer carDealer = new CarDealer(20);
        carDealer.addCar(new Car("M5", "BMW", 10000, new Consumption(15,10,12), 2500000, Fuel.PETROL));
        carDealer.addCar(new Car("M4", "BMW", 10000, new Consumption(14,10,12), 2000000, Fuel.PETROL));
        carDealer.addCar(new Car("M3", "BMW", 10000, new Consumption(13,9,11), 1700000, Fuel.DIESEL));
        carDealer.addCar(new Car("CLA", "Mercedes", 12000, new Consumption(8,6,7), 900000, Fuel.PETROL));
        carDealer.addCar(new Car("CLS", "Mercedes", 12000, new Consumption(12,9,10), 2500000, Fuel.HYBRID));

        carDealer.printInfo();
        System.out.printf("Total count: %d", carDealer.getCarCount());
        System.out.println();
        if (carDealer.getCarByModel("M4") != null)
        {
            System.out.printf("Searched by model: %s", carDealer.getCarByModel("M4").getModel());
        }
        System.out.println();
        System.out.printf("Car by manufacturer: %s", carDealer.getCarsByManufacturer("BMW")[0].getManufacturer());
        System.out.println();
        System.out.printf("Car with consumption 10l or less: %s", carDealer.getCarsUnderAverageConsumption(10)[0].getManufacturer());
        System.out.println();
        System.out.printf("Car with fuel 'Diesel': %s", carDealer.getCarsByFuel(Fuel.DIESEL)[0].getManufacturer());
        System.out.println();
    }
}