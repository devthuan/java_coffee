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

    public ProductDTO getProductByID_IgnoreActiveState(int id) {
        ProductDTO product = null;
        try {
            product = productDAO.getProductByID_IgnoreActiveState(id);
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

// <<<<<<< HEAD
//     public boolean setProductQuantity(int product_id, int quantity) {
//         boolean rs = false;
//         try {
//             rs = productDAO.setProductQuantity(product_id, quantity);
// =======
    public boolean increaseProductQuantity(int product_id, int quantity) {
        boolean rs = false;
        try {
            rs = productDAO.increaseProductQuantity(product_id, quantity);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }

    public static ArrayList<ProductDTO> getAllProduct() {
        return ProductDAO.allProduct();
    }

    public static ArrayList<ProductDTO> searchProductbyNameBUS(String keyword) {
        return ProductDAO.searchProductDAO(keyword);
    }

    public static boolean createProductBUS(ProductDTO newProductDTO) {
        return ProductDAO.addProductDAO(newProductDTO);
    }

    public static boolean deleteProductBUS(int id) {
        return ProductDAO.deleteProductDAO(id);
    }

    public static boolean updatedProductBUS(ProductDTO updatedProduct) {
        return ProductDAO.updateProductDAO(updatedProduct);
    }

    public static void main(String[] args) {
        ArrayList<ProductDTO> getAllProduct = searchProductbyNameBUS("t");

        for (ProductDTO productDTO : getAllProduct) {
            System.out.println(productDTO.getId());
            System.out.println(productDTO.getCategory_name());
        }
    }

    public boolean decreaseProductQuantity(int product_id, int quantity) {
        boolean rs = false;
        try {
            rs = productDAO.decreaseProductQuantity(product_id, quantity);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }
}
