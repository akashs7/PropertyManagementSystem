package com.main1.main1.controller.admin;


import com.main1.main1.models.Atrium;
import com.main1.main1.service.IAtriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddAtriumController {

    @Autowired
    IAtriumService atriumService;

    @GetMapping("/addatrium")
    public ModelAndView showRegisterPage(){
        ModelAndView mv = new ModelAndView("admin/addAtrium");
        Atrium atrium = new Atrium();
        mv.addObject("atrium", atrium);

        return mv;
    }

    @PostMapping("/addatrium")
    public ModelAndView addAtrium(@ModelAttribute("atrium") Atrium atrium){
        atriumService.addAtrium(atrium);
        ModelAndView mv = new ModelAndView("redirect:/admin");

        return mv;
    }

}
