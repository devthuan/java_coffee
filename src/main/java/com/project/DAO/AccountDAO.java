package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.project.DTO.AccountDTO;

public class AccountDAO {
    public ArrayList<AccountDTO> getAll_unused(int role_id) {
        ArrayList<AccountDTO> accounts = null;
        try {
            Connection conn = mysqlConnect.getConnection();

            String sql = "Select * from TaiKhoan where Quyen_id = ? ANd id NOT IN (Select TaiKhoan_id from NhanVien)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, role_id);
            ResultSet rs = pst.executeQuery();

            accounts = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                int roleID = rs.getInt("Quyen_id");
                accounts.add(new AccountDTO(id, email, roleID));
            }
            mysqlConnect.closeConnection(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accounts;
    }
}
