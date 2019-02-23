/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alexandr
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserDao userDao;
    
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user){
        //if (user.getName().length()<3) {
            //throw new Exception();
        //}
        userDao.saveUser(user);
    }

    @Override
    public User getByID(int ID) {
        return userDao.getByID(ID);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(int ID) {
        userDao.delete(ID);
    }
    
}
