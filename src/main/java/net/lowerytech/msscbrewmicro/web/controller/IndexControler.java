package net.lowerytech.msscbrewmicro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControler {

    @RequestMapping({"", "/",})
    public String getIndexPage(){
        System.out.println("Something to say....");
        return "index";
    }
}
