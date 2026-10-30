package uk.ac.westminster.products_api.product;

public interface Discountable {
    public void applyDiscount(double rate);
    public double getDiscount();
}
