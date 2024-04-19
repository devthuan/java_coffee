
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
}
