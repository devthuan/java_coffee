

package com.project.DTO;

import java.util.Date;

public class WareHouse {
    private int id;
    private String name;
    private String unit;
    private int quantity;
    private int is_active;
    private Date create_date;
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
    private Date getCreateDate()
    {
        return create_date;
    }
    private void setCreateDate(Date create_date)
    {
        this.create_date = create_date;
    }
}

