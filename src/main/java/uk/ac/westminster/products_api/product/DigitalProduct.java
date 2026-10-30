package uk.ac.westminster.products_api.product;

public class DigitalProduct extends Product implements Discountable{

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(long id, String name, double price, String downloadUrl, double fileSizeMB){
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary(){
        return getName() + getDownloadUrl() + getFileSizeMB();
    }

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice()* (1 - rate);
    }

    @Override
    public double getDiscount() {
        return discountedPrice;
    }
}
