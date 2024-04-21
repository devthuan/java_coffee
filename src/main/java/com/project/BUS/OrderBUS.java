package com.project.BUS;

import java.util.ArrayList;

import com.project.DAO.OrderDAO;
import com.project.DAO.OrderDetailDAO;
import com.project.DTO.OrderDTO;
import com.project.DTO.OrderDetailDTO;

public class OrderBUS {
    private OrderDAO orderDAO;
    private OrderDetailDAO orderDetailDAO;

    public OrderBUS() {
        this.orderDAO = new OrderDAO();
        this.orderDetailDAO = new OrderDetailDAO();
    }

    public boolean addOrder(OrderDTO order, ArrayList<OrderDetailDTO> orderDetails) {
        try {
            return orderDAO.addOrder(order, orderDetails);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    public ArrayList<OrderDetailDTO> getByOrderID(int orderID) {
        try {
            return orderDetailDAO.getByOrderID(orderID);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return null;
    }
}
