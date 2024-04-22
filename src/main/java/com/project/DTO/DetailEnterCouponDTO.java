package com.project.DTO;

public class DetailEnterCouponDTO {
    private int id;
    private String nameIngredient;
    private float price;
    private int quantity;
    private float totalPrice;

    public DetailEnterCouponDTO(int id, String nameIngredient, float price, int quantity, float totalPrice) {
        this.id = id;
        this.nameIngredient = nameIngredient;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public int getId() {
        return id;
    }
    public String getNameIngredient() {
        return nameIngredient;
    }
    public float getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public float getTotalPrice() {
        return totalPrice;
    }
}
