package com.project.BUS;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import com.project.Common.PasswordHasher;
import com.project.DAO.AccountDAO;
import com.project.DTO.AccountDTO;
import com.project.DTO.PermissionAccount;

public class AccountBUS {

    public static Boolean login(AccountDTO acc) {

        AccountDTO accDAO = AccountDAO.getUserByEmail(acc.getEmail());
        if (accDAO == null) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
            return false;
        }

        if (PasswordHasher.checkPassword(acc.getPassword(), accDAO.getPassword())) {
            HashMap<String, Boolean> list_permission = AccountDAO.getAllFunction(accDAO.getRoleId());

            // Thiết lập dữ liệu quyền cho PermissionAccount
            PermissionAccount permissionAccount = PermissionAccount.getInstance();
            permissionAccount.setPermissionData(accDAO.getId(), accDAO.getRoleId(),
                    accDAO.getRole(), list_permission);

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác");

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

    public static boolean createAccountBUS(AccountDTO new_account) {
        String hashingPassword = PasswordHasher.hashPassword(new_account.getPassword());
        new_account.setPassword(hashingPassword);
        return AccountDAO.addUser(new_account);
    }

    public static ArrayList<AccountDTO> getAllAccount() {
        return AccountDAO.getAllUser();
    }

    public static ArrayList<AccountDTO> getAllAccount(ArrayList<Integer> accountID_List)
    {
        return AccountDAO.getAllUser(accountID_List);
    }

    public static Boolean deleteUser(int id) {
        try {
            return AccountDAO.deleteUser(id);
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public static ArrayList<AccountDTO> searchAccount(String email) {
        return AccountDAO.searchAccount(email);
    }

    public static AccountDTO getAccountByAccountID(int accountID) {
        return AccountDAO.getAccountByAccountID(accountID);
    }

    public static boolean updateUserBUS(AccountDTO account) {
        return AccountDAO.updateUser(account);
    }

    public ArrayList<AccountDTO> getAll_unused(int role_id) {
        return AccountDAO.getAll_unused(role_id);
    }

    public static AccountDTO getDetailAccountBUS(int id) {
        return AccountDAO.getDetailAccount(id);
    }

    public static boolean changePassword(int accountId, String oldPassword, String newPassword) {
        AccountDTO acc = AccountDAO.getUserById(accountId);

        if (PasswordHasher.checkPassword(oldPassword, acc.getPassword())) {
            String hashedPassword = PasswordHasher.hashPassword(newPassword);
            acc.setPassword(hashedPassword);
            return AccountDAO.changePassword(acc);
        } else {
            JOptionPane.showMessageDialog(null, "Mật khẩu sai");
            return false;
        }
    }

    public static void main(String[] args) {
        AccountBUS.login(new AccountDTO("admin@example.com", "admin"));

    }
}
