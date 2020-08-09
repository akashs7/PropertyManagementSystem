package com.main1.main1.controller.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminDashController {

    @GetMapping("/admin")
    public ModelAndView showDashPage(){
        ModelAndView mv = new ModelAndView("admin/index");
        return mv;
    }
}
