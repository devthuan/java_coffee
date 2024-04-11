package com.project.DTO;

public class OrderDTO {
    private int id;
    private String order_status;
    private String created_date;
    private int paymentMethod_id;
    private int acount_id;
    
    public OrderDTO(int id, String order_status, String created_date, int paymentMethod_id, int acount_id) {
        this.id = id;
        this.order_status = order_status;
        this.created_date = created_date;
        this.paymentMethod_id = paymentMethod_id;
        this.acount_id = acount_id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getOrder_status() {
        return order_status;
    }
    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }
    public String getCreated_date() {
        return created_date;
    }
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
    public int getPaymentMethod_id() {
        return paymentMethod_id;
    }
    public void setPaymentMethod_id(int paymentMethod_id) {
        this.paymentMethod_id = paymentMethod_id;
    }
    public int getAcount_id() {
        return acount_id;
    }
    public void setAcount_id(int acount_id) {
        this.acount_id = acount_id;
    }


    
}
