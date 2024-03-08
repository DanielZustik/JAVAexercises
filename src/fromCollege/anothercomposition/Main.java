package fromCollege.anothercomposition;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Eidam 30%", 100, MeasureUnit.G, LocalDate.of(2023, 10, 10),
                25);
        Product product2 = new Product("Gouda 20%", 200, MeasureUnit.G, LocalDate.of(2022, 10, 10),
                25);
        Pallete pallete = new Pallete(30, ProductType.CHEESSE, 50);
        pallete.addProduct(product1);
        pallete.addProduct(product2);

    }
}
