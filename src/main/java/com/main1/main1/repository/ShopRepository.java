package com.main1.main1.repository;

import com.main1.main1.models.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ShopRepository extends CrudRepository<Shop, Long> {
}

