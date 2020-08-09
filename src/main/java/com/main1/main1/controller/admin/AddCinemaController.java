package com.main1.main1.controller.admin;


import com.main1.main1.models.Cinema;
import com.main1.main1.service.ICinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddCinemaController {

    @Autowired
    ICinemaService cinemaService;

    @GetMapping("/addcinema")
    public ModelAndView showRegisterPage(){
        ModelAndView mv = new ModelAndView("admin/addCinema");
        Cinema cinema = new Cinema();
        mv.addObject("cinema", cinema);

        return mv;
    }

    @PostMapping("/addcinema")
    public ModelAndView addCinema(@ModelAttribute("cinema") Cinema cinema){
        cinemaService.addCinema(cinema);
        ModelAndView mv = new ModelAndView("redirect:/admin");

        return mv;
    }
}
