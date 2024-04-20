
package com.project.DAO;
import com.itextpdf.text.pdf.PdfName;
import com.project.DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class WareHouseDao {
    public List<WareHouse> getAllWareHouse() throws Exception
    {
        Connection connect = mysqlConnect.getConnection();
        List<WareHouse> warehouses = new ArrayList<WareHouse>();
        String sql = "SELECT * FROM NguyenLieu WHERE is_active = 1";
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
            warehouse.setCreateDate(rs.getTimestamp("created_date"));
            warehouse.setUpdateDate(rs.getDate("updatedAt"));
            warehouses.add(warehouse);
        }
        return warehouses;
    }
    public void AddWareHouse(WareHouse warehouse) throws Exception
    {
        Connection connection = mysqlConnect.getConnection();
        String sql = "INSERT INTO NguyenLieu(ten_NL, don_vi, so_luong) VALUES(?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, warehouse.getName());
        ps.setString(2, warehouse.getUnit());
        ps.setInt(3, warehouse.getQuantity());
        ps.executeUpdate();
    }
    public void UpdateWareHouse(WareHouse warehouse) throws Exception
    {
        Connection connection = mysqlConnect.getConnection();
        String sql = "UPDATE NguyenLieu SET so_luong = ? WHERE ten_NL = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, warehouse.getQuantity());
        ps.setString(2, warehouse.getName());
        ps.executeUpdate();
    }
    public WareHouse getNameWareHouse(String name)  throws Exception
    {
        Connection connection = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NguyenLieu WHERE ten_NL = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            WareHouse warehouse = new WareHouse();
            warehouse.setId(rs.getInt("id"));
            warehouse.setName(rs.getString("ten_NL"));
            warehouse.setUnit(rs.getString("don_vi"));
            warehouse.setQuantity(rs.getInt("so_luong"));
            return warehouse;
        }
        return null;
    }
    public void deleteWareHouse(int id) throws SQLException
    {
        Connection connection = mysqlConnect.getConnection();
        String sql = "UPDATE NguyenLieu SET is_active = 0 WHERE id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    public List<WareHouse> searchAllWareHouseById(int id) throws Exception 
    {
        List<WareHouse> warehouses = new ArrayList<WareHouse>();
        Connection connection = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NguyenLieu WHERE is_active = 1 AND id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            WareHouse warehouse = new WareHouse();
            warehouse.setId(rs.getInt("id"));
            warehouse.setName(rs.getString("ten_NL"));
            warehouse.setUnit(rs.getString("don_vi"));
            warehouse.setQuantity(rs.getInt("so_luong"));
            warehouse.setISAcctive(rs.getInt("is_active"));
            warehouse.setCreateDate(rs.getTimestamp("created_date"));
            warehouse.setUpdateDate(rs.getTimestamp("updatedAt"));
            warehouses.add(warehouse);
        }
        return warehouses;
    }
    public List<WareHouse> searchAllWareHouseByName(String name) throws Exception 
    {
        List<WareHouse> warehouses = new ArrayList<WareHouse>();
        Connection connection = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NguyenLieu WHERE is_active = 1 AND ten_NL LIKE '%" + name + "%' ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            WareHouse warehouse = new WareHouse();
            warehouse.setId(rs.getInt("id"));
            warehouse.setName(rs.getString("ten_NL"));
            warehouse.setUnit(rs.getString("don_vi"));
            warehouse.setQuantity(rs.getInt("so_luong"));
            warehouse.setISAcctive(rs.getInt("is_active"));
            warehouse.setCreateDate(rs.getTimestamp("created_date"));
            warehouse.setUpdateDate(rs.getTimestamp("updatedAt"));
            warehouses.add(warehouse);
        }
        return warehouses;
    }
}
