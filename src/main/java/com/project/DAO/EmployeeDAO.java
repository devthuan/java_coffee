package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.project.DTO.EmployeeDTO;

public class EmployeeDAO {


    public static ArrayList<EmployeeDTO> get_all_employee() {
        ArrayList<EmployeeDTO> employees = new ArrayList<>();
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select * from NhanVien";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet result_query = pst.executeQuery();
            while (result_query.next()) {
                int id = result_query.getInt("id");
                String name = result_query.getString("ho_va_ten");
                int account_id = result_query.getInt("TaiKhoan_id");

                employees.add(new EmployeeDTO(id, name, account_id));
            }
        } catch (Exception e) {
            return null;
        }
        return employees;
    }


    public EmployeeDTO getEmpByAcountID(int accountID) {
        EmployeeDTO emp = null;
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select NV.* from NhanVien NV, TaiKhoan TK  WHERE TK.id = ? AND NV.TaiKhoan_id = TK.id";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, accountID);
            ResultSet result_query = pst.executeQuery();

            while (result_query.next()) {
                int id = result_query.getInt("id");
                String name = result_query.getString("ho_va_ten");
                int account_id = result_query.getInt("TaiKhoan_id");

                emp = new EmployeeDTO(id, name, account_id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return emp;
    }

}
