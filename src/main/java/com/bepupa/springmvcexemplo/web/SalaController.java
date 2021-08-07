package com.bepupa.springmvcexemplo.web;

import com.bepupa.springmvcexemplo.model.Estudante;
import com.bepupa.springmvcexemplo.model.FormEstudante;
import com.bepupa.springmvcexemplo.model.Sala;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("/sala")
public class SalaController {
    private Sala sala1 = new Sala("1");
    private Sala sala2 = new Sala("2");


    @RequestMapping(value= "{id}", method = GET)
    public ModelAndView sala(@PathVariable String id, Model model){

        ModelAndView modelAndView =  new ModelAndView("sala/sala");
        if (id.equals("1"))
            modelAndView.addObject("estudantes", sala1.getEstudantes());
        if (id.equals("2"))
            modelAndView.addObject("estudantes", sala2.getEstudantes());
        model.addAttribute("form", new FormEstudante());
        modelAndView.addObject("sala", id);
        return modelAndView;
    }

    @RequestMapping(value = { "add-estudante" } , method = POST)
    public ModelAndView recebeForm(@ModelAttribute("form") FormEstudante formEstudante, Model model){
//        model.addAttribute("msg", "Você enviou: " + form.getNome() + " " + form.getSobrenome() );
        ModelAndView modelAndView =  new ModelAndView("redirect:"+formEstudante.getSalaNome());
        addEstudante(formEstudante);
        if (formEstudante.getSalaNome().equals("1"))
            modelAndView.addObject("estudantes", sala1.getEstudantes());
        if (formEstudante.getSalaNome().equals("2"))
            modelAndView.addObject("estudantes", sala2.getEstudantes());
        model.addAttribute("form", new FormEstudante());
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
