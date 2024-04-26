package com.project.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable;

import com.project.DTO.AccountDTO;

public class AccountDAO {
    public static ArrayList<AccountDTO> getAllUser( )
    {
        ArrayList<AccountDTO> listAccount = new ArrayList<AccountDTO>();
        try {
            Connection con = mysqlConnect.getConnection();
            String sql = "SELECT tk.id, tk.email, tk.createdAt, tk.updatedAt, q.ten_quyen " +
                     "FROM TaiKhoan tk " +
                     "JOIN Quyen q ON tk.Quyen_id = q.id " +
                     "WHERE  tk.is_active = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while(result.next()){
                int id=result.getInt("id");
                String email=result.getString("email");
                String role=result.getString("ten_quyen");
                LocalDateTime createdAt = result.getTimestamp("createdAt").toLocalDateTime();
                LocalDateTime updatedAt = result.getTimestamp("updatedAt").toLocalDateTime();
                 listAccount.add(new AccountDTO(id,email,role,createdAt,updatedAt));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listAccount;
    }    

    public static AccountDTO getUser(AccountDTO account)
    {
        try {
            Connection con = mysqlConnect.getConnection();
            String sql = "SELECT * FROM TaiKhoan WHERE is_active =1";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, account.getEmail());
            ResultSet result = pst.executeQuery();
            AccountDTO accountDTO= null;
            while(result.next()){
                int id=result.getInt("id");
                String email=result.getString("email");
                String password=result.getString("password");
                 accountDTO=new AccountDTO(id,email, password);
            }
            return accountDTO;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
    
    public static AccountDTO getUserByEmail(String email) {
        AccountDTO data =null;
        
        try {
                Connection con = mysqlConnect.getConnection();
                String sql ="SELECT * FROM TaiKhoan Where email=?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1,email);
                ResultSet result =pst.executeQuery();
                while(result.next()) {
                    // int id= result.getInt("id");
                    String mail = result.getString("email");
                    String password = result.getString("password");
                    data = new AccountDTO(mail, password);
                }
                con.close(); // Đóng kết nối sau khi sử dụng
                 return data;
               } catch (Exception e) {
                e.printStackTrace();
                return null;
               }
    }

    
   
    public static boolean addUser(AccountDTO account) {
        try {
            Connection con = mysqlConnect.getConnection();
            String insertQuery = "INSERT INTO TaiKhoan (email, password, Quyen_id) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, account.getEmail());
            pst.setString(2, account.getPassword());
            pst.setInt(3, 1);
            
            int affectedRows = pst.executeUpdate();
    
            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }
    
            try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int taiKhoanId = generatedKeys.getInt(1); // Lấy ID của tài khoản mới thêm vào
                    String insertQuery1 = "INSERT INTO NhanVien (ho_va_ten, sdt, TaiKhoan_id) VALUES (?, ?, ?)";
                    PreparedStatement pst1 = con.prepareStatement(insertQuery1);
                    pst1.setString(1, account.getHoten());
                    pst1.setString(2, account.getPhone());
                    pst1.setInt(3, taiKhoanId); // Sử dụng ID của tài khoản mới thêm vào
                    int affectedRows1 = pst1.executeUpdate();
    
                    if (affectedRows1 == 0) {
                        throw new SQLException("Creating employee failed, no rows affected.");
                    }
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Return -1 if insertion fails
    }
    
    
    // public static Boolean addUser(AccountDTO account)
    // {
        
    //     try {
    //         Connection con = mysqlConnect.getConnection();
    //         String insertQuery = "INSERT INTO TaiKhoan (email,password,Quyen_id) VALUES(?,?,?)";
    //         PreparedStatement pst =con.prepareStatement(insertQuery);
    //         pst.setString(1, account.getEmail());
    //         pst.setString(2,account.getPassword());
    //         pst.setInt(3,1);
    //         int a= pst.executeUpdate();
    //         if(a>0)
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //         e.printStackTrace();
    //         return false;
    //     }

        

    // }
    
    public static boolean deleteUser(int id)
    {
        Connection con = mysqlConnect.getConnection();
        String deleteQuery = "UPDATE TaiKhoan SET is_active =? where id =?";
        if (con != null){
        try {
            PreparedStatement pst =con.prepareStatement(deleteQuery);
            pst.setInt(1,0);
            pst.setInt(2, id);
             int a=pst.executeUpdate();
             if(a>0)
            {
                System.out.println("Thành công");
                return true;
            }
            else
            {
                System.out.println("Thất bại!!");
                return false;
            }
        
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        
        }

        }
        return false;

    }
    
    public static AccountDTO updateUser(AccountDTO account)
    {
        Connection con = mysqlConnect.getConnection();
        String updateQuery = "UPDATE TaiKhoan (email,password,Quyen_id) VALUES(?,?,?)";
        if (con != null){
        try {
            PreparedStatement pst =con.prepareStatement(updateQuery);
            pst.setString(1, account.getEmail());
            pst.setString(2,account.getPassword());
            pst.setInt(3,1);
             int a=pst.executeUpdate();
             if(a>0)
            {
                System.out.println("Thành công");
            }
            else
            {
                System.out.println("Thất bại!!");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        }
        return account;
    }
    public static ArrayList<AccountDTO> searchAccount(String search_acc) {
        ArrayList<AccountDTO> listAccount = new ArrayList<>();

        try {

            Connection conn = mysqlConnect.getConnection();

            String sql = "SELECT " +
                "tk.id, " +
                "tk.email, " +
                "tk.createdAt, " +
                "tk.updatedAt, " +
                "q.ten_quyen " +
            "FROM " +
                "TaiKhoan tk " +
            "JOIN " +
                "Quyen q ON tk.Quyen_id = q.id " +
            "WHERE " +
                "tk.is_active = 1 AND tk.email LIKE ?";


            PreparedStatement pst = conn.prepareStatement(sql);

           pst.setString(1, search_acc+"%");

            ResultSet result_query = pst.executeQuery();

            while(result_query.next()){
                int id=result_query.getInt("id");
                String email=result_query.getString("email");
                String role=result_query.getString("ten_quyen");
                LocalDateTime createdAt = result_query.getTimestamp("createdAt").toLocalDateTime();
                LocalDateTime updatedAt = result_query.getTimestamp("updatedAt").toLocalDateTime();
                 listAccount.add(new AccountDTO(id,email,role,createdAt,updatedAt));
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listAccount;
    }


    public static void main(String[] args) {
      
    }
}



