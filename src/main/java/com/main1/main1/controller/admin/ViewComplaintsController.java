package com.main1.main1.controller.admin;


import com.main1.main1.models.Complaint;
import com.main1.main1.service.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ViewComplaintsController {

    @Autowired
    IComplaintService complaintService;

    @GetMapping("/viewcomplaints")
    public ModelAndView getAllComplaints(){
        List<Complaint> complaints = complaintService.getComplaint();
        ModelAndView mv = new ModelAndView("admin/viewComplaints");
        mv.addObject("complaints", complaints);

        return mv;
    }

    @GetMapping("/success")
    public ModelAndView showSuccessPage(){
        return new ModelAndView("/success");
    }
}
