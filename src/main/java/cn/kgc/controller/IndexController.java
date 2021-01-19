package cn.kgc.controller;

import cn.kgc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("getMessage")
    public String getMessage(Model model){
        model.addAttribute("message","<h1>hello thymeleaf</h1>");
        User user1=new User(1,"沈天畅","123456",new Date());
        User user2=new User(2,"罗振发","123456",new Date());
        User user3=new User(3,"张俊丽","123456",new Date());
        User user4=new User(4,"张家玮","123456",new Date());
        List<User> userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        User user5=new User(5,"浩南","123456",new Date());
        model.addAttribute("userList",userList);
        model.addAttribute("us",user5);

        return "main";
    }

    /*@RequestMapping(value = {"/","/index.html"})
    public String getIndex(){
        return "index";
    }*/



}
