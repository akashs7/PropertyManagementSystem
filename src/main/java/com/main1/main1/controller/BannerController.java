package com.main1.main1.controller;

import com.main1.main1.models.Banner;
import com.main1.main1.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BannerController {

    @Autowired
    IBannerService bannerService;

    @GetMapping("/banners")
    public ModelAndView getBannerDetails() {
        List<Banner> bannerList = bannerService.getBanners();
        ModelAndView mv = new ModelAndView("app/banners");
        mv.addObject("banners", bannerList);

        return mv;
    }
}