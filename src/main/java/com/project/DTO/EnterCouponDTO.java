package com.project.DTO;

import java.time.LocalDateTime;

public class EnterCouponDTO {
    private int id;
    private String nameEnterCoupon;
    private String nameEmployee;
    private String nameSupplier;
    private float totalValues;
    private LocalDateTime createdAt;

    public EnterCouponDTO(
            int id,
            String nameEnterCoupon,
            String nameEmployee,
            String nameSupplier,
            float totalValues,
            LocalDateTime createdAt) {
        this.id = id;
        this.nameEnterCoupon = nameEnterCoupon;
        this.nameEmployee = nameEmployee;
        this.nameSupplier = nameSupplier;
        this.totalValues = totalValues;
        this.createdAt = createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNameEnterCoupon(String nameEnterCoupon) {
        this.nameEnterCoupon = nameEnterCoupon;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public void setTotalValues(float totalValues) {
        this.totalValues = totalValues;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public String getNameEnterCoupon() {
        return nameEnterCoupon;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public float getTotalValues() {
        return totalValues;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}