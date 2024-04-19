

package com.project.DTO;

import java.util.Date;

public class WareHouse {
    private int id;
    private String name;
    private String unit;
    private int quantity;
    private int is_active;
    private Date create_date;
    private Date update_date;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getUnit()
    {
        return unit;
    }
    public void setUnit(String unit)
    {
        this.unit = unit;
    }
    public void setString(String unit)
    {
        this.unit = unit;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
   
    public int getIsActive()
    {
        return is_active;
    }
    public void setISAcctive(int is_active)
    {
        this.is_active = is_active;
    }
    public Date getCreateDate()
    {
        return create_date;
    }
    public void setCreateDate(Date create_date)
    {
        this.create_date = create_date;
    }
    public void setUpdateDate(Date update_date)
    {
        this.update_date = update_date;
    }
    public Date getUpdateDate()
    {
        return update_date;
    }
}

