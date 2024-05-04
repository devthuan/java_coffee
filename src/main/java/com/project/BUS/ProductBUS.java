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

    public boolean decreaseProductQuantity(int product_id, int quantity) {
        boolean rs = false;
        try {
            rs = productDAO.decreaseProductQuantity(product_id, quantity);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }

    public static ArrayList<ProductDTO> filterProductBUS(int sortByPrice, int filterByCategory) {
        ArrayList<ProductDTO> filteredProducts = new ArrayList<>();

        if (filterByCategory == 0) {
            filteredProducts = ProductDAO.allProduct();
        } else if (filterByCategory == 1) {
            filteredProducts = ProductDAO.getProductByCategory(1);
        } else if (filterByCategory == 2) {
            filteredProducts = ProductDAO.getProductByCategory(2);
        } else if (filterByCategory == 3) {
            filteredProducts = ProductDAO.getProductByCategory(3);
        }
        if (sortByPrice == 1) {
            filteredProducts.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
        }
        return filteredProducts;

    }

}
