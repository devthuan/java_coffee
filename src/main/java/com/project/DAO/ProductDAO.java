package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

import java.time.LocalDateTime;

import java.util.ArrayList;

import com.project.DTO.ProductDTO;

public class ProductDAO {

    public ArrayList<ProductDTO> getAll() {
        ArrayList<ProductDTO> products = null;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select * from SanPham";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            products = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("ten_SP");
                String url_image = rs.getString("url_anh");
                float price = rs.getFloat("gia");
                int is_active = rs.getInt("is_active");
                int quantity = rs.getInt("so_luong");
                LocalDateTime createAt = rs.getTimestamp("createdAt").toLocalDateTime();
                int category_id = rs.getInt("LoaiSanPham_id");
                products.add(
                        new ProductDTO(id, product_name, url_image, price, is_active, quantity, createAt, category_id));
            }
            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }

    public ProductDTO getProductByID(int product_id) {
        ProductDTO productDTO = null;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select * from SanPham Where id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, product_id);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("ten_SP");
                float price = rs.getFloat("gia");
                productDTO = new ProductDTO(id, product_name, price);
            }
            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            System.out.println(e);
        }
        return productDTO;
    }

    public ArrayList<ProductDTO> getProductByCategory(int category) {
        ArrayList<ProductDTO> products = null;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select * from SanPham Where LoaiSanPham_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, category);
            ResultSet rs = pst.executeQuery();

            products = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("ten_SP");
                String url_image = rs.getString("url_anh");
                float price = rs.getFloat("gia");
                int is_active = rs.getInt("is_active");
                int quantity = rs.getInt("so_luong");
                LocalDateTime createAt = rs.getTimestamp("createdAt").toLocalDateTime();
                int category_id = rs.getInt("LoaiSanPham_id");
                products.add(
                        new ProductDTO(id, product_name, url_image, price, is_active, quantity, createAt, category_id));
            }
            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }

    public boolean setProductQuantity(int product_id, int quantity) {
        boolean rs = false;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Update SanPham set so_luong = ? Where id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(2, product_id);
            pst.setInt(1, quantity);
            int result = pst.executeUpdate();
            if (result > 0) {
                rs = true;
            }
            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            System.out.println(e);
        }
        return rs;
    }

}
