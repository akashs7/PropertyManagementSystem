package com.main1.main1.controller.admin;


import com.main1.main1.models.Bookings;
import com.main1.main1.service.IBookingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {

    private double rent;
    private int count;

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Autowired
    IBookingsService bookingsService;

    @GetMapping("/admindash")
    public ModelAndView getIndexPage(){
        List<Bookings> bookings = bookingsService.getBookings();
        double rent = 0.0;
        int count = 0;
        for (Bookings b: bookings){
            rent += b.getRent();
            count++;
        }
        AdminController report = new AdminController();
        report.setRent(rent);
        report.setCount(count);
        System.out.println(report.getCount()+" "+ report.getRent());
        ModelAndView mv =  new ModelAndView("admin/adminDash");
        mv.addObject("report", report);

        return mv;
    }
}
