package com.main1.main1.controller;


import com.main1.main1.models.Shop;
import com.main1.main1.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ShopsController {

    @Autowired
    IShopService shopService;

    @RequestMapping("/shops")
    public String showShopsPage() {
        return "allShops";
    }

    @GetMapping("/shops")
    public ModelAndView getALlShopDetailsPage(){
        List<Shop> shopList = shopService.getAllShops();

        ModelAndView mv = new ModelAndView("app/allShops");
        mv.addObject("shops", shopList);

        return mv;
    }

}
