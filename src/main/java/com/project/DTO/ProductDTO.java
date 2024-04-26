package com.project.DTO;

import java.time.LocalDateTime;

public class ProductDTO {
    private int id;
    private String product_name;
    private String url_image;
    private Float price;
    private int is_active;
    private int quantity;
    private LocalDateTime createdAt;
    private int category_id;

    public ProductDTO(int id, String product_name, String url_image, Float price, int is_active, int quantity,
            LocalDateTime createdAt, int category_id) {
        this.id = id;
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.is_active = is_active;
        this.quantity = quantity;
        this.createdAt = createdAt;
        this.category_id = category_id;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "ProductDTO [id=" + id + ", product_name=" + product_name + ", url_image=" + url_image + ", price="
                + price + ", is_active=" + is_active + ", quantity=" + quantity + ", createdAt=" + createdAt
                + ", category_id=" + category_id + "]";
    }

}
