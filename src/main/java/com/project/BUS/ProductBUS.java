package com.project.BUS;

import java.util.ArrayList;

import com.project.DAO.ProductDAO;
import com.project.DTO.ProductDTO;

public class ProductBUS {
    private ProductDAO productDAO;

    public ProductBUS() {
        this.productDAO = new ProductDAO();
    }

    public ArrayList<ProductDTO> getAll() {
        ArrayList<ProductDTO> products = null;
        try {
            products = productDAO.getAll();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return products;
    }

    public ProductDTO getProductByID(int id) {
        ProductDTO product = null;
        try {
            product = productDAO.getProductByID(id);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return product;
    }

    public ArrayList<ProductDTO> getProductByCategory(int category) {
        ArrayList<ProductDTO> products = null;
        try {
            products = productDAO.getProductByCategory(category);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return products;
    }

    public boolean setProductQuantity(int product_id, int quantity) {
        boolean rs = false;
        try {
            rs = productDAO.setProductQuantity(product_id, quantity);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }
}
