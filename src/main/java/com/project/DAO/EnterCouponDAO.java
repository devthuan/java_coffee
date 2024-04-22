package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.project.DTO.DetailEnterCouponDTO;
import com.project.DTO.EnterCouponDTO;

public class EnterCouponDAO {
    public static ArrayList<EnterCouponDTO> getAllEnterCoupon() {
        ArrayList<EnterCouponDTO> list_EnterCoupon = new ArrayList<>();
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "SELECT " +
                    "pn.id, " +
                    "ten_phieu_nhap, " +
                    "ho_va_ten, " +
                    "ten_ncc, " +
                    "SUM(distinct ctpn.so_luong * ctpn.don_gia) AS total, " +
                    "pn.createdAt " +
                    "FROM PhieuNhap pn " +
                    "left JOIN ChiTietPhieuNhap ctpn ON pn.id = ctpn.PhieuNhap_id " +
                    "JOIN NhaCungCap ON pn.NhaCungCap_id = NhaCungCap.id " +
                    "JOIN TaiKhoan ON TaiKhoan.id = pn.TaiKhoan_id " +
                    "left JOIN NhanVien ON NhanVien.TaiKhoan_id = TaiKhoan.id " +
                    "Where pn.is_active = 1 " +
                    "GROUP BY pn.id";

            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String nameEnterCoupon = result.getString("ten_phieu_nhap");
                String nameEmployee = result.getString("ho_va_ten");
                String nameSupplier = result.getString("ten_ncc");
                float totalValues = result.getFloat("total");
                Timestamp createdAt = result.getTimestamp("createdAt");
                LocalDateTime formateCreatedAt = createdAt.toLocalDateTime();
                list_EnterCoupon.add(new EnterCouponDTO(id, nameEnterCoupon, nameEmployee, nameSupplier, totalValues,
                        formateCreatedAt));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list_EnterCoupon;
    }

    public static ArrayList<DetailEnterCouponDTO> getDetailEnterCoupon(int idEnterCoupon) {
        ArrayList<DetailEnterCouponDTO> list_detail = new ArrayList<>();
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "SELECT " +
                    "ctpn.id, " +
                    "ten_NL, " +
                    "don_gia, " +
                    "ctpn.so_luong, " +
                    "SUM(ctpn.so_luong * don_gia) AS tong_tien " +
                    "FROM ChiTietPhieuNhap ctpn " +
                    "JOIN NguyenLieu nl ON nl.id = ctpn.NguyenLieu_id " +
                    "WHERE PhieuNhap_id = ? " +
                    "GROUP BY ctpn.id";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, idEnterCoupon);
            ResultSet result = pst.executeQuery();
            while (result.next()) {
                int id = result.getInt("id");
                String nameEnterCoupon = result.getString("ten_NL");
                float nameEmployee = result.getFloat("don_gia");
                int nameSupplier = result.getInt("so_luong");
                float totalValues = result.getFloat("tong_tien");
                list_detail.add(new DetailEnterCouponDTO(id, nameEnterCoupon, nameEmployee, nameSupplier, totalValues));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list_detail;
    }



    
    public static void main(String[] args) {
        ArrayList<DetailEnterCouponDTO> list_EnterCoupon = getDetailEnterCoupon(1);

        for (DetailEnterCouponDTO enterCouponDTO : list_EnterCoupon) {
            System.out.println(enterCouponDTO.getId());
            System.out.println(enterCouponDTO.getNameIngredient());
            System.out.println(enterCouponDTO.getPrice());
        }
    }
}
