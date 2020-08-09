package com.main1.main1.controller;

import com.main1.main1.models.Bookings;
import com.main1.main1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.*;


@Controller
public class BookingsController {

    @Autowired
    IBookingsService bookingsService;

    @GetMapping("/showbookings")
    public ModelAndView showCurrentBookings(){
        List<Bookings> bookings = bookingsService.getBookings();
        ModelAndView mv = new ModelAndView("admin/showbookings");
        mv.addObject("bookings", bookings);

        return mv;
    }

    @GetMapping("/addbooking")
    public ModelAndView showBookingsPage(){
        ModelAndView mv = new ModelAndView("app/booking");
        Bookings booking = new Bookings();
        mv.addObject("booking", booking);

        return mv;
    }

    @PostMapping("/addbooking")
    public ModelAndView saveBooking(@ModelAttribute("booking") Bookings booking){


        System.out.println(booking.getUsername());
        System.out.println(booking.getProperty());
        System.out.println(booking.getStartday());
        System.out.println(booking.getEndday());

        String property = booking.getProperty();

        Date date1 = booking.getStartday();
        Date date2 = booking.getEndday();
        double rate = 0.0;
        final long DAY_IN_MILLIS = 1000 * 60 * 60 * 24;
        int numDays = Math.abs((int) ((date1.getTime() - date2.getTime())/ DAY_IN_MILLIS ));
        if (property.equals("Small"))
            rate = 1000.0 * numDays;
        else if (property.equals("Medium"))
            rate = 1250.0 * numDays;
        else if (property.equals("Large"))
            rate = 3000.0 * numDays;
        else if (property.equals("NorthWest"))
            rate = 1000.0*24*numDays;
        else if (property.equals("South"))
            rate = 1500.0*24*numDays;
        else if (property.equals("Cinema")) {
            numDays = numDays/7;
            numDays = (numDays == 0) ? 1 : numDays;
            rate = 100000.0 * numDays;
        }
        else if (property.equals("Banner"))
            rate = 2500.0 * numDays;

        booking.setRent(rate);
        bookingsService.addBooking(booking);
        ModelAndView mv = new ModelAndView("redirect:/success");

        return mv;
    }

}
