package com.main1.main1.controller.admin;


import com.main1.main1.models.Banner;
import com.main1.main1.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddBannerController {

    @Autowired
    IBannerService bannerService;

    @GetMapping("/addbanner")
    public ModelAndView showRegisterPage(){
        ModelAndView mv = new ModelAndView("admin/addBanner");
        Banner banner = new Banner();
        mv.addObject("banner", banner);

        return mv;
    }

    @PostMapping("/addbanner")
    public ModelAndView addBanner(@ModelAttribute("banner") Banner banner){
        bannerService.addBanner(banner);
        ModelAndView mv = new ModelAndView("redirect:/admin");

        return mv;
    }
}
