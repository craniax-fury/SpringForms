package com.insignia.SpringFormTag.controller;


import com.insignia.SpringFormTag.entities.Form;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.validation.Valid;

@Controller
public class HomeController extends HttpServlet {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

    @RequestMapping("/")
    public String login(Model model){
        model.addAttribute("form",new Form());
        return "form";
    }

    @RequestMapping("/process")
    public String process(@Valid @ModelAttribute("form") Form form,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "form";
        }
        return "success";
    }
}