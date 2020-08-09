package com.main1.main1.controller;

import com.main1.main1.models.Bookings;
import com.main1.main1.models.Complaint;
import com.main1.main1.models.Users;
import com.main1.main1.service.IBookingsService;
import com.main1.main1.service.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class AppController {

    @Autowired
    IComplaintService complaintService;
    @Autowired
    IBookingsService bookingsService;


    @GetMapping("/")
    public ModelAndView getIndexPage(){
        return new ModelAndView("index");
    }
    @GetMapping("/error")
    public ModelAndView getErrorPage() {
        return new ModelAndView("error");
    }

    @GetMapping("/loginuser")
    public ModelAndView getUserLoginPage() {
        Users user = new Users();
        ModelAndView mv = new ModelAndView("loginUser");
        mv.addObject("users", user);

        return mv;
    }

    @GetMapping("/loginadmin")
    public ModelAndView getAdminLoginPage() {
        Users user = new Users();
        ModelAndView mv = new ModelAndView("loginUser");
        mv.addObject("users", user);

        return mv;
    }


    @PostMapping("/login")
    public ModelAndView showWelcomePage(@ModelAttribute("user") Users user){
        String username = user.getUsername();
        String pwd = user.getPassword();
        System.out.println(username+" "+pwd);
        if (username.equals("admin") && pwd.equals("admin"))
            return new ModelAndView("redirect:/admindash");
        else if (username.equals("akashs7") && pwd.equals("abcd"))
            return new ModelAndView("redirect:/welcome");
        else
            return new ModelAndView("/error");
    }



    @GetMapping("/welcome")
    public ModelAndView getWelcomePage(){
        List<Complaint> complaints = complaintService.getComplaint();
        List<Bookings> bookings = bookingsService.getBookings();
        ModelAndView mv = new ModelAndView("app/dashboard");

        mv.addObject("complaints", complaints);
        mv.addObject("bookings", bookings);
        return mv;
    }

}
