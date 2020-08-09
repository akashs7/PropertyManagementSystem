package com.main1.main1.service;

import com.main1.main1.models.Users;

import java.util.ArrayList;
import java.util.List;

public interface IUsersService {
    public default List<Users> getAllUsers(){
        return new ArrayList<>();
    }

    public default Users addUsers(Users users){
        return null;
    }
}
