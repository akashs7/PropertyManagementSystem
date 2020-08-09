package com.main1.main1.controller.admin;

import com.main1.main1.models.Shop;
import com.main1.main1.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddShopController {

    @Autowired
    IShopService shopService;

    @GetMapping("/addshop")
    public ModelAndView showRegisterPage(){
        ModelAndView mv = new ModelAndView("admin/addShop");
        Shop shop = new Shop();
        mv.addObject("shop", shop);

        return mv;
    }

    @PostMapping("/addshop")
    public ModelAndView addShop(@ModelAttribute("shop") Shop shop){
        System.out.println(shop.getShopType());

        shopService.addShop(shop);
        ModelAndView mv = new ModelAndView("redirect:/admin");

        return mv;
    }
}
