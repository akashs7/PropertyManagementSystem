package com.main1.main1.service;

import com.main1.main1.models.Complaint;

import java.util.ArrayList;
import java.util.List;

public interface IComplaintService {

    public default List<Complaint> getComplaint(){
        return new ArrayList<>();
    }

    public default Complaint addComplaint(Complaint cinema){
        return null;
    }
}
