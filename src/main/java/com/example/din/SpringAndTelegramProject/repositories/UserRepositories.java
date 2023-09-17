package com.example.din.SpringAndTelegramProject.repositories;

import com.example.din.SpringAndTelegramProject.Entities.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface UserRepositories extends JpaRepository<User,Long> {

    @Override
    List<User> findAll();
}
