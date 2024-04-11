package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.project.DTO.CartDTO;
import com.project.DTO.ProductDTO;

public class CartDAO {

    public static Boolean insertCart(CartDTO cart) {
        int result = 0;
        try {
            Connection conn = mysqlConnect.getConnection();
            CartDTO check_cart = getCartByProductId(cart.getProduct_id(), cart.getAccount_id());

            if (check_cart == null) {
                String sql = "insert into giohang (SanPham_id,so_luong, TaiKhoan_id)  values (?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, cart.getProduct_id());
                pst.setInt(2, cart.getQuantity());
                pst.setInt(3, cart.getAccount_id());
                result = pst.executeUpdate();

                if (result > 0) {
                    return true;
                }

            } else {
                String sql = "update giohang set so_luong = ?  where id = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                int new_quantity = check_cart.getQuantity() + 1;
                pst.setInt(1, new_quantity);
                pst.setInt(2, check_cart.getId());
                result = pst.executeUpdate();

                if (result > 0) {
                    return true;
                }
            }

            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public static Boolean updateQuantityInCart(int cart_id, int quantity) {
        int result = 0;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "update giohang set so_luong = ? where id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, quantity);
            pst.setInt(2, cart_id);
            result = pst.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static Boolean removeItemInCart(int cart_id) {
        int result = 0;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "delete from giohang where id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cart_id);
            result = pst.executeUpdate();

            return result > 0 ? true : false;

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static ArrayList<CartDTO> getCartByAccountId(int user_id) {
        ArrayList<CartDTO> list_cart = new ArrayList<>();

        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "SELECT giohang.id, SanPham_id, TaiKhoan_id,ten_SP,  gia, giohang.so_luong AS so_luong,  TaiKhoan_id, giohang.createdAt\r\n"
                    + //
                    "FROM giohang\r\n" + //
                    "JOIN sanpham ON giohang.SanPham_id = sanpham.id\r\n" + //
                    "JOIN taikhoan ON giohang.TaiKhoan_id = taikhoan.id\r\n" + //
                    "WHERE TaiKhoan_id = ?\r\n" + //
                    "GROUP BY ten_SP";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, user_id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("ten_SP");
                Float price = rs.getFloat("gia");
                int quantity = rs.getInt("so_luong");
                int account_id = rs.getInt("TaiKhoan_id");
                ProductDTO product = new ProductDTO(product_name, price);
                list_cart.add(new CartDTO(id, product, quantity, account_id));
            }
            return list_cart;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;

    }

    public static CartDTO getCartByProductId(int product_id, int id_account) {
        CartDTO cart = null;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "select * from giohang where SanPham_id = ? and TaiKhoan_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, product_id);
            pst.setInt(2, id_account);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int account_id = rs.getInt("TaiKhoan_id");
                int productId = rs.getInt("SanPham_id");
                int quantity = rs.getInt("so_luong");
                cart = new CartDTO(id, quantity, productId, account_id);
            }
            return cart;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    // public static void main(String[] args) {
    // ArrayList<CartDTO> list = getCartByAccountId(1);
    // for (CartDTO cartDTO : list) {
    // System.out.println(cartDTO.getProduct().getProduct_name());
    // }
    // }
}
