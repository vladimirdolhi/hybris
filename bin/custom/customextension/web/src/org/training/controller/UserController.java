package org.training.controller;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserController{
    @Resource
    private UserService userService;

    @GetMapping("/user")
    public String showUser(@RequestParam(required = false) String uid, Model model) {
        UserModel user;
        if (uid == null) {
            user = userService.getCurrentUser();
        } else {
            user = userService.getUserForUID(uid);
        }
        model.addAttribute("user", user);
        return "user";
    }

}
