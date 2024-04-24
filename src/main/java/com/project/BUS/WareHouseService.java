
package com.project.BUS;
import com.project.DAO.*;
import com.project.DTO.*;
import java.util.List;
public class WareHouseService {
    WareHouseDao warehousedao;
    public WareHouseService()
    {
        warehousedao = new WareHouseDao();
    }
    public List<WareHouse> getAllWareHouse() throws Exception
    {
        return warehousedao.getAllWareHouse();
    }
    public void AddWareHouse(WareHouse warehouse) throws Exception
    {
        warehousedao.AddWareHouse(warehouse);
    }
    public void updateWareHouse(WareHouse warehouse) throws Exception
    {
        warehousedao.UpdateWareHouse(warehouse);
    }
    public WareHouse getNameWareHouse(String name) throws Exception 
    {
        return warehousedao.getNameWareHouse(name);
    }
    public void deleteWareHouse(int id) throws Exception
    {
        warehousedao.deleteWareHouse(id);
    }
    public List<WareHouse> searchAllWareHouseById(int id) throws Exception
    {
        return warehousedao.searchAllWareHouseById(id);
    }
    public List<WareHouse> searchAllWareHouseByName(String name) throws Exception
    {
        return warehousedao.searchAllWareHouseByName(name);
    }
    public WareHouse getIdWareHouse(int id) throws Exception 
    {
        return warehousedao.getIdWareHouse(id);
    }
    public void updateNameWareHouse(WareHouse warehouse) throws Exception 
    {
        warehousedao.updateNameWareHouse(warehouse);
    }
}
