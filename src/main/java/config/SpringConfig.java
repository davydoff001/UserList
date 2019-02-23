/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import dao.UserDao;
import dao.UserDaoImpl;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import service.UserService;
import service.UserServiceImpl;

/**
 *
 * @author Alexandr
 */
@Configuration
@ComponentScan(basePackages={"service","dao"})
public class SpringConfig {
       
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
    
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/vebinar?UseSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("magnum385");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
       
}
