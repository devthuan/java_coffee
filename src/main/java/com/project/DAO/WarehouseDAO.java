package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.project.DTO.WareHouseDTO;

public class WarehouseDAO {
    public static ArrayList<WareHouseDTO> get_all_ingredients() {
        ArrayList<WareHouseDTO> list_ingredient = new ArrayList<WareHouseDTO>();
        try {
            Connection conn = mysqlConnect.getConnection();
            String sql = "Select * from NguyenLieu";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("ten_NL");

                list_ingredient.add(new WareHouseDTO(id, name));
            }

        } catch (Exception e) {
            return null;
        }
        return list_ingredient;
    }

    public static void main(String[] args) {
          ArrayList<WareHouseDTO> list_ingredient = get_all_ingredients();

          for (WareHouseDTO wareHouseDTO : list_ingredient) {
            System.out.println(wareHouseDTO.getName());
          }
    }
}
