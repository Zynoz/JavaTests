package com.Zynoz;

/**
 * Created by Zynoz on 27.02.2017.
 */
public class DiscountItem {
    private String productName;
    private String productBrand;
    private String itemDescription;
    private int discountInPercent;
    private double originalPrice;

    public DiscountItem(String productName, String productBrand, String itemDescription, int discountInPercent, double originalPrice) {

        this.productName = productName;
        this.productBrand = productBrand;
        this.itemDescription = itemDescription;
        this.discountInPercent = discountInPercent;
        this.originalPrice = originalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(int discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double calculateNewPrice() {
        double price = getOriginalPrice();
        price = (price / 100) * getDiscountInPercent();
        return price;
    }


}
