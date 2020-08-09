package com.main1.main1.controller;

import com.main1.main1.models.Complaint;
import com.main1.main1.service.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;



@Controller
public class AddComplaint {

    @Autowired
    IComplaintService complaintService;

    @GetMapping("/addcomplaint")
    public ModelAndView showComplaintPage(){
        ModelAndView mv = new ModelAndView("app/addComplaint");
        Complaint complaint = new Complaint();
        mv.addObject("complaint", complaint);

        return mv;
    }

    @PostMapping("/addcomplaint")
    public ModelAndView addComplaint(@ModelAttribute("complaint") Complaint complaint){
        System.out.println(complaint.getDate());
        long millis=System.currentTimeMillis();
        Date d = new Date(millis);
        complaint.setDate(d);
        complaintService.addComplaint(complaint);
        ModelAndView mv = new ModelAndView("redirect:/success");

        return mv;
    }
}
