
package com.project.DAO;
import com.project.DTO.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SupplierDao {
    public List<Supplier> getAllSupplier()
    {
        List<Supplier> suppliers = new ArrayList<Supplier>();
        try 
        {
            Connection connection = mysqlConnect.getConnection();
            String sql = "SELECT * FROM NhaCungCap";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Supplier supplier = new Supplier();
                supplier.setId(rs.getInt("id"));
                supplier.setName(rs.getString("ten_ncc"));
                supplier.setAddress(rs.getString("dia_chi"));
                supplier.setPhone(rs.getString("dien_thoai"));
                supplier.setEmail(rs.getString("email"));
                supplier.setIsActive(rs.getInt("is_active"));
                supplier.setCreateDate(rs.getTimestamp("createdAt"));
                supplier.setUpdateDate(rs.getTimestamp("updatedAt"));
                suppliers.add(supplier);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return suppliers;

    }
    public Supplier getNameSupplier(String name) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhaCungCap WHERE ten_ncc = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Supplier supplier = new Supplier();
            supplier.setId(rs.getInt("id"));
            supplier.setName(rs.getString("ten_ncc"));
            supplier.setAddress(rs.getString("dia_chi"));
            supplier.setPhone(rs.getString("dien_thoai"));
            supplier.setEmail(rs.getString("email"));
            supplier.setIsActive(rs.getInt("is_active"));
            supplier.setCreateDate(rs.getTimestamp("createdAt"));
            supplier.setUpdateDate(rs.getTimestamp("updatedAt"));
            return supplier;
        }
        return null;
    }
}
