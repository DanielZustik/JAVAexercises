package fromCollege.anothercomposition;

import java.time.LocalDate;

public class Product {
    private String name;
    private int amount;
    private MeasureUnit measureUnit;
    private LocalDate expirationDate;
    private double price;

    public Product(String name, int amount, MeasureUnit measureUnit, LocalDate expirationDate, double price) {
        this.name = name;
        this.amount = amount;
        this.measureUnit = measureUnit;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", measureUnit=" + measureUnit +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                '}';
    }
}
