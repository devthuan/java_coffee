package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.DTO.OrderDTO;
import com.project.DTO.OrderDetailDTO;

public class OrderDAO {

    public boolean addOrder(OrderDTO order, ArrayList<OrderDetailDTO> orderDetails) {
        Connection conn = mysqlConnect.getConnection();
        try {
            conn.setAutoCommit(false);

            String sql = "Insert into HoaDon (trang_thai, PTThanhToan_id, TaiKhoan_id) Values(?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, order.getOrder_status());
            pst.setInt(2, order.getPaymentMethod_id());
            pst.setInt(3, order.getAcount_id());
            pst.executeUpdate();

            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int order_id = generatedKeys.getInt(1);
                    for (OrderDetailDTO o : orderDetails) {
                        sql = "Insert into ChiTietHoaDon (so_luong, SanPham_id, HoaDon_id) Values(?, ?, ?)";
                        pst = conn.prepareStatement(sql);
                        pst.setInt(1, o.getQuantity());
                        pst.setInt(2, o.getProduct_id());
                        pst.setInt(3, order_id);
                        pst.executeUpdate();
                    }
                } else {
                    throw new SQLException("Creating order failed, no ID obtained.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            conn.commit();
            conn.setAutoCommit(true);
            mysqlConnect.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                mysqlConnect.closeConnection(conn);
                e1.printStackTrace();
            }
        }
        return false;
    }
}
