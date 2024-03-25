package com.project.DTO;

import java.util.List;

public class CartDTO {
    private int id;
    private int quantity;
    private int product_id;
    private int account_id;
    private ProductDTO product;

    public CartDTO(int id, ProductDTO product, int quantity, int account_id) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.account_id = account_id;
    }

    public CartDTO(int quantity, int product_id, int account_id) {

        this.quantity = quantity;
        this.product_id = product_id;
        this.account_id = account_id;
    }

    public CartDTO(int id, int quantity, int product_id, int account_id) {
        this.id = id;
        this.quantity = quantity;
        this.product_id = product_id;
        this.account_id = account_id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public int getId() {
        return id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

}
