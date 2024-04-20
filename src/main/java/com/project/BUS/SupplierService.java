
package com.project.BUS;
import com.project.DAO.*;
import com.project.DTO.*;
import java.util.List;
public class SupplierService {
    SupplierDao supplierDao;
    public SupplierService()
    {
        supplierDao = new SupplierDao();
    }
    public List<Supplier> getAllSupplier() throws Exception
    {
        return supplierDao.getAllSupplier();
    }
    public Supplier getNameSupplier(String name) throws Exception
    {
        return supplierDao.getNameSupplier(name);
    }
}
