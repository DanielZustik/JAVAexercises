package fromCollege.composition;

public class CarDealer {
    private Car[] cars;

    private int capacity;
    public CarDealer (int capacity){
        this.capacity = capacity;
        this.cars = new Car[capacity];
    }

    public void addCar(Car car){
        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i] == null)
            {
                cars[i] = car;
                return;
            }
        }
    }

    public int getCarCount () {
        int count = 0;
        for(Car car : cars)
        {
            if (car != null) {
                count ++;
            }
        }
        return count;
    }

    public Car getCarByModel(String model) {
        for(Car car : cars)
        {
            if (car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }

    public Car[] getCarsByManufacturer(String manufacturer) {
        int count = 0;
        for(int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null){
                if (cars[i].getManufacturer().equals(manufacturer))
                {
                    count++;
                }
            }
        }

        Car[] carsByManufacturer = new Car[count];
        int index = 0;

        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null && cars[i].getManufacturer().equals(manufacturer)) {
                carsByManufacturer[index] = cars[i];
                index++;
            }
        }
        return carsByManufacturer;
    }

    public Car[] getCarsUnderAverageConsumption(double consumption){
        int count = 0;
        for(int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null){
                if (cars[i].getConsumption().getAverage() < consumption)
                {
                    count++;
                }
            }
        }

        int index = 0;
        Car[] carsWithParticularConsumption = new Car[count];

        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null && cars[i].getConsumption().getAverage() < consumption) {
                carsWithParticularConsumption[index] = cars[i];
                index++;
            }
        }
        return carsWithParticularConsumption;
    }

    public Car[] getCarsByFuel(Fuel fuel){
        int count = 0;
        for(int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null){
                if (cars[i].getFuel().equals(fuel))
                {
                    count++;
                }
            }
        }

        int index = 0;
        Car[] carsWithParticularFuel = new Car[count];

        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null && cars[i].getFuel().equals(fuel)) {
                carsWithParticularFuel[index] = cars[i];
                index++;
            }
        }
        return carsWithParticularFuel;
    }
    public void printInfo () {
        for (int i = 0; i < cars.length; i++)
        {
            if (cars[i] != null) {
                System.out.printf("Znacka: %s, model: %s, cena: %d", cars[i].getManufacturer(), cars[i].getModel(), cars[i].getPrice());
                System.out.println();
            }
        }
    }
}
