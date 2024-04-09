package com.project.DTO;

public class ProductDTO {
    private int id;
    private String product_name;
    private String url_image;
    private Float price;
    private int is_active;
    private String created_date;
    private String category;

    public ProductDTO(String name, Float price){
        this.product_name = name;
        this.price= price;
    }

    public ProductDTO(int id,String product_name, String url_image, Float price, int is_active,String created_date, String category ){
        this.id = id;
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.is_active = is_active;
        this.created_date = created_date;
        this.category = category;
    }
    public ProductDTO(String product_name, String url_image, Float price, String category ){
        this.product_name = product_name;
        this.url_image = url_image;
        this.price = price;
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
    public String getCreated_date() {
        return created_date;
    }
    public int getIs_active() {
        return is_active;
    }
    public Float getPrice() {
        return price;
    }
    public String getProduct_name() {
        return product_name;
    }
    public String getUrl_image() {
        return url_image;
    }
    
}