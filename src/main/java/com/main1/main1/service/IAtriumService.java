package com.main1.main1.service;

import com.main1.main1.models.Atrium;

import java.util.ArrayList;
import java.util.List;

public interface IAtriumService {

    public default List<Atrium> getAllAtriums(){
        return new ArrayList<>();
    }

    public default Atrium addAtrium(Atrium atrium){
        return null;
    }
}
