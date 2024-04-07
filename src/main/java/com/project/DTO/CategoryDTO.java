package com.project.DTO;

public class CategoryDTO {
    private int id;
    private String category_name;
    private int is_active;
    private String created_date;

    public CategoryDTO(int id, String category_name, int is_active, String created_date) {
        this.id = id;
        this.category_name = category_name;
        this.is_active = is_active;
        this.created_date = created_date;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory_name() {
        return category_name;
    }
    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
    public int getIs_active() {
        return is_active;
    }
    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }
    public String getCreated_date() {
        return created_date;
    }
    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }
    
}
