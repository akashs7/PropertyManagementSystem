package com.main1.main1.service;

import com.main1.main1.models.Cinema;
import com.main1.main1.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("cinemaService")
public class CinemaService implements ICinemaService {

    @Autowired
    CinemaRepository cinemaRepo;

    @Override
    public List<Cinema> getCinema(){
        List<Cinema> cinema = new ArrayList<>();
        Iterable<Cinema> itr = cinemaRepo.findAll();
        if (itr != null)
            for (Cinema c: itr)
                cinema.add(c);

        return cinema;
    }

    @Override
    public Cinema addCinema(Cinema cinema){
        return cinemaRepo.save(cinema);
    }
}
