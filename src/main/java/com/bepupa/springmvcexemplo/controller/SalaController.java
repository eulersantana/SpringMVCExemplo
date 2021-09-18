package com.bepupa.springmvcexemplo.controller;

import com.bepupa.springmvcexemplo.model.Estudante;
import com.bepupa.springmvcexemplo.model.FormEstudante;
import com.bepupa.springmvcexemplo.model.Sala;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static java.util.Objects.isNull;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping(value="/sala")
public class SalaController {
    private Sala sala1 = new Sala("1");
    private Sala sala2 = new Sala("2");


    @RequestMapping(value= "{sala}", method = GET)
    public ModelAndView sala(@PathVariable String sala, Model model){
        model.addAttribute("titulo", "Sala - " + sala);
        ModelAndView modelAndView =  new ModelAndView("sala/sala");

        if (sala.equals("1"))
            modelAndView.addObject("estudantes", sala1.getEstudantes());
        if (sala.equals("2"))
            modelAndView.addObject("estudantes", sala2.getEstudantes());

        model.addAttribute("form", new FormEstudante());
        modelAndView.addObject("sala", sala);
        return modelAndView;
    }

    @RequestMapping(value = { "add-estudante" } , method = POST)
    public ModelAndView recebeForm(@ModelAttribute("form") FormEstudante formEstudante, Model model){

        if (formEstudante.getNomeEstudante().isEmpty())
            model.addAttribute("msg", "O nome nao pode ser em branco.");
        else if(isNull(formEstudante.getNotaEstudante()))
            model.addAttribute("msg", "A nota nao pode ser em branco.");
        else{
            // Adicionando Aluno na sala
            addEstudante(formEstudante);
        }

        ModelAndView modelAndView =  new ModelAndView("redirect:"+formEstudante.getSalaNome());
        return modelAndView;
    }

    private void addEstudante(FormEstudante formEstudante){
        if(sala1.getNome().equals(formEstudante.getSalaNome())){
            sala1.getEstudantes().add(new Estudante(formEstudante.getNomeEstudante(), formEstudante.getNotaEstudante()));
        } else if (sala2.getNome().equals("2")){
            sala2.getEstudantes().add(new Estudante(formEstudante.getNomeEstudante(), formEstudante.getNotaEstudante()));
        }
    }
}
