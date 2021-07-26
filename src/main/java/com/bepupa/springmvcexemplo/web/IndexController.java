package com.bepupa.springmvcexemplo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value= "sala1", method = GET)
    public String sala1(){
        return "index";
    }
}
