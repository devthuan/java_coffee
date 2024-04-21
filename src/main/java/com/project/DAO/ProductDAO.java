// package com.project.DAO;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.*;
// import java.util.ArrayList;

// import com.project.DTO.ProductDTO;

// public class ProductDAO {

//     public static ArrayList<ProductDTO> get_all_product() {
//         ArrayList<ProductDTO> list_product = new ArrayList<>();
//         try {
//             Connection conn = mysqlConnect.getConnection();
//             String sql = "SELECT \r\n" + //
//                     "\tsanpham.id,\r\n" + //
//                     "\tsanpham.ten_SP AS ten_SP,\r\n" + //
//                     "\turl_anh,\r\n" + //
//                     "\tgia,\r\n" + //
//                     "\tloaisanpham.ten_loai AS ten_loai,\r\n" + //
//                     "\tsanpham.is_active,\r\n" + //
//                     "\tsanpham.createdAt\r\n" + //
//                     " from sanpham join loaisanpham on sanpham.LoaiSanPham_id = loaisanpham.id";
//             PreparedStatement pst = conn.prepareStatement(sql);
//             ResultSet result = pst.executeQuery();
//             while (result.next()) {
//                 int id = result.getInt("id");
//                 String product_name = result.getString("ten_SP");
//                 String url_image = result.getString("url_anh");
//                 float price = result.getFloat("gia");
//                 String category = result.getString("ten_loai");
//                 int is_active = result.getInt("is_active");
//                 String created_date = result.getString("createdAt");
//                 list_product.add(new ProductDTO(id, product_name, url_image, price, is_active, created_date, category));
//             }
//             mysqlConnect.closeConnection(conn);
//             return list_product;
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//         return null;
//     }

//     public static Boolean getAllProduct(){
//         try {
//             // tạo kết nối db
//             Connection connect = mysqlConnect.getConnection();
            
//             // viết sql
//             String sql = "select * from SanPham";

//             // sử dụng câu lệnh sql
//             PreparedStatement pst = connect.prepareStatement(sql);

//             // nhận kết quả trả về

//             ResultSet result_query = pst.executeQuery();

//             while (result_query.next()) {
//                 String ten_sp = result_query.getString("ten_SP");
//                 String img = result_query.getString("url_anh");
//                 float gia = result_query.getFloat("gia");
//                 System.out.println(ten_sp);
//                 System.out.println(img);
//                 System.out.println(gia);
//             }
            
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         getAllProduct();
//     }

// }
