package com.main1.main1.service;

import com.main1.main1.models.Atrium;
import com.main1.main1.repository.AtriumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("atriumService")
public class AtriumService implements IAtriumService {

    @Autowired
    AtriumRepository atriumRepo;

    @Override
    public List<Atrium> getAllAtriums(){
        List<Atrium> atrium = new ArrayList<>();
        Iterable<Atrium> a = atriumRepo.findAll();
        if (a != null)
            for (Atrium atr: a)
                atrium.add(atr);

        return atrium;
    }

    @Override
    public Atrium addAtrium(Atrium atrium){
        return atriumRepo.save(atrium);
    }
}
