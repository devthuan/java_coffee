package com.project.BUS;

import java.util.ArrayList;

import com.project.DAO.ProductDAO;
import com.project.DTO.ProductDTO;

public class ProductBUS {
    public static ArrayList<ProductDTO> getAllProduct() {
            return ProductDAO.allProduct();
    }
    public static ArrayList<ProductDTO> searchProductbyNameBUS(String keyword) {
            return ProductDAO.searchProductDAO(keyword);
    }
    public static ArrayList<ProductDTO> addProductBUS(ProductDTO newProductDTO){
        System.out.println(newProductDTO.getLoaisp());
        return ProductDAO.addProductDAO(newProductDTO);
    }
    public static boolean deleteProductBUS (int id){
        return ProductDAO.deleteProductDAO(id);
    }


    public static void main(String[] args) {
       // addProductBUS(new ProductDTO("atesst","tádf",123.1, 123, 1));
        deleteProductBUS(2);
    }
   
}
