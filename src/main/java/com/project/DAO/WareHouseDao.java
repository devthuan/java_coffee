
package com.project.DAO;
import com.project.DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class WareHouseDao {
    public List<WareHouse> getAllWareHouse() throws Exception
    {
        Connection connect = mysqlConnect.getConnection();
        List<WareHouse> warehouses = new ArrayList<WareHouse>();
        String sql = "SELECT * FROM nguyenlieu";
        PreparedStatement ps = connect.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            WareHouse warehouse = new WareHouse();
            warehouse.setId(rs.getInt("id"));
            warehouse.setName(rs.getString("ten_NL"));
            warehouse.setUnit(rs.getString("don_vi"));
            warehouse.setQuantity(rs.getInt("so_luong"));
            warehouse.setISAcctive(rs.getInt("is_active"));
            warehouse.setCreateDate(rs.getDate("create_date"));
//            warehouse.setIdSupplier(rs.getInt("id_nhacungcap"));
            warehouses.add(warehouse);
        }
        return warehouses;
    }
    public void AddWareHouse(WareHouse warehouse) throws Exception
    {
        Connection connection = mysqlConnect.getConnection();
        String sql = "INSERT INTO nguyenlieu(ten_NL, don_vi, so_luong) VALUES(?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, warehouse.getName());
        ps.setString(2, warehouse.getUnit());
        ps.setInt(3, warehouse.getQuantity());
        ps.executeUpdate();
    }
}
