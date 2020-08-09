package com.main1.main1.controller;


import com.main1.main1.models.Cinema;
import com.main1.main1.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CinemaController {

    @Autowired
    ICinemaService cinemaService;

    @GetMapping("/cinema")
    public ModelAndView getCinemaDetails(){
        List<Cinema> cineList = cinemaService.getCinema();
        ModelAndView mv = new ModelAndView("app/cinema");
        mv.addObject("cinema", cineList);

        return mv;
    }

}
