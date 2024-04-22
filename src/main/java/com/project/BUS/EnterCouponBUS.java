package com.project.BUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.mysql.cj.jdbc.result.UpdatableResultSet;
import com.project.DAO.EnterCouponDAO;
import com.project.DTO.DetailEnterCouponDTO;
import com.project.DTO.EnterCouponDTO;

public class EnterCouponBUS {

    public static Boolean createdEnterCoupon(EnterCouponDTO enterCoupon, ArrayList<DetailEnterCouponDTO> new_detail) {
       

        Boolean check = EnterCouponDAO.createEnterCoupon(enterCoupon, new_detail);

        if (check) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "có lỗi xảy ra.");
            return false;
        }

       

    }

    public static ArrayList<EnterCouponDTO> getAllEnterCouponsBUS() {
        ArrayList<EnterCouponDTO> allEnterCoupons = EnterCouponDAO.getAllEnterCoupon();
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<EnterCouponDTO> searchEnterCouponsByNameBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = EnterCouponDAO.SearchEnterCouponByName(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }
    public static ArrayList<EnterCouponDTO> searchEnterCouponsBySupplierBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = EnterCouponDAO.SearchEnterCouponBySupplier(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }
    public static ArrayList<EnterCouponDTO> searchEnterCouponsByEmployeeBUS(String keyword) {
        ArrayList<EnterCouponDTO> allEnterCoupons = EnterCouponDAO.SearchEnterCouponByEmployee(keyword);
        if (allEnterCoupons == null) {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra!");
            return null;
        }
        return allEnterCoupons;
    }

    public static ArrayList<DetailEnterCouponDTO> getDetailEnterCoupon(int id) {
        return EnterCouponDAO.getDetailEnterCoupon(id);
    }

    

    public static Boolean removeEnterCouponBUS(int id) {
        return EnterCouponDAO.removeEnterCoupon(id);
    }

    public static void main(String[] args) {
        ArrayList<EnterCouponDTO> a =  searchEnterCouponsByNameBUS("P");

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
