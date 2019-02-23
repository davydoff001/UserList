/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.util.List;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alexandr
 */
@Repository
public class UserDaoImpl implements UserDao{

    public final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public List<User> findAll() {
        String sql = "Select * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void saveUser(User user) {
        String sql = "INSERT INTO user (name, email, age) VALUES (?,?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge());
    }

    @Override
    public User getByID(int ID) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(),ID);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(),user.getAge(),user.getId());
    }

    @Override
    public void delete(int ID) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql,ID);
    }
    
}
