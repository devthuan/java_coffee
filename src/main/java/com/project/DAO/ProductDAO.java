package com.project.DAO;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.project.DTO.ProductDTO;

public class ProductDAO {

    public static ArrayList<ProductDTO> allProduct() {
        ArrayList <ProductDTO> listProduct = new ArrayList<>();
        try {
            //tao ket noi tu database len arraylist
            Connection con = mysqlConnect.getConnection();

            //viet sql
            String sql = "select * from SanPham where is_active = 1";
            PreparedStatement pst = con.prepareStatement(sql);

            //nhan du lieu tu database tra ve
            ResultSet rls = pst.executeQuery();
            while(rls.next()){
                int id = rls.getInt("id");
                String tensp = rls.getString("ten_SP");
                String anh = rls.getString("url_anh");
                Double gia = rls.getDouble("gia");
                int hoatdong = rls.getInt("is_active");
                int soluong = rls.getInt("so_luong");
                Timestamp ngaylap = rls.getTimestamp("createdAt");
                LocalDateTime lcdt = ngaylap.toLocalDateTime();

                // Định nghĩa mẫu định dạng
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Định dạng LocalDateTime thành chuỗi
                String formattedDateTime = lcdt.format(formatter);
                int loaisp = rls.getInt("LoaiSanPham_id");
                ProductDTO a = new ProductDTO (id,tensp,anh,gia,hoatdong,soluong,formattedDateTime,loaisp);
                
                listProduct.add(a);
             }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return listProduct;
    }
    
    // tim kiem
    public static ArrayList<ProductDTO> searchProductDAO(String keyword) {
        ArrayList <ProductDTO> listProduct = new ArrayList<>();
        try {
            //tao ket noi tu database len arraylist
            Connection con = mysqlConnect.getConnection();

            //viet sql
            String sql = "select * from SanPham where is_active = 1 and ten_SP like ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, keyword + "%");
            //nhan du lieu tu database tra ve
            ResultSet rls = pst.executeQuery();
            while(rls.next()){
                int id = rls.getInt("id");
                String tensp = rls.getString("ten_SP");
                String anh = rls.getString("url_anh");
                Double gia = rls.getDouble("gia");
                int hoatdong = rls.getInt("is_active");
                int soluong = rls.getInt("so_luong");
                Timestamp ngaylap = rls.getTimestamp("createdAt");
                LocalDateTime lcdt = ngaylap.toLocalDateTime();

                // Định nghĩa mẫu định dạng
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                // Định dạng LocalDateTime thành chuỗi
                String formattedDateTime = lcdt.format(formatter);
                int loaisp = rls.getInt("LoaiSanPham_id");
                ProductDTO a = new ProductDTO (id,tensp,anh,gia,hoatdong,soluong,formattedDateTime,loaisp);
                
                listProduct.add(a);
             }

        } catch (Exception e) {
            // TODO: handle exception
        }
        return listProduct;
    }
    

    // them vao database
    public static ArrayList<ProductDTO> addProductDAO(ProductDTO new_product) {

        ArrayList <ProductDTO> listProduct = new ArrayList<>();
        try {
            //tao ket noi
            Connection con = mysqlConnect.getConnection();

            //viet sql
            String sql = "insert into SanPham (ten_SP,url_anh,gia,so_luong,LoaiSanPham_id) values (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            try {
                
                pst.setString(1, new_product.getProduct());
                pst.setString(2, new_product.getImg());
                pst.setDouble(3, new_product.getPrice());
                pst.setInt(4, new_product.getSoluong());
                pst.setInt(5, new_product.getLoaisp());
                
                

                if (pst.executeUpdate() >0) {
                    System.out.println("New product Added");
                }
                else {
                    System.out.println("Error");
                }
        
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listProduct ;
        
    }
   
    // xoa san pham
    public static boolean deleteProductDAO (int id){
        try {
            Connection con = mysqlConnect.getConnection();
            String deleteSql = "update SanPham set is_active = ?, updatedAt = NOW() where id =? ";
            PreparedStatement pst = con.prepareStatement(deleteSql);
            pst.setInt(1, 0);
            pst.setInt(2, id);
            if (pst.executeUpdate() >0) {
                System.out.println("Product Deleted");
                return true;
            }
            else {
                System.out.println("Error");
            return false;

            }
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }

    }

    //loc san pham
    
             
        
     
}
