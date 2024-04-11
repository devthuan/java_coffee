
package com.project.DTO;

public class WareHouse {
    private int id;
    private String name;
    private String unit;
    private int quantity;
    private double price;
    private int id_invoice;
    private int id_supplier;
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
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public int getIdInvoice()
    {
        return id_invoice;
    }
    public void setIdInvoice(int id_invoice)
    {
        this.id_invoice = id_invoice;
    }
    public int getIdSupplier()
    {
        return id_supplier;
    }
    public void setIdSupplier(int id_supplier)
    {
        this.id_supplier = id_supplier;
    }
}

