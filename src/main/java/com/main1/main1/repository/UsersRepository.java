package com.main1.main1.repository;

import com.main1.main1.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UsersRepository extends CrudRepository<Users, Long> {
}
