package com.menu.menuApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;

    private String itemName;

    private float itemPrice;

    private float itemRating;

    public Item() {
    }

    public Item(Long itemId, String itemName, float itemPrice, float itemRating) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemRating = itemRating;
    }

    public Item(String itemName, float itemPrice, float itemRating) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemRating = itemRating;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public float getItemRating() {
        return itemRating;
    }

    public void setItemRating(float itemRating) {
        this.itemRating = itemRating;
    }
}
