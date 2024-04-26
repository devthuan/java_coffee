package com.project.DTO;

import java.time.LocalDateTime;

public class AccountDTO {
    private int id;
    private String email;
    private String password;
    private String hoten;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String role;
    

    public AccountDTO(int id,String email, String password){
        this.id = id;
        this.email = email;
        this.password = password;
    }
    public AccountDTO(int id,String email, String role, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id = id;
        this.email = email;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public AccountDTO(String email, String password){
        this.email = email;
        this.password = password;
    }
    public AccountDTO(String email, String password,String hoten,String phone){
        this.email = email;
        this.password = password;
        this.hoten = hoten;
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getRole() {
        return role;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void add(AccountDTO accountDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    public String getHoten() {
        return hoten;
    }
    public String getPhone() {
        return phone;
    }
    
}