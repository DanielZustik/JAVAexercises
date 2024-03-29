package fromCollege.composition;

public class Consumption {
    private double city;

    private double highway;

    private double average;

    public Consumption (double city, double highway, double average){
        this.setCity(city);
        this.setHighway(highway);
        this.setAverage(average);
    }

    public double getCity() {
        return city;
    }

    public void setCity(double city) {
        this.city = city;
    }

    public double getHighway() {
        return highway;
    }

    public void setHighway(double highway) {
        this.highway = highway;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
