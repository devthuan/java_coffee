package com.project.DAO;

import com.project.DTO.*;
import com.project.BUS.*;
import com.project.GUI.*;
import java.security.spec.PSSParameterSpec;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> getAllUser() throws Exception {
        List<User> users = new ArrayList<User>();
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhanVien";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("ho_va_ten"));
            user.setDate(rs.getDate("ngay_sinh"));
            user.setAddress(rs.getString("dia_chi"));
            user.setPosition(rs.getString("chuc_vu"));
            user.setPhone(rs.getString("sdt"));
            user.setSalary(rs.getFloat("luong"));
            user.setDateCreate(rs.getTimestamp("createdAt"));
            user.setAccountId(rs.getInt("TaiKhoan_id"));
            users.add(user);
        }
        return users;
    }

    public void addUser(User user) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "INSERT INTO NhanVien( ho_va_ten, ngay_sinh, dia_chi, chuc_vu, sdt, luong, TaiKhoan_id) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setDate(2, new java.sql.Date(user.getDate().getTime()));
        ps.setString(3, user.getAddress());
        ps.setString(4, user.getPosition());
        ps.setString(5, user.getPhone());
        ps.setFloat(6, user.getSalary());
        ps.setInt(7, user.getAccountId());
        ps.executeUpdate();
    }

    public void deleteUser(int id) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "DELETE FROM NhanVien WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public void updateUser(User user) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "UPDATE NhanVien  SET ho_va_ten = ?, ngay_sinh = ?, dia_chi = ?, chuc_vu = ?, sdt = ?, luong = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ps.setDate(2, new java.sql.Date(user.getDate().getTime()));
        ps.setString(3, user.getAddress());
        ps.setString(4, user.getPosition());
        ps.setString(5, user.getPhone());
        ps.setDouble(6, user.getSalary());
        ps.setInt(7, user.getId());
        ps.executeUpdate();
    }

    public User getIdUser(int id) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhanVien WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("ho_va_ten"));
            user.setDate(rs.getDate("ngay_sinh"));
            user.setAddress(rs.getString("dia_chi"));
            user.setPosition(rs.getString("chuc_vu"));
            user.setPhone(rs.getString("sdt"));
            user.setSalary(rs.getFloat("luong"));
            user.setDateCreate(rs.getTimestamp("createdAt"));
            user.setAccountId(rs.getInt("TaiKhoan_id"));

            return user;
        }
        return null;
    }

    public List<User> SearchAllUserByName(String name) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhanVien WHERE ho_va_ten LIKE '%" + name + "%'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> users = new ArrayList<User>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("ho_va_ten"));
            java.sql.Date date = java.sql.Date.valueOf(rs.getString("ngay_sinh"));
            user.setDate(date);
            user.setAddress(rs.getString("dia_chi"));
            user.setPosition(rs.getString("chuc_vu"));
            user.setPhone(rs.getString("sdt"));
            user.setSalary(rs.getFloat("luong"));
            user.setDateCreate(rs.getTimestamp("createdAt"));
            user.setAccountId(rs.getInt("TaiKhoan_id"));
            users.add(user);
        }
        return users;
    }

    public List<User> SearchAllUserById(int id) throws Exception {
        List<User> users = new ArrayList<User>();
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhanVien WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("ho_va_ten"));
            java.sql.Date date = java.sql.Date.valueOf(rs.getString("ngay_sinh"));
            user.setDate(date);
            user.setAddress(rs.getString("dia_chi"));
            user.setPosition(rs.getString("chuc_vu"));
            user.setPhone(rs.getString("sdt"));
            user.setSalary(rs.getFloat("luong"));
            user.setDateCreate(rs.getTimestamp("createdAt"));
            user.setAccountId(rs.getInt("TaiKhoan_id"));
            users.add(user);
        }
        return users;
    }

    public List<User> SearchAllUserByPhone(String phone) throws Exception {
        Connection con = mysqlConnect.getConnection();
        String sql = "SELECT * FROM NhanVien WHERE sdt LIKE '%" + phone + "%'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<User> users = new ArrayList<User>();
        while (rs.next()) {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("ho_va_ten"));
            java.sql.Date date = java.sql.Date.valueOf(rs.getString("ngay_sinh"));
            user.setDate(date);
            user.setAddress(rs.getString("dia_chi"));
            user.setPosition(rs.getString("chuc_vu"));
            user.setPhone(rs.getString("sdt"));
            user.setSalary(rs.getFloat("luong"));
            user.setDateCreate(rs.getTimestamp("createdAt"));
            user.setAccountId(rs.getInt("TaiKhoan_id"));
            users.add(user);
        }
        return users;
    }
}
