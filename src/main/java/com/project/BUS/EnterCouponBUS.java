package com.project.BUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.project.DAO.EnterCouponDAO;
import com.project.DTO.DetailEnterCouponDTO;
import com.project.DTO.EnterCouponDTO;

public class EnterCouponBUS {
    public static ArrayList<EnterCouponDTO> getAllEnterCouponsBUS() {
        ArrayList<EnterCouponDTO> allEnterCoupons = EnterCouponDAO.getAllEnterCoupon();
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<DetailEnterCouponDTO> getDetailEnterCoupon(int id) {
        return EnterCouponDAO.getDetailEnterCoupon(id);
    }
}
