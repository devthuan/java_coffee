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
                String sql = "insert into cart (product_id,quantity, account_id)  values (?, ?, ?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setInt(1, cart.getProduct_id());
                pst.setInt(2, cart.getQuantity());
                pst.setInt(3, cart.getAccount_id());
                result = pst.executeUpdate();

                if (result > 0) {
                    return true;
                }

            } else {
                String sql = "update cart set quantity = ?  where id = ?";
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
            String sql = "update cart set quantity = ? where id = ?";
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
            String sql = "delete from cart where id = ?";
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
            String sql = "SELECT cart.id, product_id, account_id,product_name,  price, quantity,  account_id, cart.created_date\r\n"
                    + //
                    "FROM cart\r\n" + //
                    "JOIN products ON cart.product_id = products.id\r\n" + //
                    "JOIN account ON cart.account_id = account.id\r\n" + //
                    "WHERE account_id = ?\r\n" + //
                    "GROUP BY product_name";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, user_id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String product_name = rs.getString("product_name");
                Float price = rs.getFloat("price");
                int quantity = rs.getInt("quantity");
                int account_id = rs.getInt("account_id");
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
            String sql = "select * from cart where product_id = ? and account_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, product_id);
            pst.setInt(2, id_account);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int account_id = rs.getInt("account_id");
                int productId = rs.getInt("product_id");
                int quantity = rs.getInt("quantity");
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
