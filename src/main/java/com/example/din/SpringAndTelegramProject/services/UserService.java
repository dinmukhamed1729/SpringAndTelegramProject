package com.example.din.SpringAndTelegramProject.services;

import com.example.din.SpringAndTelegramProject.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
