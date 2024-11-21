package com.example.demorestapi.Service;

import com.example.demorestapi.Entity.User;

import java.util.List;

public interface UserService {
    User save(User user);
    List<User> findAll();
    User findById(int id);
    String deleteById(int id);
}
