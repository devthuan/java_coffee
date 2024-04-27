package com.project.BUS;

import com.project.DAO.EmployeeDAO;
import com.project.DTO.EmployeeDTO;

public class EmployeeBUS {
    public EmployeeDAO employeeDAO;

    public EmployeeBUS() {
        this.employeeDAO = new EmployeeDAO();
    }

    public EmployeeDTO getEmpByAccountID(int accountID) {
        EmployeeDTO emp = null;
        try {
            emp = employeeDAO.getEmpByAcountID(accountID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
}
