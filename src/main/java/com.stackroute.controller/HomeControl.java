package com.stackroute.controller;

import com.stackroute.domain.UserClass;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControl {


    @RequestMapping(value ="/")
    public String entry()
    {

        return "login";
    }
    @RequestMapping(value ="/helloworld",method = RequestMethod.GET)
    public String land(@ModelAttribute("mi5") UserClass userClassObj, ModelMap mapObj)
    {

        mapObj.addAttribute("tomCruise",userClassObj.getName());
        return "index";
    }

}
