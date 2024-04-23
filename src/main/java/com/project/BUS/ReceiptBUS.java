package com.project.BUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.mysql.cj.jdbc.result.UpdatableResultSet;
import com.project.DAO.ReceiptDAO;
import com.project.DTO.DetailEnterCouponDTO;
import com.project.DTO.EnterCouponDTO;

public class ReceiptBUS {

    public static Boolean createdEnterCoupon(EnterCouponDTO enterCoupon, ArrayList<DetailEnterCouponDTO> new_detail) {

        Boolean check = ReceiptDAO.createEnterCoupon(enterCoupon, new_detail);

        if (check) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "có lỗi xảy ra.");
            return false;
        }

    }

    public static ArrayList<EnterCouponDTO> getAllEnterCouponsBUS() {
        ArrayList<EnterCouponDTO> allEnterCoupons = ReceiptDAO.getAllEnterCoupon();
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<EnterCouponDTO> searchEnterCouponsByNameBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = ReceiptDAO.SearchEnterCouponByName(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<EnterCouponDTO> searchEnterCouponsBySupplierBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = ReceiptDAO.SearchEnterCouponBySupplier(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<EnterCouponDTO> searchEnterCouponsByEmployeeBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = ReceiptDAO.SearchEnterCouponByEmployee(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<EnterCouponDTO> searchReceiptAdvanced(String startTime, String endTime,
            int startTotalReceipt, int endTotalReceipt) {

        ArrayList<EnterCouponDTO> allEnterCoupons = null;
        if ((startTime != null || endTime != null) && (startTotalReceipt == -1 || endTotalReceipt == -1)) {
           
            allEnterCoupons = ReceiptDAO.searchEnterCouponByDay(startTime, endTime);

        }
        if ((startTime == null || endTime == null) && (startTotalReceipt != -1 || endTotalReceipt != -1)) {
           
            allEnterCoupons = ReceiptDAO.searchEnterCouponByTotalReceipt(startTotalReceipt, endTotalReceipt);

        }

        if ((startTime != null || endTime != null) && (startTotalReceipt != -1 || endTotalReceipt != -1)) {
            
            allEnterCoupons = ReceiptDAO.searchEnterCouponByTotalReceiptAndDate(startTime, endTime, startTotalReceipt, endTotalReceipt);
        }

       

        if (allEnterCoupons == null) {
        return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<DetailEnterCouponDTO> getDetailEnterCoupon(int id) {
        return ReceiptDAO.getDetailEnterCoupon(id);
    }

    public static Boolean removeEnterCouponBUS(int id) {
        return ReceiptDAO.removeEnterCoupon(id);
    }

    public static void main(String[] args) {
        // ArrayList<EnterCouponDTO> a = searchReceiptAdvanced("2024-04-14",
        // "2024-04-20", -1, -1);
        ArrayList<EnterCouponDTO> a = searchReceiptAdvanced("2024-04-15", "2024-04-23", 1, 123132);

        for (EnterCouponDTO enterCouponDTO : a) {
        System.out.println(enterCouponDTO.getId());
        System.out.println(enterCouponDTO.getNameEnterCoupon());
        System.out.println(enterCouponDTO.getNameEmployee());
        System.out.println(enterCouponDTO.getNameSupplier());
        System.out.println(enterCouponDTO.getTotalValues());
        System.out.println(enterCouponDTO.getCreatedAt());
        }
    }

}
