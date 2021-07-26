package com.bepupa.springmvcexemplo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/sala1")
public class IndexController {

    @RequestMapping(method = GET)
    public String index(){
        return "index";
    }
}
