package com.bepupa.springmvcexemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value= "", method = GET)
    public ModelAndView index(Model model){
        model.addAttribute("titulo", "Escola Bebupa");
        List<String> salas = new ArrayList<String>(){{add("1"); add("2");}};
        ModelAndView modelAndView =  new ModelAndView("index");
        modelAndView.addObject("salas", salas);
        return modelAndView;
    }

}
