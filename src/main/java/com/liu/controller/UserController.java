package com.liu.controller;

import com.liu.domain.User;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/findAll")
    public String findAll(Model model){
        System.out.println("findAll执行了.....");
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "showAll";
    };

    @GetMapping("/save")
    public String save(User user){
        System.out.println("save执行了......");
        User user1 = new User();
        user1.setAge(17);
        user1.setId("3");
        user1.setName("嚣张");
        user1.setBir(new Date());
        userService.save(user1);
        return "redirect:/user/findAll" ;

    };

}
