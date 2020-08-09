package com.main1.main1.service;

import com.main1.main1.models.Users;
import com.main1.main1.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UsersService implements IUsersService {

    @Autowired
    UsersRepository usersRepo;

    @Override
    public List<Users> getAllUsers() {
        List<Users> usersList = new ArrayList<>();
        Iterable<Users> itr = usersRepo.findAll();
        if (itr != null) {
            for (Users u : itr)
                usersList.add(u);
        }

        return usersList;
    }

    @Override
    public Users addUsers(Users users) {
        return usersRepo.save(users);
    }
}
