package com.github.qiu121.controller;

import com.github.qiu121.entity.User;
import com.github.qiu121.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @ModelAttribute
    public void genderModel(Model model) {
        Map<Integer, String> genderMap = new HashMap<>();
        genderMap.put(0, "男");
        genderMap.put(1, "女");
        model.addAttribute("genderMap", genderMap);
    }

    @GetMapping("/login")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "/login.jsp";
    }

    @PostMapping("/login")
    public String login(User user) {
        System.out.println(user.toString());
        boolean login = userService.login(user.getId(), user.getPwd());
        if (login) {
            return "forward:/user/success";
        } else {
            return "/login.jsp";
        }
    }

    @RequestMapping("/success")
    public String success(Model model) {
        model.addAttribute("userList", userService.list());
        return "/success.jsp";
    }

    @GetMapping("/register")
    public String register(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "/register.jsp";
    }

    @PostMapping("/register")
    public String register(User user) {
        System.out.println(user.toString());
        boolean register = userService.register(user);
        if (register) {
            return "/login.jsp";
        }
        return "/register.jsp";
    }

}
