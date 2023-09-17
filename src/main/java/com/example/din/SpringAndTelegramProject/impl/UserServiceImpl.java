package com.example.din.SpringAndTelegramProject.impl;

import com.example.din.SpringAndTelegramProject.Entities.User;
import com.example.din.SpringAndTelegramProject.repositories.UserRepositories;
import com.example.din.SpringAndTelegramProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;
    @Override
    public List<User> getUsers() {
        return this.userRepositories.findAll();
    }
}
