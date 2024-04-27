package com.project.DTO;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductDTO {
    private int id;
    private String product_name;
    private String url_image;
    private float price;
    private int quantity;
    private int totalSold;
    private int is_active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int category_id;
    private String category_name;

    public ProductDTO(String product_name, float price) {
        this.product_name = product_name;
        this.price = price;
    }

    // get product
    public ProductDTO(int id, String product_name, String url_image, float gia, int is_active, int quantity,
            int category_id, String category_name, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = gia;
        this.is_active = is_active;
        this.quantity = quantity;
        this.category_name = category_name;
        this.category_id = category_id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // create product
    public ProductDTO(String product_name, String url_image, Float price, int quantity,
            int category_id) {
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.quantity = quantity;
        this.category_id = category_id;
    }

    // update product
    public ProductDTO(int id, String product_name, String url_image, Float price, int quantity, int category_id) {
        this.id = id;
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.quantity = quantity;
        this.category_id = category_id;

    }

    public ProductDTO(int id, String product_name, String url_image, Float price, int is_active, int quantity,
            int category_id,
            LocalDateTime createdAt) {
        this.id = id;
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.is_active = is_active;
        this.quantity = quantity;
        this.category_id = category_id;
        this.createdAt = createdAt;
    }

    public ProductDTO(int id, String product_name, Float price) {
        this.id = id;
        this.product_name = product_name;
        this.price = price;
    }

    public ProductDTO(String product_name, Float price) {
        this.product_name = product_name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public int getIs_active() {
        return is_active;
    }

    public float getPrice() {
        return price;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalSold() {
        return totalSold;
    }

    public String getCategory_name() {
        return category_name;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotalSold(int totalSold) {
        this.totalSold = totalSold;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "ProductDTO [id=" + id + ", product_name=" + product_name + ", url_image=" + url_image + ", price="
                + price + ", is_active=" + is_active + ", quantity=" + quantity + ", createdAt=" + createdAt
                + ", category_id=" + category_id + "]";
    }

}
