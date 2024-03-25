package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

import com.project.DTO.ProductDTO;

public class ProductDAO {

    public static ArrayList<ProductDTO> get_all_product() {
        ArrayList<ProductDTO> list_product = new ArrayList<>();
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "SELECT \r\n" + //
                    "\tproducts.id,\r\n" + //
                    "\tproducts.product_name AS product_name,\r\n" + //
                    "\turl_image,\r\n" + //
                    "\tprice,\r\n" + //
                    "\tcategories.catgegory_name AS category,\r\n" + //
                    "\tproducts.is_active,\r\n" + //
                    "\tproducts.created_date\r\n" + //
                    " from products join categories on products.category_id = categories.id";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String product_name = result.getString("product_name");
                String url_image = result.getString("url_image");
                float price = result.getFloat("price");
                String category = result.getString("category");
                int is_active = result.getInt("is_active");
                String created_date = result.getString("created_date");
                list_product.add(new ProductDTO(id, product_name, url_image, price, is_active, created_date, category));
            }
            mysqlConnect.closeConnection(conn);
            return list_product;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    // public static void main(String[] args) {
    //     ArrayList<ProductDTO> list = get_all_product();
    //     for (ProductDTO productDTO : list) {
    //         System.out.println(productDTO.getProduct_name());
    //     }
    // }

}
