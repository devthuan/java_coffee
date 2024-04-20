package com.project.BUS;
import com.project.DAO.*;
import com.project.DTO.*;
import com.project.GUI.*;
import java.util.List;
public class UserService {
    UserDao userdao;
    public UserService()
    {
        userdao = new UserDao();
    }
    public List<User> getAllUser() throws Exception
    {
        return userdao.getAllUser();
    }
    public void addUser(User user) throws Exception
    {
        userdao.addUser(user);
    }
    public void deleteUser(int id) throws Exception
    {
        userdao.deleteUser(id);
    }
    public void updateUser(User user) throws Exception
    {
        userdao.updateUser(user);
    }
    public User getIdUser(int id) throws Exception
    {
        return userdao.getIdUser(id);
    }
    public User getNameUser(String name) throws Exception
    {
        return userdao.getNameUser(name);
    }
    public List<User> searchAllUserByName(String name) throws Exception
    {
        return userdao.SearchAllUserByName(name);
    }
    public List<User> searchAllUserById(int id) throws Exception 
    {
        return userdao.SearchAllUserById(id);
    }
    public List<User> searchAllUserByPhone(String phone) throws Exception 
    {
        return userdao.SearchAllUserByPhone(phone);
    }
}


