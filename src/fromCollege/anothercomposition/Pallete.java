package fromCollege.anothercomposition;

import java.time.LocalDate;

public class Pallete {
    private Product[] products;
    private ProductType productType;
    private double discountPerPrice;
    private int count;

    public Pallete(int capacity, ProductType productType, double discountPerPrice) {
        this.count = 0;
        this.products = new Product[capacity];
        this.productType = productType;
        this.discountPerPrice = discountPerPrice;
    }

    private Product[] trimProducts(Product[] products, int count) {
        Product[] trimmedProducts = new Product[count];

        for (int i = 0; i < count; i++) {
            trimmedProducts[i] = products[i];
        }
        return trimmedProducts;
    }

    public void addProduct (Product product) {
        if (count == products.length) return;

        products[count] = product;
        count++;
    }

    public Product[] getExpiredProducts () {
        Product[] expiredProducts = new Product[count];
        int expiredCount = 0;

        for (int i = 0; i < count; i++) {
            if (products[i].getExpirationDate().isBefore(LocalDate.now())) {
                expiredProducts[expiredCount] = products[i];
                expiredCount++;
            }
        }
        return trimProducts(expiredProducts, expiredCount);
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (int i = 0; i < count; i++) {
            totalPrice += products[i].getPrice();
        }

        return totalPrice;
    }

//    public double getTotalDiscountExpiredProducts () {
//        Product[] expiredProducts = getExpiredProducts();
//        double totalDiscount = 0;
//
//        for (Product expiredProduct : expiredProducts) {
//            totalDiscount += expiredProduct.getPrice()
//        }
//    }
}
