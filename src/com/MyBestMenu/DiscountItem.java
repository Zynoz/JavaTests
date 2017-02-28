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
    private String location;
    private String itemImage;
    private String brandImage;
    private int discountInPercent;
    private int radius;
    private int howManyPeople;
    private double originalPrice;
    private double reducedPrice;

    public DiscountItem(String productName, String productBrand, String itemDescription, String location, String itemImage, String brandImage, int discountInPercent, int radius, int howManyPeople, double originalPrice, double reducedPrice) {
        setProductName(productName);
        setProductBrand(productBrand);
        setItemDescription(itemDescription);
        setLocation(location);
        setItemImage(itemImage);
        setBrandImage(brandImage);
        setDiscountInPercent(discountInPercent);
        setRadius(radius);
        setHowManyPeople(howManyPeople);
        setOriginalPrice(originalPrice);
        setReducedPrice(reducedPrice);
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
        if (itemDescription.length() >= 100) {
            System.err.println("Beschreibung zu lange");
        } else {
            this.itemDescription = itemDescription;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public int getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(int discountInPercent) {
        if (discountInPercent > 0 && discountInPercent <= 100) {
            this.discountInPercent = discountInPercent;
        } else {
            System.err.println("value not valid");
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius > 0 && radius <= 1500) {
            this.radius = radius;
        } else {
            System.err.println("value not valid");
        }
    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public void setHowManyPeople(int howManyPeople) {
        if (howManyPeople > 0) {
            this.howManyPeople = howManyPeople;
        } else {
            System.err.println("value not valid");
        }
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getReducedPrice() {
        return reducedPrice;
    }

    public void setReducedPrice(double reducedPrice) {
        this.reducedPrice = reducedPrice;
    }

    @Override
    public String toString() {
        return "DiscountItem{" +
                "productName='" + productName + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", location='" + location + '\'' +
                ", itemImage='" + itemImage + '\'' +
                ", brandImage='" + brandImage + '\'' +
                ", discountInPercent=" + discountInPercent +
                ", radius=" + radius +
                ", howManyPeople=" + howManyPeople +
                ", originalPrice=" + originalPrice +
                ", reducedPrice=" + reducedPrice +
                '}';
    }
}