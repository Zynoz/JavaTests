package com.MyBestMenu;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Zynoz on 27.02.2017.
 */
public class DiscountItem {
    private String productName;
    private String productBrand;
    private String itemDescription;
    private int discountInPercent;
    private double originalPrice;
    private String itemImage;
    private String brandImage;

    public DiscountItem(String productName, String productBrand, String itemDescription, int discountInPercent, double originalPrice, String itemImage, String brandImage) {
        this.productName = productName;
        this.productBrand = productBrand;
        this.itemDescription = itemDescription;
        this.discountInPercent = discountInPercent;
        this.originalPrice = originalPrice;
        this.itemImage = itemImage;
        this.brandImage = brandImage;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        try {
            HttpURLConnection.setFollowRedirects(false);
            // note : you may also need
            //        HttpURLConnection.setInstanceFollowRedirects(false)
            HttpURLConnection con =
                    (HttpURLConnection) new URL(itemImage).openConnection();
            con.setRequestMethod("HEAD");
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                this.itemImage = itemImage;
            } else {
                System.err.println("cannot find image");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBrandImage() {
        return brandImage;
    }

    public void setBrandImage(String brandImage) {
        try {
            HttpURLConnection.setFollowRedirects(false);
            // note : you may also need
            //        HttpURLConnection.setInstanceFollowRedirects(false)
            HttpURLConnection con =
                    (HttpURLConnection) new URL(itemImage).openConnection();
            con.setRequestMethod("HEAD");
            if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
                this.brandImage = brandImage;
            } else {
                System.err.println("cannot find image");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

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
        return getOriginalPrice() - (price / 100) * getDiscountInPercent();
    }


}
