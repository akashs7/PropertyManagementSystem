package com.main1.main1.service;

import com.main1.main1.models.Shop;
import com.main1.main1.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("shopService")
public class ShopService implements IShopService {

    @Autowired
    ShopRepository shopRepo;

    @Override
    public List<Shop> getAllShops(){
        List<Shop> shops = new ArrayList<>();
        Iterable<Shop> itr = shopRepo.findAll();
        if (itr != null) {
            for (Shop s : itr)
                shops.add(s);
        }

        return shops;
    }

    @Override
    public Shop addShop(Shop shop){
        System.out.println(shop.getShopType());
        return shopRepo.save(shop);
    }


}
