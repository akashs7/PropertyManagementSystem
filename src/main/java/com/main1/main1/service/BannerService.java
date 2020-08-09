package com.main1.main1.service;

import com.main1.main1.models.Banner;
import com.main1.main1.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BannerService implements IBannerService {

    @Autowired
    BannerRepository bannerRepo;

    @Override
    public List<Banner> getBanners(){
        List<Banner> banners = new ArrayList<>();
        Iterable<Banner> itr = bannerRepo.findAll();

        if (itr != null)
            for (Banner b: itr)
                banners.add(b);


        return banners;
    }

    @Override
    public Banner addBanner(Banner banner){
        return bannerRepo.save(banner);
    }
}
