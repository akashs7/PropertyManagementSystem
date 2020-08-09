package com.main1.main1.repository;

import com.main1.main1.models.Banner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface BannerRepository extends CrudRepository<Banner, Long> {
}
