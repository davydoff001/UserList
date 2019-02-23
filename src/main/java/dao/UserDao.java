/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.util.List;

/**
 *
 * @author Alexandr
 */
public interface UserDao {
    
    void saveUser(User user);
    
    User getByID(int ID);
    
    List<User> findAll();
    
    void update(User user);
    
    void delete(int ID);
    
}
