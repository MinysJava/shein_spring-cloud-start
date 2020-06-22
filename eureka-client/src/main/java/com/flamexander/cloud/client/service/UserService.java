package com.flamexander.cloud.client.service;

import com.flamexander.cloud.client.entites.User;



public interface UserService  {
    User findByUserName(String username);

}
