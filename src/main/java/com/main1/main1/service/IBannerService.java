package com.main1.main1.service;

import com.main1.main1.models.Banner;

import java.util.ArrayList;
import java.util.List;

public interface IBannerService {

    public default List<Banner> getBanners(){
        return new ArrayList<>();
    }

    public default Banner addBanner(Banner banner){
        return null;
    }
}
