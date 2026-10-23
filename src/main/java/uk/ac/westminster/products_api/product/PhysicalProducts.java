package uk.ac.westminster.products_api.product;

//A PhysicalProduct IS-A Product because it's a subclass of Products class
//Service because

public class PhysicalProducts extends Product{
    private double weightKg;
    private String dimensions;

    public PhysicalProducts(){

    }

    public PhysicalProducts(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
