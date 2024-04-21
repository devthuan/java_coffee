package com.project.DTO;


public class ProductDTO {
    private int id;
    private String nameProduct;
    private String imageProduct;
    private float price;
    private int quantity;
    private int totalSold;

    public ProductDTO(String nameProduct, String imageProduct, float price, int totalSold) {
        this.nameProduct = nameProduct;
        this.imageProduct = imageProduct;
        this.price = price;
        this.totalSold = totalSold;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setImageProduct(String imageProduct) {
        this.imageProduct = imageProduct;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public int getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getImageProduct() {
        return imageProduct;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalSold() {
        return totalSold;
    }
}
