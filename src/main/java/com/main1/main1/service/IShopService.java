package com.main1.main1.service;

import com.main1.main1.models.Shop;

import java.util.ArrayList;
import java.util.List;

public interface IShopService {

    public default List<Shop> getAllShops(){
        return new ArrayList<>();
    }

    public default Shop addShop(Shop shop){
        return null;
    }
}


