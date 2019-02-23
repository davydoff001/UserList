/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.UserService;

/**
 *
 * @author Alexandr
 */
@Controller
@RequestMapping("/")
public class UserController {
    
    @Autowired
    public UserService userService;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    
    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }
    
    @GetMapping("/user/{id}")
    public String getByID(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getByID(id));
        return "showUser";
    }
    
    @GetMapping("/addUser")
    public String createUserPage(){
        return "createUser";
    }
    
    @PostMapping("/addUser")
    public String addUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    
    @PostMapping("/updateUser")
    public String updateUser(@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/user/"+user.getId();
    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id){
        userService.delete(id);
        return "redirect:/users";
    }
    
    @GetMapping("/update/{id}")
    public String updateUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user",userService.getByID(id));
        return "editUser";
    }
}
