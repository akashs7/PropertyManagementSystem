package com.main1.main1.service;

import com.main1.main1.models.Complaint;
import com.main1.main1.repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("complaintService")
public class ComplaintService implements IComplaintService {

    @Autowired
    ComplaintRepository complaintRepo;

    @Override
    public List<Complaint> getComplaint(){
        List<Complaint> complaint = new ArrayList<>();
        Iterable<Complaint> itr = complaintRepo.findAll();
        if (itr != null)
            for (Complaint c: itr)
                complaint.add(c);

        return complaint;
    }

    @Override
    public Complaint addComplaint(Complaint complaint){
        return complaintRepo.save(complaint);
    }
}
