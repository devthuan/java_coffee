package com.project.BUS;

import java.util.ArrayList;

import com.project.DAO.SupplierDao;
import com.project.DTO.SupplierDTO;

public class SupplierBUS {

    public static Boolean createdSupplier(SupplierDTO supplier) {
        try {
            Boolean result = SupplierDao.createSupplier(supplier);
            return result;
        } catch (Exception e) {
            return false;
        }
    }

    public static ArrayList<SupplierDTO> get_all_supplier() {
        try {
            ArrayList<SupplierDTO> list_supplier = SupplierDao.get_all_supplier();
            if (list_supplier == null) {
                return null;
            }
            return list_supplier;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

    }

    public static Boolean updateSupplier(SupplierDTO supplier) {
        try {

            return SupplierDao.updateSupplier(supplier);
        } catch (Exception e) {
            return false;
        }
    }

    public static Boolean removeSupplier(int id) {
        try {

            return SupplierDao.ChangeIsActiveSupplier(id, false);
        } catch (Exception e) {
            return false;
        }
    }

    public static ArrayList<SupplierDTO> searchSupplierByNameBUS(String search_supplier) {
        try {
            ArrayList<SupplierDTO> list_supplier = SupplierDao.SearchSupplierByName(search_supplier);
            if (list_supplier == null) {
                return null;
            }
            return list_supplier;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

    }

    public static ArrayList<SupplierDTO> searchSupplierByEmailBUS(String search_supplier) {
        try {
            ArrayList<SupplierDTO> list_supplier = SupplierDao.SearchSupplierByEmail(search_supplier);
            if (list_supplier == null) {
                return null;
            }
            return list_supplier;
        } catch (Exception e) {
            // TODO: handle exception
            return null;
        }

    }

}
