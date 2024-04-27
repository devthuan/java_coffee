package com.project.DTO;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ProductDTO {
    private int id;
    private String product_name;
    private String img_path;
    private Double price;
    private int active;
    private int quanity;
    private String date;
    private int lsp;
    

    public ProductDTO ( String product_name, String img_path, Double price, int quanity, int lsp) {
        this.product_name = product_name;
        this.img_path = img_path;
        this.price = price;
        this.quanity = quanity;
        this.lsp = lsp;
    }
    

    // them san pham
    public ProductDTO (int id, String product_name, String img_path, Double price, int active, int quanity, String date, int lsp) {
        this.id = id;
        this.product_name = product_name;
        this.img_path = img_path;
        this.price = price;
        this.active = active;
        this.quanity = quanity;
        this.date = date;
        this.lsp = lsp;
    }
   // xoa san pham
    public ProductDTO(int id){
        this.id=id;
    }

    // loc san pham theo gia 
    
    public int getId() {
        return id;
    }
    public String getImg() {
        return img_path;
    }
    public Double getPrice() {
        return price;
    }
    public String getProduct() {
        return product_name;
    }
    public int getHoatdong() {
        return active;
    }
    public int getLoaisp() {
        return lsp;
    }
    public String getNgaylap() {
        return date;
    }
    public int getSoluong() {
        return quanity;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setImg(String img_path) {
        this.img_path = img_path;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setProduct(String product) {
        this.product_name = product_name;
    }
    public void setHoatdong(int active) {
        this.active = active;
    }
    public void setLoaisp(int lsp) {
        this.lsp = lsp;
    }
    public void setNgaylap(String date) {
        this.date = date;
    }
    public void setSoluong(int quanity) {
        this.quanity = quanity;
    }
    
   
}

