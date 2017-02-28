package com.MyBestMenu;

import java.util.List;

/**
 * Created by Zynoz on 28.02.2017.
 */
public class ManageDiscountItems {
    private DiscountItem[] discountItems;
    private List<DiscountItem> discountItemList;

    public ManageDiscountItems() {

    }


    public void addDiscountItemToList(DiscountItem discountItem) {
        if (discountItem == null) {
            System.err.println("null");
        } else {
            discountItemList.add(discountItem);
        }
    }
    public void addDiscountItemToListAtPostion(int pos, DiscountItem discountItem) {
        if (discountItem == null && pos < 0) {
            System.err.println("discountItem is null or pos < 0");
        } else {
            discountItemList.add(pos, discountItem);
        }
    }

    public void setDiscountItemInList(int pos, DiscountItem discountItem) {
        if (discountItem == null && pos <= 0) {
            System.err.println("discountItem is null or pos <= 0");
        } else {
            discountItemList.set(pos, discountItem);
        }
    }

    public void removeDiscountItemFromList(int pos) {
        if (pos < 0) {
            System.err.println("value not valid");
        } else {
            discountItemList.remove(pos);
        }
    }

    public void removeAllDiscountItemsFromList() {
        discountItemList.clear();
    }
}