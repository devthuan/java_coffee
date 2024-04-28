package com.project.DTO;

import java.time.LocalDateTime;

public class AccountDTO {
    private int id;
    private String email;
    private int is_active;
    private LocalDateTime createdAt;
    private int roleID;
    private LocalDateTime updatedAt;

    public AccountDTO(int id, String email, int is_active, LocalDateTime createdAt, int roleID,
            LocalDateTime updatedAt) {
        this.id = id;
        this.email = email;
        this.is_active = is_active;
        this.createdAt = createdAt;
        this.roleID = roleID;
        this.updatedAt = updatedAt;
    }

    public AccountDTO(int id, String email, int roleID) {
        this.id = id;
        this.email = email;
        this.roleID = roleID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
