package com.main1.main1.service;

import com.main1.main1.models.Cinema;

import java.util.ArrayList;
import java.util.List;

public interface ICinemaService {
    public default List<Cinema> getCinema(){
        return new ArrayList<>();
    }

    public default Cinema addCinema(Cinema cinema){
        return null;
    }
}
