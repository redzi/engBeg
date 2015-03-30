package com.freemarker.demo;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FController
{
    private Set<User> userSet;


    public FController()
    {
        userSet = new HashSet<>();
        System.out.println("controller is being initialized");
        userSet.add(new User("Tomek", "Kuku"));
        userSet.add(new User("Kasia", "Cicha"));
        userSet.add(new User("Bobek", "Kot"));
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String listGet(Model model)
    {
        model.addAttribute("users", userSet);
        return ("index");
    }

    @RequestMapping(value="/list", method = RequestMethod.POST)
    public String listPost(Model model, User user)
    {
        userSet.add(user);
        model.addAttribute("users", userSet);
        return ("index");
    }
}
