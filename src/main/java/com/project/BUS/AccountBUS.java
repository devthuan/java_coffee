package com.project.BUS;

import java.util.ArrayList;

import com.project.DAO.AccountDAO;
import com.project.DTO.AccountDTO;

public class AccountBUS {
    private AccountDAO accountDAO;

    public AccountBUS() {
        this.accountDAO = new AccountDAO();
    }

    public ArrayList<AccountDTO> getAll_unused(int role_id) {
        return accountDAO.getAll_unused(role_id);
    }
}
