package com.main1.main1.controller;

import com.main1.main1.models.Atrium;
import com.main1.main1.service.IAtriumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AtriumController {

    @Autowired
    IAtriumService atriumService;

    @GetMapping("/atriums")
    public ModelAndView getAtriumDetailsPge(){
        List<Atrium> atriumList = atriumService.getAllAtriums();
        ModelAndView mv = new ModelAndView("app/atriums");
        mv.addObject("atriums", atriumList);

        return mv;
    }

}
