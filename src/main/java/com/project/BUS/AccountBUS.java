package com.project.BUS;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.project.Common.PasswordHasher;
import com.project.DAO.AccountDAO;
import com.project.DTO.AccountDTO;

public class AccountBUS{
public static Boolean login(AccountDTO acc)
{
    
    AccountDTO accDAO= AccountDAO.getUserByEmail(acc.getEmail());
    if(accDAO==null) { 
        JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
        return false;
    }

    if(PasswordHasher.checkPassword(acc.getPassword(), accDAO.getPassword()))
    {
        return true;
    }else {

        return false;
    }

}
public static boolean signUp(AccountDTO account) {
    String hashedPassword = PasswordHasher.hashPassword(account.getPassword());

    account.setPassword(hashedPassword); // Cập nhật mật khẩu đã hash vào đối tượng tài khoản

    Boolean accDAO = AccountDAO.addUser(account);
    if (accDAO) {
        JOptionPane.showMessageDialog(null, "Đăng kí thành công");
        return true;
    } else {
        JOptionPane.showMessageDialog(null, "Đăng kí thất bại");
        return false;
    }
}
public static ArrayList<AccountDTO> getAllAccount()
{
    return AccountDAO.getAllUser();
}

public static Boolean deleteUser(int id)
{
    try {
        return AccountDAO.deleteUser(id);
    } catch (Exception e) {
        // TODO: handle exception
        return false;
    }
}
public static ArrayList<AccountDTO> searchAccount(String email)
{
    return AccountDAO.searchAccount(email);
}
public static void main(String[] args) {
    AccountBUS.login(new AccountDTO("admin@example.com", "admin"));
}
}
